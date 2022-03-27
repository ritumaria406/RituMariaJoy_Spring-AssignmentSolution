package com.gl.studentapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.studentapp.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	//List<Student> findByNameContainsAndAuthorContainsAllIgnoreCase(String name,String author);
	
}