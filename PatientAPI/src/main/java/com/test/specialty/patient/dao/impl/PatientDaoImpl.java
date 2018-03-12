package com.test.specialty.patient.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.specialty.patient.dao.PatientDao;
import com.test.specialty.patient.entity.PatientAddressEO;
import com.test.specialty.patient.entity.PatientEO;
import com.test.specialty.patient.mapper.PatientMapper;
import com.test.specialty.patient.model.Patient;
import com.test.specialty.patient.repository.PatientAddressRepo;
import com.test.specialty.patient.repository.PatientRepo;

@Repository
public class PatientDaoImpl implements PatientDao {
	
	@Autowired
	PatientRepo patientRepo;
	
	@Autowired
	PatientAddressRepo patientAddressRepo;
	
	@Autowired
	PatientMapper patientMapper;
	
	@Override
	public Patient getPatientDetails(Long patientId) {
		
		PatientEO patientEO = new PatientEO();
		PatientAddressEO patientAddressEO = new PatientAddressEO();
		
		patientEO = patientRepo.findByPatientId(patientId);
		if(patientEO !=null && patientEO.getAddressId()!=null) {
			patientAddressEO = patientAddressRepo.findByAddressId(patientEO.getAddressId());
		}
		Patient patient = patientMapper.mapPatientEO(patientEO,patientAddressEO);
		return patient;
	}

	

}
