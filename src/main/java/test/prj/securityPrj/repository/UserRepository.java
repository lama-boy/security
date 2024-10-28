package test.prj.securityPrj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import test.prj.securityPrj.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer>{
    
    @Query("SELECT count(u) FROM UserEntity u WHERE u.user_id = ?1")
    Boolean userIdVerification(String user_id);

    @Query("SELECT u FROM UserEntity u WHERE u.user_id = ?1")
    UserEntity findByUserId(String user_id);

}