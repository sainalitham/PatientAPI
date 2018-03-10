package com.test.specialty.patient.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Patient {
	
	@JsonProperty(value = "patientId")
	private Long patientId;
	
	@JsonProperty(value = "patientName")
	private String patientName;
	
	@JsonProperty(value = "patientAddress")
	private PatientAddress patientAddress;
	
	@JsonProperty(value = "patientPhone")
	private Long patientPhone;
	
	@JsonProperty(value = "patientAge")
	private int patientAge;

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

	public PatientAddress getPatientAddress() {
		return patientAddress;
	}

	public void setPatientAddress(PatientAddress patientAddress) {
		this.patientAddress = patientAddress;
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
}
