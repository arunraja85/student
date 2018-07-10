package com.arun.test.rest;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.arun.test.domain.Student;
import com.arun.test.service.dto.FlowResultCriteria;
import com.arun.test.service.dto.FlowSearchCriteriaRequest;
import com.arun.test.service.dto.SortPairAlertDTO;
import com.arun.test.service.dto.SortPairDTO;
import com.arun.test.util.FlowPlanConstants;
import com.arun.test.util.PaginationUtil;
import com.arun.test.util.SortPairMappingUtil;
import com.ups.ttg.npt.tsnm.flow.domain.ICStatusResponse;

import lombok.extern.slf4j.Slf4j;

/**
 *  @author Arunraja
 *  @Class	StudentResource
 */
@RestController
@RequestMapping(StudentConstants.GLOBAL_CONTEXT_PATH)
@Slf4j
public class StudentResource {

	@Autowired
	private StudentService studentService;

	
	@GetMapping(StudentConstants.GET_STUDENT)
	public ResponseEntity<List<Student>> getAllStudent(@RequestParam String name) {
		log.debug("REST request to get all students");
		List<Student> students = studentService.getStudent(name);
		return new ResponseEntity<>(students, HttpStatus.OK);
	}
}
