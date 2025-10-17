package Codify.repository;

import Codify.domain.Users;
import Codify.dto.response.data.UserDataDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<Users, UUID> {

    UserDataDto findByUserUuid(UUID userUuid);
}