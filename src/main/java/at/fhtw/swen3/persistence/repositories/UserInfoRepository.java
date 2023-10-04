package at.fhtw.swen3.persistence.repositories;

import at.fhtw.swen3.persistence.entities.UserInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoRepository extends JpaRepository<UserInfoEntity, Long> {
}
