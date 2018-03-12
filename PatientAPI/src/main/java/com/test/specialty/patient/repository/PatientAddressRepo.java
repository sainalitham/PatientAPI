package com.test.specialty.patient.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.test.specialty.patient.entity.PatientAddressEO;

@Repository
public interface PatientAddressRepo extends JpaRepository<PatientAddressEO, Long> {
	
	@Query("select p from PatientAddressEO p where p.addressId in (:addressId)")
	public PatientAddressEO findByAddressId(@Param("addressId") Long addressId);

}
