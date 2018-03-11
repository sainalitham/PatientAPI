package com.test.specialty.patient.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.specialty.patient.model.Patient;
import com.test.specialty.patient.service.PatientService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "Patient API")
public class PatientController {
	
	@Autowired
	PatientService patientService;
	
	static Logger log = LogManager.getLogger(PatientController.class.getName());

	
	@RequestMapping(value = "v1/patient" , method = RequestMethod.GET)
	@ApiOperation(value="Get Patient details with Patient Id")
	public Patient getPatientDetails(@RequestParam(value = "patient-id", required = true) Long patientId) {
		log.info("Method: getPatiantDetails()");
		Patient patient = patientService.getPatientDetails(patientId);
		return patient;
	}
	
	@RequestMapping(value = "v1/patient", method = RequestMethod.POST)
	@ApiOperation(value="Create Patient details")
	public ResponseEntity<?> postPatientDetails(@RequestBody Patient patientDetails){
		log.info("Method: postPatiantDetails()");
		return new ResponseEntity<>("Patient Created",HttpStatus.CREATED);
	}
	
	@RequestMapping(value="v1/patient", method = RequestMethod.PUT)
	@ApiOperation(value="Update Patient details")
	public ResponseEntity<?> putPatientDetails(@RequestBody Patient patientDetails) {
		log.info("Method: putPatiantDetails()");
		return new ResponseEntity<>("Patient Updated", HttpStatus.OK);
	}

	@RequestMapping(value = "v1/patient", method = RequestMethod.DELETE)
	@ApiOperation(value="Delete Patient details")
	public ResponseEntity<?> deletePatientDetails(@RequestParam(value = "patient-id" , required = true) Long patientId) {
		log.info("Method: deletePatiantDetails()");
		return new ResponseEntity<>("Patient Deleted", HttpStatus.OK);
	}

}
