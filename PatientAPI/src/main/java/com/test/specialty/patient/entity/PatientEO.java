package com.test.specialty.patient.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Table(name = "PATIENT")
@Entity
@NamedQuery(name="PatientEO.findAll",query="Select p from PatientEO p")
public class PatientEO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "PATIENT_ID")
	private Long patientId;
	
	@Column(name ="PATIENT_NAME")
	private String patientName;
	
	@Column(name="PATIENT_PHONE")
	private Long patientPhone;
	
	@Column(name="PATIENT_AGE")
	private int patientAge;
	
	@Column(name="ADDRESS_ID")
	private Long addressId;
	
	public Long getPatientId() {
		return patientId;
	}

	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public Long getPatientPhone() {
		return patientPhone;
	}

	public void setPatientPhone(Long patientPhone) {
		this.patientPhone = patientPhone;
	}

	public int getPatientAge() {
		return patientAge;
	}

	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}

	public Long getAddressId() {
		return addressId;
	}

	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}
}
