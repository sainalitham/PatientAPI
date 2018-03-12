package com.test.specialty.patient.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.test.specialty.patient.dao.PatientDao;
import com.test.specialty.patient.model.Patient;
import com.test.specialty.patient.model.PatientAddress;
import com.test.specialty.patient.service.PatientService;

@Repository
public class PatientServiceImpl implements PatientService {
	
	@Autowired
	PatientDao patientDao;
	
	@Override
	public Patient getPatientDetails(Long patientId) {
		// TODO Auto-generated method stub
		Patient patient = patientDao.getPatientDetails(patientId);
		//Patient patient1 = createPatient(patientId);
		return patient;
	}

	private Patient createPatient(Long patientId) {
		//patient1
		Patient patient1 = new Patient();
		patient1.setPatientId(patientId);
		patient1.setPatientAge(25);
		patient1.setPatientName("Eskay");
		patient1.setPatientPhone(4057382517L);
		patient1.setPatientAddress(createPatientAddress());	
		return patient1;
	}

	private PatientAddress createPatientAddress() {
		PatientAddress patientAddress = new PatientAddress();
		patientAddress.setLine1("line 1");
		patientAddress.setLine2("line 2");
		patientAddress.setCity("wheeling");
		patientAddress.setState("IL");
		patientAddress.setZipcode(60090L);
		return patientAddress;
	}

	@Override
	public ResponseEntity<?> postPatientDetails(Patient patientDetails) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<?> putPatientDetails(Patient patientDetails) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<?> deletePatientDetails(Long patientId) {
		// TODO Auto-generated method stub
		return null;
	}

}
