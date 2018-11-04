package com.sourceinfo.employeemanagement.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.sourceinfo.employeemanagement.entity.Candidate;
import com.sourceinfo.employeemanagement.entity.Interviews;
import com.sourceinfo.employeemanagement.entity.PrimeVendor;
import com.sourceinfo.employeemanagement.entity.Summary;

public interface Iservice {

	public List<Candidate> getAllCandidates();
	public void addCandidate(Candidate candidate);
	public void updateCandidate(int candidateid,Candidate candidate);
	public void deleteCandidate(int candidateId);
	public Candidate getCandidateByFullName(String fullName);
	public List<PrimeVendor> getAllPrimeVendors();
	public void addPrimeVendor(PrimeVendor primevendor);
	public List<PrimeVendor> getPrimeVendorsByLocation(String location);
	public List<PrimeVendor> getPrimeVendorsBycompanyName(String companyName);
	public List<PrimeVendor> getPrimeVendorsByAccountManagerName(String accountmanagername);
	public List<PrimeVendor> getPrimeVendorsByRecruiterName(String recruitername);
	public List<PrimeVendor> getPrimeVendorsByAccountManagerEmail(String accountmanageremail);
	public List<PrimeVendor> getPrimeVendorsByAccountManagerContactNumber(String accountmanagercontactnumber);
	public List<PrimeVendor> getPrimeVendorsByRecruiterEmail(String recruiteremail);
	public List<PrimeVendor> getPrimeVendorsByRecruiterContactNumber(String recruitercontactnumber);
	public List<PrimeVendor> getPrimeVendorsByLocationPincode(int locationpincode);
	public List<PrimeVendor> getPrimeVendorsByLocationCityName(String locationcityname);
	public List<PrimeVendor> getPrimeVendorsByLocationStateName(String locationstatename);
	public void updatePrimeVendor(int primevendorid,PrimeVendor primevendor);
	public void deletePrimeVendor(int primevendorid);
	/**
	 * @return
	 */
	public List<Interviews> getAllInterviews();
	/**
	 * @param interview
	 * @return
	 */
	public void addInterview(Interviews interview);
	/**
	 * @param candidateName
	 * @return
	 */
	public List<Interviews> getInterviewByCandidateName(String candidateName);
	/**
	 * @param primeVendorName
	 * @return
	 */
	public List<Interviews> getInterviewByPVName(String primeVendorName);
	/**
	 * @param primeVendorName
	 * @return
	 */
	/**
	 * @param clientName
	 * @return
	 */
	public List<Interviews> getInterviewClientName(String clientName);
	/**
	 * @return
	 */
	public List<Summary> getSummary();
	/**
	 * @param file 
	 * 
	 */
	public void addSummaryFromExcelFile(MultipartFile file);
	/**
	 * @return
	 */
	public List<Summary> getAllSummary();
	public void addSummaryFromTextFile(Summary summary);
	public void uploadFile(MultipartFile file);
	public void addSummary(Summary summary);
	
	
	
}
