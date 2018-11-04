package com.sourceinfo.employeemanagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.sourceinfo.employeemanagement.entity.Candidate;

public interface CandidateRepository extends CrudRepository<Candidate, Integer>{
	
	public Candidate findByFullName(String fullName );
	
}
