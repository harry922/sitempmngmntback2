/**
 * 
 */
package com.sourceinfo.employeemanagement.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



/**
 * @author User
 *
 */

//@JsonPropertyOrder({"summaryId","DateofEntry","DateofInterview","PVSalesName","PVSalesEmail","PVSalesPhone","PVSalesLinkedIn","PVRecruiterName",
//	"SkillSet","PVRecruiterPhone","PVRecruiterLinkedIn","PVRecruiterEmail","CandidateName","CandidateEmail","CandidatePhone","CandidateCompanyName",
//	"CandidateCompanyContact","SITSalesName","SITRecruiterName","EndClientName","ECHiringManager","ECHiringManagerLinkedIn"})
@Entity
public class Summary {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	

	private int summaryId;
	//@JsonProperty("DateofEntry")
	
	private String DateofEntry;
	
//@JsonProperty("DateofInterview")
	private String  DateofInterview;

//@JsonProperty("PVSalesName")
	private String PVSalesName ;

//@JsonProperty("PVSalesEmail")
	private String PVSalesEmail;

//@JsonProperty("PVSalesPhone")
	private String PVSalesPhone;

//@JsonProperty("PVSalesLinkedIn")	
	private String PVSalesLinkedIn;

//@JsonProperty("PVRecruiterName")
	private String PVRecruiterName;

//@JsonProperty("PVRecruiterEmail")
	private String PVRecruiterEmail;

//@JsonProperty("PVRecruiterLinkedIn")
	private String PVRecruiterPhone;

//@JsonProperty("PVRecruiterLinkedIn")
private String PVRecruiterLinkedIn;

//@JsonProperty("SkillSet")
	private String SkillSet;
	
//@JsonProperty("CandidateName")
	private String CandidateName;
	
//@JsonProperty("CandidateEmail")

private String CandidateEmail;

//@JsonProperty("CandidatePhone")
	private String CandidatePhone;
	
//@JsonProperty("CandidateCompanyName")
	private String CandidateCompanyName;

//@JsonProperty("CandidateCompanyContact")
private String CandidateCompanyContact;
	
//@JsonProperty("SITSalesName")
	private String SITSalesName;

//@JsonProperty("SITRecruiterName")
	private String SITRecruiterName;
	
//@JsonProperty("EndClientName")
private String EndClientName;

//@JsonProperty("ECHiringManager")
private String ECHiringManager;

//@JsonProperty("ECHiringManagerLinkedIn")
private String ECHiringManagerLinkedIn;
	

	

	public Summary() {
		super();
	}









	public Summary(int summaryId, String dateofEntry, String dateofInterview, String pVSalesName, String pVSalesEmail,
			String pVSalesPhone, String pVSalesLinkedIn, String pVRecruiterName, String pVRecruiterEmail,
			String pVRecruiterPhone, String pVRecruiterLinkedIn, String skillSet, String candidateName,
			String candidateEmail, String candidatePhone, String candidateCompanyName, String candidateCompanyContact,
			String sITSalesName, String sITRecruiterName, String endClientName, String eCHiringManager,
			String eCHiringManagerLinkedIn) {
		super();
		this.summaryId = summaryId;
		DateofEntry = dateofEntry;
		DateofInterview = dateofInterview;
		PVSalesName = pVSalesName;
		PVSalesEmail = pVSalesEmail;
		PVSalesPhone = pVSalesPhone;
		PVSalesLinkedIn = pVSalesLinkedIn;
		PVRecruiterName = pVRecruiterName;
		PVRecruiterEmail = pVRecruiterEmail;
		PVRecruiterPhone = pVRecruiterPhone;
		PVRecruiterLinkedIn = pVRecruiterLinkedIn;
		SkillSet = skillSet;
		CandidateName = candidateName;
		CandidateEmail = candidateEmail;
		CandidatePhone = candidatePhone;
		CandidateCompanyName = candidateCompanyName;
		CandidateCompanyContact = candidateCompanyContact;
		SITSalesName = sITSalesName;
		SITRecruiterName = sITRecruiterName;
		EndClientName = endClientName;
		ECHiringManager = eCHiringManager;
		ECHiringManagerLinkedIn = eCHiringManagerLinkedIn;
	}









	public int getSummaryId() {
		return summaryId;
	}




	public void setSummaryId(int summaryId) {
		this.summaryId = summaryId;
	}




	public String getDateofEntry() {
		return DateofEntry;
	}




	public void setDateofEntry(String dateofEntry) {
		DateofEntry = dateofEntry;
	}




	public String getDateofInterview() {
		return DateofInterview;
	}




	public void setDateofInterview(String dateofInterview) {
		DateofInterview = dateofInterview;
	}




	public String getPVSalesName() {
		return PVSalesName;
	}




	public void setPVSalesName(String pVSalesName) {
		PVSalesName = pVSalesName;
	}




