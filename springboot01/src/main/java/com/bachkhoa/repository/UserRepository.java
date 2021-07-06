package com.bachkhoa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bachkhoa.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	User findByEmail(String email);

	@Query(value = "SELECT * FROM user u WHERE u.user_name = :userName", nativeQuery = true)
	User findByUserName(@Param("userName") String userName);
}
