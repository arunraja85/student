package com.arun.test.repository;

/**
 *  @author Arunraja
 *  @Class	StudentRepository
 */

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.arun.test.domain.Student;

@Repository
@Transactional
public interface StudentRepository extends JpaRepository<Student, Long> {

	Optional<Student> findById(Long id);
	
	Optional<List<Student>> findById(String name);
}
