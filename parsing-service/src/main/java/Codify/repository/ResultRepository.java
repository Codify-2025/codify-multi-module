package Codify.repository;

import Codify.domain.Result;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ResultRepository extends MongoRepository<Result, String> {

    Optional<Result> findBySubmissionId(Integer submissionId);
}
