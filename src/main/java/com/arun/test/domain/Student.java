package com.arun.test.domain;
/**
 *  @author Arunraja
 *  @Class	Student
 */
import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@EqualsAndHashCode
@Entity(name = "Student")
public class Student implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "birth_date")
	private LocalDate dateOfBirth ;
}
