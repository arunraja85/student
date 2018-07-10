package com.arun.test.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.arun.test.domain.Student;
import com.arun.test.repository.StudentRepository;
import com.arun.test.service.StudentService;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * 	@author Arunraja
 *  @Class  StudentServiceImpl
 */

@Service
@Slf4j
public class StudentServiceImpl implements StudentService {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public List<Student> getStudent(String name) {
		Optional<List<Student>> studentOptional = studentRepository.findById(name);
		if(studentOptional.isPresent()) {
			return studentOptional.get();
		}
		return new ArrayList();
			
	}

	@Override
	public Long saveStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}
}

