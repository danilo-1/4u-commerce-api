package com.u.commerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.u.commerce.model.User;

public interface UserRepository extends JpaRepository<User, Long>, CrudRepository<User, Long> {

	User findById(long id);

	@Query(value = "select u.id, u.name, u.email, u.password from \"user\" u where u.email = :userEmail and u.\"password\" = :userPassword", nativeQuery = true)
	User login(@Param("userEmail") String email, @Param("userPassword") String password);
}
