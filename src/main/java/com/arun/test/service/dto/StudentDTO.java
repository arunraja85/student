package com.arun.test.service.dto;

import java.io.Serializable;
import java.time.LocalDate;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * A DTO for the Student entity.
 * 
 * 
 * 	@author Arunraja
 *  @Class  StudentDTO
 */
@Getter
@Setter
public class StudentDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotNull
	private Long id;

	@NotNull
	private String name;

	private LocalDate dateOfBirth;

}