	public String getPVSalesEmail() {
		return PVSalesEmail;
	}




	public void setPVSalesEmail(String pVSalesEmail) {
		PVSalesEmail = pVSalesEmail;
	}




	public String getPVSalesPhone() {
		return PVSalesPhone;
	}




	public void setPVSalesPhone(String pVSalesPhone) {
		PVSalesPhone = pVSalesPhone;
	}




	public String getPVSalesLinkedIn() {
		return PVSalesLinkedIn;
	}




	public void setPVSalesLinkedIn(String pVSalesLinkedIn) {
		PVSalesLinkedIn = pVSalesLinkedIn;
	}




	public String getPVRecruiterName() {
		return PVRecruiterName;
	}




	public void setPVRecruiterName(String pVRecruiterName) {
		PVRecruiterName = pVRecruiterName;
	}




	public String getPVRecruiterEmail() {
		return PVRecruiterEmail;
	}




	public void setPVRecruiterEmail(String pVRecruiterEmail) {
		PVRecruiterEmail = pVRecruiterEmail;
	}




	public String getPVRecruiterPhone() {
		return PVRecruiterPhone;
	}




	public void setPVRecruiterPhone(String pVRecruiterPhone) {
		PVRecruiterPhone = pVRecruiterPhone;
	}




	public String getPVRecruiterLinkedIn() {
		return PVRecruiterLinkedIn;
	}




	public void setPVRecruiterLinkedIn(String pVRecruiterLinkedIn) {
		PVRecruiterLinkedIn = pVRecruiterLinkedIn;
	}




	public String getSkillSet() {
		return SkillSet;
	}




	public void setSkillSet(String skillSet) {
		SkillSet = skillSet;
	}




	public String getCandidateName() {
		return CandidateName;
	}




	public void setCandidateName(String candidateName) {
		CandidateName = candidateName;
	}




	public String getCandidateEmail() {
		return CandidateEmail;
	}




	public void setCandidateEmail(String candidateEmail) {
		CandidateEmail = candidateEmail;
	}




	public String getCandidatePhone() {
		return CandidatePhone;
	}




	public void setCandidatePhone(String candidatePhone) {
		CandidatePhone = candidatePhone;
	}




	public String getCandidateCompanyName() {
		return CandidateCompanyName;
	}




	public void setCandidateCompanyName(String candidateCompanyName) {
		CandidateCompanyName = candidateCompanyName;
	}




	public String getCandidateCompanyContact() {
		return CandidateCompanyContact;
	}




	public void setCandidateCompanyContact(String candidateCompanyContact) {
		CandidateCompanyContact = candidateCompanyContact;
	}




	public String getSITSalesName() {
		return SITSalesName;
	}




	public void setSITSalesName(String sITSalesName) {
		SITSalesName = sITSalesName;
	}




	public String getSITRecruiterName() {
		return SITRecruiterName;
	}




	public void setSITRecruiterName(String sITRecruiterName) {
		SITRecruiterName = sITRecruiterName;
	}


	
	


	public String getEndClientName() {
		return EndClientName;
	}









	public void setEndClientName(String endClientName) {
		EndClientName = endClientName;
	}









	public String getECHiringManager() {
		return ECHiringManager;
	}









	public void setECHiringManager(String eCHiringManager) {
		ECHiringManager = eCHiringManager;
	}









	public String getECHiringManagerLinkedIn() {
		return ECHiringManagerLinkedIn;
	}









	public void setECHiringManagerLinkedIn(String eCHiringManagerLinkedIn) {
		ECHiringManagerLinkedIn = eCHiringManagerLinkedIn;
	}









	@Override
	public String toString() {
		return "Summary [summaryId=" + summaryId + ", DateofEntry=" + DateofEntry + ", DateofInterview="
				+ DateofInterview + ", PVSalesName=" + PVSalesName + ", PVSalesEmail=" + PVSalesEmail
				+ ", PVSalesPhone=" + PVSalesPhone + ", PVSalesLinkedIn=" + PVSalesLinkedIn + ", PVRecruiterName="
				+ PVRecruiterName + ", PVRecruiterEmail=" + PVRecruiterEmail + ", PVRecruiterPhone=" + PVRecruiterPhone
				+ ", PVRecruiterLinkedIn=" + PVRecruiterLinkedIn + ", SkillSet=" + SkillSet + ", CandidateName="
				+ CandidateName + ", CandidateEmail=" + CandidateEmail + ", CandidatePhone=" + CandidatePhone
				+ ", CandidateCompanyName=" + CandidateCompanyName + ", CandidateCompanyContact="
				+ CandidateCompanyContact + ", SITSalesName=" + SITSalesName + ", SITRecruiterName=" + SITRecruiterName
				+ "]";
	}

	
	
	

}
