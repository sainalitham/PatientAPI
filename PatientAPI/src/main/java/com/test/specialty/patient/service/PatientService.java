package com.test.specialty.patient.service;

import org.springframework.http.ResponseEntity;

import com.test.specialty.patient.model.Patient;

public interface PatientService {

	public Patient getPatientDetails(Long patientId);
	
	public ResponseEntity<?> postPatientDetails(Patient patientDetails);
	
	public ResponseEntity<?> putPatientDetails(Patient patientDetails);
	
	public ResponseEntity<?> deletePatientDetails(Long patientId);
	
}
