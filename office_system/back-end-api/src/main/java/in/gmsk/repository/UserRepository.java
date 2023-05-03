package in.gmsk.repository;

import in.gmsk.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository< UserEntity, Integer > {

    List<UserEntity> findByUserName(String userName);
}
