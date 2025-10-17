package Codify.repository;

import Codify.domain.ProcessingGroup;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface ProcessingRepository extends MongoRepository<ProcessingGroup, String> {

    @Query("{'assignmentId': ?0, 'status': 'PROCESSING'}")
    Optional<ProcessingGroup> findGroupByAssignmentId(Long assignmentId);

}