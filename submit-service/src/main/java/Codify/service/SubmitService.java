package Codify.service;

import Codify.domain.Submission;
import Codify.dto.SubmissionDto;
import Codify.repository.SubmissionRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class SubmitService {
    private final SubmissionRepository submissionRepository;
    private final ProcessingService processingService;

    @Transactional
    public void saveUpload(SubmissionDto dto) {
        final Submission submission = Submission.builder()
                .assignmentId(dto.getAssignmentId())
                .fileName(dto.getFileName())
                .week(dto.getWeek())
                .submissionDate(LocalDateTime.now())
                .studentId(dto.getStudentId())
                .studentName(dto.getStudentName())
                .s3Key(dto.getS3Key())
                .build();

        submissionRepository.save(submission);

        boolean isLastFile = dto.getIsLastFile();

        //마지막 파일이 아니라면
        if (!isLastFile) {
            processingService.addFileUploadToGroup
                    (submission.getAssignmentId(),submission.getSubmissionId(),submission.getStudentId(), submission.getS3Key());
        } else {
            //마지막 파일이라면
            processingService.addLastFileToGroup
                    (submission.getAssignmentId(), submission.getSubmissionId(), submission.getStudentId(), submission.getS3Key());
        }

    }

}
