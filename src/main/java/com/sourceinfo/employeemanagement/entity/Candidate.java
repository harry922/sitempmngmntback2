package com.sourceinfo.employeemanagement.entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Candidate {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int candidateId;

	private String fullName;
	@Embedded
	private Technology technology;
	private String candidateEmployerName;

	public Candidate(int candidateId, String fullName, Technology technology, String candidateEmployerName) {
		super();
		this.candidateId = candidateId;
		this.fullName = fullName;
		this.technology = technology;
		this.candidateEmployerName = candidateEmployerName;
	}

	public Candidate() {
		super();
	}

	public int getCandidateId() {
		return candidateId;
	}

	public void setCandidateId(int candidateId) {
		this.candidateId = candidateId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Technology getTechnology() {
		return technology;
	}

	public void setTechnology(Technology technology) {
		this.technology = technology;
	}

	public String getCandidateEmployerName() {
		return candidateEmployerName;
	}

	public void setCandidateEmployerName(String candidateEmployerName) {
		this.candidateEmployerName = candidateEmployerName;
	}

}
