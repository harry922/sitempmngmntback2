package com.sourceinfo.employeemanagement.entity;

import javax.persistence.Embeddable;


@Embeddable
public class AccountManager {
	
	/*@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int accountManagerId;*/
	private String accountManagerName;
	private String accountManagerEmail;
	private String accountManagerLinkedinId;
	private int accountManagerContactNumber;
	
	public AccountManager(String accountManagerName, String accountManagerEmail, String accountManagerLinkedinId,
			int accountManagerContactNumber) {
		super();
		this.accountManagerName = accountManagerName;
		this.accountManagerEmail = accountManagerEmail;
		this.accountManagerLinkedinId = accountManagerLinkedinId;
		this.accountManagerContactNumber = accountManagerContactNumber;
	}

	public AccountManager() {
		super();
	}

	public String getAccountManagerName() {
		return accountManagerName;
	}

	public void setAccountManagerName(String accountManagerName) {
		this.accountManagerName = accountManagerName;
	}

	public String getAccountManagerEmail() {
		return accountManagerEmail;
	}

	public void setAccountManagerEmail(String accountManagerEmail) {
		this.accountManagerEmail = accountManagerEmail;
	}

	public String getAccountManagerLinkedinId() {
		return accountManagerLinkedinId;
	}

	public void setAccountManagerLinkedinId(String accountManagerLinkedinId) {
		this.accountManagerLinkedinId = accountManagerLinkedinId;
	}

	public int getAccountManagerContactNumber() {
		return accountManagerContactNumber;
	}

	public void setAccountManagerContactNumber(int accountManagerContactNumber) {
		this.accountManagerContactNumber = accountManagerContactNumber;
	}
	
	
	
	

}
