package com.gl.studentapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gl.studentapp.entity.*;

public interface UserRepository extends JpaRepository<User,Long> {
	
	// Spring data jpa query - jpql
    @Query("SELECT u FROM User u WHERE u.username = ?1")
    public User getUserByUsername(String username);
}
 