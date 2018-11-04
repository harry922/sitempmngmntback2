package com.sourceinfo.employeemanagement.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sourceinfo.employeemanagement.entity.PrimeVendor;

public interface PrimeVendorRepository extends CrudRepository<PrimeVendor, Integer> {
	
	public List<PrimeVendor> findByLocation(String location);
	public List<PrimeVendor> findByCompanyName(String companyName);
	public List<PrimeVendor> findByListOfAccountManagersAccountManagerName(String accountmanagername);
	public List<PrimeVendor> findByListOfAccountManagersAccountManagerEmail(String accountmanageremail);
	public List<PrimeVendor> findByListOfAccountManagersAccountManagerContactNumber(String accountmanagercontactnumber);
	public List<PrimeVendor> findByListOfRecruitersRecruiterName(String recruitername);
	public List<PrimeVendor> findByListOfRecruitersRecruiterEmail(String recruiteremail);
	public List<PrimeVendor> findByListOfRecruitersRecruiterContactNumber(String recruitercontactnumber );
	public List<PrimeVendor> findByLocationPincode(int pincode );
	public List<PrimeVendor> findByLocationCityName(String locationcityname );
	public List<PrimeVendor> findByLocationStateName(String locationstatename );



}
