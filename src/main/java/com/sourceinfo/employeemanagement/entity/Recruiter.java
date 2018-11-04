package com.sourceinfo.employeemanagement.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Recruiter {
	
/*	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int recurtiterId;*/
	private String recruiterName;
	private String recruiterEmail;
	private String recruiterLinkedinId;
	private int recruiterContactNumber;
	
	public Recruiter(String recruiterName, String recruiterEmail, String recruiterLinkedinId,
			int recruiterContactNumber) {
		super();
		this.recruiterName = recruiterName;
		this.recruiterEmail = recruiterEmail;
		this.recruiterLinkedinId = recruiterLinkedinId;
		this.recruiterContactNumber = recruiterContactNumber;
	}

	public Recruiter() {
		super();
	}

	public String getRecruiterName() {
		return recruiterName;
	}

	public void setRecruiterName(String recruiterName) {
		this.recruiterName = recruiterName;
	}

	public String getRecruiterEmail() {
		return recruiterEmail;
	}

	public void setRecruiterEmail(String recruiterEmail) {
		this.recruiterEmail = recruiterEmail;
	}

	public String getRecruiterLinkedinId() {
		return recruiterLinkedinId;
	}

	public void setRecruiterLinkedinId(String recruiterLinkedinId) {
		this.recruiterLinkedinId = recruiterLinkedinId;
	}

	public int getRecruiterContactNumber() {
		return recruiterContactNumber;
	}

	public void setRecruiterContactNumber(int recruiterContactNumber) {
		this.recruiterContactNumber = recruiterContactNumber;
	}
	
	
	

}
