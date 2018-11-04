package com.sourceinfo.employeemanagement.entity;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Embeddable
public class Client {
	
	private String clientName;
	@Embedded
	private Location location;
	
	
	
	public Client(String clientName, Location location) {
		super();
		this.clientName = clientName;
		this.location = location;
	}
	
	
	
	public Client() {
		super();
	}



	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	
	

}
