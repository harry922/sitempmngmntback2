package com.sourceinfo.employeemanagement.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.sourceinfo.employeemanagement.entity.Candidate;
import com.sourceinfo.employeemanagement.entity.Interviews;
import com.sourceinfo.employeemanagement.entity.PrimeVendor;
import com.sourceinfo.employeemanagement.entity.Summary;
import com.sourceinfo.employeemanagement.service.Iservice;

@CrossOrigin(origins="*", allowedHeaders="*")
@RestController
@EnableAutoConfiguration
@RequestMapping("/")
public class SourceInfoController {
	
	private Iservice service;
	
	@Autowired
    private ResourceLoader resourceLoader;
	
	
	@Autowired
	public SourceInfoController(Iservice service) {
		super();
		this.service = service;
	}


	@RequestMapping(method=RequestMethod.GET, produces=MediaType.TEXT_PLAIN_VALUE)
	public String welcome(){
		return "Welcome";
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/candidates")
	public List<Candidate> getAllCandidates(){
		
		return service.getAllCandidates();
		
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/candidates/addcandidate")
	public void addCandidates(@RequestBody Candidate candidate){
		
		 service.addCandidate(candidate);
		
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/candidates/updatecandidate/{candidateid}")
	public void updateCandidates(@RequestBody Candidate candidate, @PathVariable int candidateid ){
		
		 service.updateCandidate(candidateid,candidate);
		
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/candidates/deletecandidate/{id}")
	public void deleteCandidates(@PathVariable int id){
		
		 service.deleteCandidate(id);
		
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/candidates/{candidatename}")
	public Candidate getCandidateByFullName(@PathVariable String candidatename){
		
		 return service.getCandidateByFullName(candidatename);
		
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/primevendors")
	public List<PrimeVendor> getAllPrimeVendors(){
		
		return service.getAllPrimeVendors();
		
	}

	@RequestMapping(method=RequestMethod.POST, value="/primevendors/addprimevendors")
	public void addPrimeVendors(@RequestBody PrimeVendor primevendor){
		
		 service.addPrimeVendor(primevendor);
		
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/primevendors//updateprimevendors/{primevendorid}")
	public void updatePrimeVendors(@RequestBody PrimeVendor primevendor, @PathVariable int primevendorid){
		
		 service.updatePrimeVendor(primevendorid,primevendor);
		
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/primevendors/deleteprimevendors/{primevendorid}")
	public void updatePrimeVendors( @PathVariable int primevendorid){
		
		 service.deletePrimeVendor(primevendorid);
		
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/primevendors/locations/{location}")
	public List<PrimeVendor> getPrimeVendorsByLocation(@PathVariable String location){
		
		 return service.getPrimeVendorsByLocation(location);
		
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/primevendors/companyNames/{companyName}")
	public List<PrimeVendor> getPrimeVendorsBycompanyName(@PathVariable String companyName ){
		
		 return service.getPrimeVendorsBycompanyName(companyName);
		
	}
	
	
	@RequestMapping(method=RequestMethod.GET, value="/primevendors/accountmanagers/accountmanagername/{accountmanagername}")
	public List<PrimeVendor> getPrimeVendorsByAccountManagerName(@PathVariable String accountmanagername  ){
		
		 return service.getPrimeVendorsByAccountManagerName(accountmanagername);
		
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/primevendors/accountmanagers/accountmanageremail/{accountmanageremail}")
	public List<PrimeVendor> getPrimeVendorsByAccountManagerEmail(@PathVariable String accountmanageremail  ){
		
		 return service.getPrimeVendorsByAccountManagerEmail(accountmanageremail);
		
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/primevendors/accountmanagers/accountmanagercontactnumber/{accountmanagercontactnumber}")
	public List<PrimeVendor> getPrimeVendorsByAccountManagerContactNumber(@PathVariable String accountmanagercontactnumber  ){
		
		 return service.getPrimeVendorsByAccountManagerContactNumber(accountmanagercontactnumber);
		
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/primevendors/recruiters/recruitername/{recruitername}")
	public List<PrimeVendor> getPrimeVendorsByRecruiterName(@PathVariable String recruitername  ){
		
		 return service.getPrimeVendorsByRecruiterName(recruitername);
		
	}
	
	
	@RequestMapping(method=RequestMethod.GET, value="/primevendors/recruiters/recruiteremail/{recruiteremail}")
	public List<PrimeVendor> getPrimeVendorsByRecruiterEmail(@PathVariable String recruiteremail   ){
		
		 return service.getPrimeVendorsByRecruiterEmail(recruiteremail);
		
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/primevendors/recruiters/recruitercontactnumber/{recruitercontactnumber}")
	public List<PrimeVendor> getPrimeVendorsByRecruiterContactNumber(@PathVariable String recruitercontactnumber   ){
		
		 return service.getPrimeVendorsByRecruiterContactNumber(recruitercontactnumber);
		
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/primevendors/locations/pincode/{locationpincode}")
	public List<PrimeVendor> getPrimeVendorsByLocationPincode(@PathVariable int locationpincode   ){
		
		 return service.getPrimeVendorsByLocationPincode(locationpincode);
		
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/primevendors/locations/cityname/{locationcityname}")
	public List<PrimeVendor> getPrimeVendorsByLocationPincode(@PathVariable String locationcityname   ){
		
		 return service.getPrimeVendorsByLocationCityName(locationcityname);
		
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/primevendors/locations/statename/{locationstatename}")
	public List<PrimeVendor> getPrimeVendorsByLocationStateName(@PathVariable String locationstatename   ){
		
		 return service.getPrimeVendorsByLocationStateName(locationstatename);
		
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/interviews")
	public List<Interviews> getAllInterviews(){
		
		return service.getAllInterviews();
		
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/interviews/addinterview")
	public void  addInterview(@RequestBody Interviews interview){
		
		service.addInterview(interview);
		
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/interviews/getInterviewByCandidateName/{candidateName}")
	public List<Interviews> getInterviewByCandidateName(@PathVariable String candidateName ){
		
		return service.getInterviewByCandidateName(candidateName);
		
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/interviews/getInterviewByPVName/{PrimeVendorName}")
	public List<Interviews> getInterviewByPVName(@PathVariable String PrimeVendorName ){
		
		return service.getInterviewByPVName(PrimeVendorName);
		
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/interviews/getInterviewClientName/{ClientName}")
	public List<Interviews> getInterviewClientName(@PathVariable String ClientName ){
		
		return service.getInterviewClientName(ClientName);
		
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/summary/getsummaryfromtextfile", method = RequestMethod.GET)
    public String getResources() throws IOException {
		Resource resource = resourceLoader.getResource("classpath:test.txt");
		
		 InputStream is = resource.getInputStream();
         BufferedReader br = new BufferedReader(new InputStreamReader(is));
         String newLine = System.getProperty("line.separator");
         
         StringBuilder result = new StringBuilder();
         String line;
         boolean flag = false;
         while ((line = br.readLine()) != null) {
             result.append(flag? newLine: "").append(line);
             flag = true;
         }
         return result.toString();
      

        /* String line;
         while ((line = br.readLine()) != null) {
    	       System.out.println(line);
         }
         br.close();*/
     
    }
	
	@CrossOrigin(origins = "*")
	@RequestMapping(method=RequestMethod.GET, value="/summary/getsummaryfromtxt")
	public List<Summary> getSummary(){
		
		return service.getSummary();
		
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(method=RequestMethod.POST, value="/summary/addsummaryfromexcel")
	public void addSummaryFromExcelFile(  @RequestParam("file") MultipartFile file){
		
		 service.addSummaryFromExcelFile(file);
		
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping( method=RequestMethod.GET, value="/summary/getcompletesummaryforexcel")
	public List<Summary> getAllSummary(){
		
		return service.getAllSummary();
		
	}
	
	
	
	@CrossOrigin(origins = "*")
	@RequestMapping(method=RequestMethod.POST, value="/summary/addsummaryfromtxt")
	public void addSummaryFromTextFile(@RequestBody Summary summary){
		
		 service.addSummaryFromTextFile(summary);
		
	}
	

	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
	   
    public void uploadFile(
        @RequestParam("file") MultipartFile file) {

     System.out.println("req coming to controller");
    service.uploadFile(file);
   

    }
	
	@CrossOrigin(origins = "*")
	@RequestMapping(method=RequestMethod.POST, value="/summary/addsummary")
	public void addSummary(@RequestBody Summary summary){
		
		 service.addSummary(summary);
		
	}
	
	
}
