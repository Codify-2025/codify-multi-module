package Codify.service;

import Codify.domain.Assignment;
import Codify.domain.Subjects;
import Codify.dto.AssignmentRequestDto;
import Codify.exception.assignment.AssignmentAlreadyExistsException;
import Codify.exception.assignment.InvalidAssignmentNameException;
import Codify.exception.assignment.InvalidDateRangeException;
import Codify.exception.subject.SubjectNotFoundException;
import Codify.exception.user.UnauthenticatedException;
import Codify.exception.user.UserNotFoundException;
import Codify.repository.AssignmentRepository;
import Codify.repository.SubjectRepository;
import Codify.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;
import java.sql.Timestamp;



@Service
@RequiredArgsConstructor
public class AssignmentService {
    private final AssignmentRepository assignmentRepository;
    private final SubjectRepository subjectRepository;
    private final UserRepository userRepository;

    @Transactional
    public Long createAssignment(UUID userUuid, Long subjectId, AssignmentRequestDto requestDto) {

        if (userUuid == null) {
            throw new UnauthenticatedException();
        }
        if (!userRepository.existsById(userUuid)) {
            throw new UserNotFoundException();
        }

        final Subjects subject = subjectRepository.findBySubjectIdAndUserUuid(subjectId, userUuid)
                .orElseThrow(SubjectNotFoundException::new);

        // 입력 검증
        final String assignmentName = normalizeAssignment(requestDto.getAssignmentName());
        // 기간 검증
        final LocalDate startD = requestDto.getStartDate();
        LocalDate endD = requestDto.getEndDate();
        // 자동 설정
        if (endD == null) {
            endD = startD.plusDays(7);
        }

        if (endD.isBefore(startD)) {
            throw new InvalidDateRangeException();
        }

        final LocalDateTime start = startD.atStartOfDay();      // 시간대 자동 설정: 00:00:00
        final LocalDateTime end   = endD.atTime(23, 59, 59);    // 시간대 자동 설정: 23:59:59

        // 중복 과제명 방지
        if (assignmentRepository.existsByUserUuidAndSubjectIdAndAssignmentName(
                userUuid, subjectId, assignmentName)) {
            throw new AssignmentAlreadyExistsException();
        }

        final Timestamp startTS = Timestamp.valueOf(start);
        final Timestamp endTS   = Timestamp.valueOf(end);

        // 주차/기간 설정
        final Assignment assignment = Assignment.builder()
                .userUuid(userUuid)
                .subjectId(subjectId)
                .assignmentName(assignmentName)
                .startDate(startTS)
                .endDate(endTS)
                .week(requestDto.getWeek())
                .build();

        return assignmentRepository.save(assignment).getAssignmentId();
    }

    private String normalizeAssignment(String s) {
        if (s == null || s.trim().isEmpty()) throw new InvalidAssignmentNameException();
        return s.trim();
    }
}
