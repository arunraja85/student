package com.arun.test.service;
/**
 * 
 * 	@author Arunraja
 *  @Class  StudentService
 */

import java.util.List;

import com.arun.test.domain.Student;

public interface StudentService {

	public List<Student> getStudent(String name);
	
	public Long saveStudent(Student student);

}