package com.sourceinfo.employeemanagement.entity;

import javax.persistence.Embeddable;


@Embeddable
public class Technology {

	private String technologyName;
	
	

	public Technology(String technologyName) {
		super();
		this.technologyName = technologyName;
	}



	public Technology() {
		super();
	}

	

	public String getTechnologyName() {
		return technologyName;
	}

	public void setTechnologyName(String technologyName) {
		this.technologyName = technologyName;
	}
	
	

}
