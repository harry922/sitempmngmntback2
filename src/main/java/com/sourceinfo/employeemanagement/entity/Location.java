package com.sourceinfo.employeemanagement.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Location {
	
	private String streetAddress;
	private String cityName;
	private String stateName;
	private String countryName;
	private int pincode;
	
	
	
	public Location(String streetAddress, String cityName, String stateName, String countryName, int pincode) {
		super();
		this.streetAddress = streetAddress;
		this.cityName = cityName;
		this.stateName = stateName;
		this.countryName = countryName;
		this.pincode = pincode;
	}
	
	
	
	public Location() {
		super();
	}



	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String strretAddress) {
		this.streetAddress = strretAddress;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}



	public int getPincode() {
		return pincode;
	}



	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	
	

}
