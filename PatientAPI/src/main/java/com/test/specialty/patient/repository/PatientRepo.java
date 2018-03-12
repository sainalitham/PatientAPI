package com.test.specialty.patient.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.test.specialty.patient.entity.PatientEO;

@Repository
public interface PatientRepo extends JpaRepository<PatientEO, Long> {
	
	@Query("select p from PatientEO p where p.patientId in (:patientId)")
	public PatientEO findByPatientId(@Param("patientId") Long patientId);

}
