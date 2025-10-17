package Codify.repository;

import Codify.domain.Subjects;
import Codify.dto.dashboard.response.data.SubjectDataDto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface SubjectRepository extends JpaRepository<Subjects, Long> {
    List<SubjectDataDto> findByUserUuid(UUID userUuid);
}
