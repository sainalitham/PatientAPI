package com.test.specialty.patient.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PatientAddress {
	
	@JsonProperty(value = "addressLine1")
	private String line1;
	
	@JsonProperty(value = "addressLine2")
	private String line2;
	
	@JsonProperty(value = "city")
	private String city;
	
	@JsonProperty(value = "state")
	private String state;
	
	@JsonProperty(value = "zipCode")
	private Long zipcode;


	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getLine2() {
		return line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Long getZipcode() {
		return zipcode;
	}

	public void setZipcode(Long zipcode) {
		this.zipcode = zipcode;
	}
	
}
