package com.test.specialty.patient.mapper;

import org.springframework.stereotype.Repository;

import com.test.specialty.patient.entity.PatientAddressEO;
import com.test.specialty.patient.entity.PatientEO;
import com.test.specialty.patient.model.Patient;
import com.test.specialty.patient.model.PatientAddress;

@Repository
public class PatientMapper {
	
	public Patient mapPatientEO(PatientEO patientEO,PatientAddressEO patientAddressEO) {
		Patient patient = new Patient();
		patient.setPatientId(patientEO.getPatientId());
		patient.setPatientName(patientEO.getPatientName());
		patient.setPatientAge(patientEO.getPatientAge());
		patient.setPatientPhone(patientEO.getPatientPhone());
		PatientAddress patientAddress = mapPatientAddressEO(patientAddressEO);
		patient.setPatientAddress(patientAddress);
		return patient;
		
	}

	private PatientAddress mapPatientAddressEO(PatientAddressEO patientAddressEO) {
		PatientAddress patientAddress = new PatientAddress();
		patientAddress.setLine1(patientAddressEO.getLine1());
		patientAddress.setLine2(patientAddressEO.getLine2());
		patientAddress.setCity(patientAddressEO.getCity());
		patientAddress.setState(patientAddressEO.getState());
		patientAddress.setZipcode(patientAddressEO.getZipcode());
		return patientAddress;
	}

}
