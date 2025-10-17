package Codify.repository;

import Codify.domain.Codeline;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CodelineRepository extends JpaRepository<Codeline, Long> {
    List<Codeline> findByResultIdAndStudentId(Long resultId, Long studentId);
}
