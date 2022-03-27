package com.gl.studentapp.service;

import java.util.List;



import com.gl.studentapp.entity.*;


public interface StudentService {
	public List<Student> findAll();

	public Student findById(int theId);

	public void save(Student theBook);

	public void deleteById(int theId);
	

}