/**
 * 
 */
package com.sourceinfo.employeemanagement.entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Rahul Reddy
 *
 */
@Entity
public class Interviews {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int interviewId;
	private String candidateName;
	private String primeVendorName;
	@Embedded
	private Client clientDetails;
	
	
	public Interviews(int interviewId, String candidateName, String primeVendorName, Client clientDetails) {
		super();
		this.interviewId = interviewId;
		this.candidateName = candidateName;
		this.primeVendorName = primeVendorName;
		this.clientDetails = clientDetails;
	}


	public int getInterviewId() {
		return interviewId;
	}


	public void setInterviewId(int interviewId) {
		this.interviewId = interviewId;
	}


	public String getCandidateName() {
		return candidateName;
	}


	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}


	public String getPrimeVendorName() {
		return primeVendorName;
	}


	public void setPrimeVendorName(String primeVendorName) {
		this.primeVendorName = primeVendorName;
	}


	public Client getClientDetails() {
		return clientDetails;
	}


	public void setClientDetails(Client clientDetails) {
		this.clientDetails = clientDetails;
	}
	
	
	
	
	
	
}