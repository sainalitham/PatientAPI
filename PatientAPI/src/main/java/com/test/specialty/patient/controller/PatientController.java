package com.test.specialty.patient.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.specialty.patient.model.Patient;

public class PatientController {
	
	@RequestMapping(value = "v1/patient" , method = RequestMethod.GET)
	public Patient getPatientDetails(@RequestParam(value = "patient-id", required = true) Long patientId) {
		return null;
	}
	
	@RequestMapping(value = "v1/patient", method = RequestMethod.POST)
	public ResponseEntity<?> postPatientDetails(@RequestBody Patient patientDetails){
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@RequestMapping(value="v1/patient", method = RequestMethod.PUT)
	public ResponseEntity<?> putPatientDetails(@RequestBody Patient patientDetails) {
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(value = "v1/patient", method = RequestMethod.DELETE)
	public ResponseEntity<?> deletePatientDetails(@RequestParam(value = "patient-id" , required = true) Long patientId) {
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
