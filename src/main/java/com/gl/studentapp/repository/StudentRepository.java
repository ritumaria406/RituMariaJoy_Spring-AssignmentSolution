package com.gl.studentapp.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.studentapp.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	
}