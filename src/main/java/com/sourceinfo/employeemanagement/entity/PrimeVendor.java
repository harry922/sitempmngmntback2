package com.sourceinfo.employeemanagement.entity;

import java.util.Collection;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

@Entity
public class PrimeVendor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pvId;

	private String companyName;
	
	@ElementCollection
	@JoinTable(name="PV_Technologies",joinColumns=@JoinColumn(name="PV_PVID"))
	private Collection<Technology> listOfTechnologies;
	
	@ElementCollection
	@JoinTable(name="PV_AccountManager",joinColumns=@JoinColumn(name="PV_PVID"))
	private Collection<AccountManager> listOfAccountManagers;

	@ElementCollection
	@JoinTable(name="PV_Recuriter",joinColumns=@JoinColumn(name="PV_PVID"))
	private Collection<Recruiter> listOfRecruiters;
	

	@Embedded
	private Location location;
	

	
	public PrimeVendor(int pvId, String companyName, Collection<Technology> listOfTechnologies,
			Collection<AccountManager> listOfAccountManagers, Collection<Recruiter> listOfRecruiters,
			Location location) {
		super();
		this.pvId = pvId;
		this.companyName = companyName;
		this.listOfTechnologies = listOfTechnologies;
		this.listOfAccountManagers = listOfAccountManagers;
		this.listOfRecruiters = listOfRecruiters;
		this.location = location;
	}



	public PrimeVendor() {
		super();
	}



	public int getPvId() {
		return pvId;
	}

	public void setPvId(int pvId) {
		this.pvId = pvId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Collection<Technology> getListOfTechnologies() {
		return listOfTechnologies;
	}

	public void setListOfTechnologies(Collection<Technology> listOfTechnologies) {
		this.listOfTechnologies = listOfTechnologies;
	}

	public Collection<AccountManager> getListOfAccountManagers() {
		return listOfAccountManagers;
	}

	public void setListOfAccountManagers(Collection<AccountManager> listOfAccountManagers) {
		this.listOfAccountManagers = listOfAccountManagers;
	}

	public Collection<Recruiter> getListOfRecruiters() {
		return listOfRecruiters;
	}

	public void setListOfRecruiters(Collection<Recruiter> listOfRecruiters) {
		this.listOfRecruiters = listOfRecruiters;
	}



	public Location getLocation() {
		return location;
	}



	public void setLocation(Location location) {
		this.location = location;
	}

	

	
}
