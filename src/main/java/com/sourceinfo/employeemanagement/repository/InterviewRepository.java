/**
 * 
 */
package com.sourceinfo.employeemanagement.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sourceinfo.employeemanagement.entity.Interviews;

/**
 * @author User
 *
 */
public interface InterviewRepository extends CrudRepository<Interviews,Integer> {
	
	public List<Interviews> findByCandidateName(String candidateName);

	public List<Interviews> findByPrimeVendorName(String primeVendorName);
	
	public List<Interviews> findByClientDetailsClientName(String clientName);


	

}
