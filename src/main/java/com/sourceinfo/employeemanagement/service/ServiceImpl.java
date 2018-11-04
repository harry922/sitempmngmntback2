package com.sourceinfo.employeemanagement.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.sourceinfo.employeemanagement.entity.Candidate;
import com.sourceinfo.employeemanagement.entity.Interviews;
import com.sourceinfo.employeemanagement.entity.PrimeVendor;
import com.sourceinfo.employeemanagement.entity.Summary;
import com.sourceinfo.employeemanagement.entity.Summary2;
import com.sourceinfo.employeemanagement.repository.CandidateRepository;
import com.sourceinfo.employeemanagement.repository.InterviewRepository;
import com.sourceinfo.employeemanagement.repository.PrimeVendorRepository;
import com.sourceinfo.employeemanagement.repository.SummaryRepository;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;



import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

@Service
public class ServiceImpl implements Iservice {

	private static final String FILE_NAME = "interview_tracking_final.xlsx";

	@Autowired
	private CandidateRepository candidateRepository;
	@Autowired
	private PrimeVendorRepository primeVendorRepository;

	@Autowired
	private InterviewRepository interviewRepository;

	@Autowired
	private SummaryRepository summaryRepository;

	private Object[] array;

	public ServiceImpl(CandidateRepository candidateRepository, PrimeVendorRepository primeVendorRepository,
			InterviewRepository interviewRepository, SummaryRepository summaryRepository) {
		super();
		this.candidateRepository = candidateRepository;
		this.primeVendorRepository = primeVendorRepository;
		this.interviewRepository = interviewRepository;
		this.summaryRepository = summaryRepository;
	}

	@Override
	public List<Candidate> getAllCandidates() {
		// TODO Auto-generated method stub

		Iterable<Candidate> itr = candidateRepository.findAll();
		Iterator<Candidate> iterator = itr.iterator();
		List<Candidate> candidateList = new ArrayList<Candidate>();
		while (iterator.hasNext()) {
			Candidate candidate = iterator.next();
			candidateList.add(candidate);
		}

		return candidateList;
	}

	@Override
	public void addCandidate(Candidate candidate) {
		// TODO Auto-generated method stub
		candidateRepository.save(candidate);

	}

	@Override
	public void updateCandidate(int candiadteid, Candidate candidate) {
		// TODO Auto-generated method stub
		candidate.setCandidateId(candiadteid);
		candidateRepository.save(candidate);

	}

	@Override
	public void deleteCandidate(int candidateId) {
		// TODO Auto-generated method stub
		candidateRepository.delete(candidateId);
	}

	@Override
	public Candidate getCandidateByFullName(String fullName) {
		// TODO Auto-generated method stub
		return candidateRepository.findByFullName(fullName);
	}

	@Override
	public List<PrimeVendor> getAllPrimeVendors() {
		// TODO Auto-generated method stub
		Iterable<PrimeVendor> itr = primeVendorRepository.findAll();
		Iterator<PrimeVendor> iterator = itr.iterator();
		List<PrimeVendor> primeVendorList = new ArrayList<PrimeVendor>();
		while (iterator.hasNext()) {
			PrimeVendor primevendor = iterator.next();
			primeVendorList.add(primevendor);
		}

		return primeVendorList;
	}

	@Override
	public void addPrimeVendor(PrimeVendor primevendor) {
		// TODO Auto-generated method stub
		primeVendorRepository.save(primevendor);

	}

	@Override
	public List<PrimeVendor> getPrimeVendorsByLocation(String location) {
		// TODO Auto-generated method stub
		return primeVendorRepository.findByLocation(location);
	}

	@Override
	public List<PrimeVendor> getPrimeVendorsBycompanyName(String companyName) {
		// TODO Auto-generated method stub
		return primeVendorRepository.findByCompanyName(companyName);
	}

	@Override
	public List<PrimeVendor> getPrimeVendorsByAccountManagerName(String accountmanagername) {
		// TODO Auto-generated method stub
		return primeVendorRepository.findByListOfAccountManagersAccountManagerName(accountmanagername);
	}

	@Override
	public List<PrimeVendor> getPrimeVendorsByRecruiterName(String recruitername) {
		// TODO Auto-generated method stub
		return primeVendorRepository.findByListOfRecruitersRecruiterName(recruitername);
	}

	@Override
	public List<PrimeVendor> getPrimeVendorsByAccountManagerEmail(String accountmanageremail) {
		// TODO Auto-generated method stub
		return primeVendorRepository.findByListOfAccountManagersAccountManagerEmail(accountmanageremail);
	}

	@Override
	public List<PrimeVendor> getPrimeVendorsByAccountManagerContactNumber(String accountmanagercontactnumber) {
		// TODO Auto-generated method stub
		return primeVendorRepository
				.findByListOfAccountManagersAccountManagerContactNumber(accountmanagercontactnumber);
	}

	@Override
	public List<PrimeVendor> getPrimeVendorsByRecruiterEmail(String recruiteremail) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PrimeVendor> getPrimeVendorsByRecruiterContactNumber(String recruitercontactnumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PrimeVendor> getPrimeVendorsByLocationPincode(int locationpincode) {
		// TODO Auto-generated method stub
		return primeVendorRepository.findByLocationPincode(locationpincode);
	}

	@Override
	public List<PrimeVendor> getPrimeVendorsByLocationCityName(String locationcityname) {
		// TODO Auto-generated method stub
		return primeVendorRepository.findByLocationCityName(locationcityname);
	}

	@Override
	public List<PrimeVendor> getPrimeVendorsByLocationStateName(String locationstatename) {
		// TODO Auto-generated method stub
		return primeVendorRepository.findByLocationStateName(locationstatename);
	}

	@Override
	public void updatePrimeVendor(int primevendorid, PrimeVendor primevendor) {
		// TODO Auto-generated method stub
		primevendor.setPvId(primevendorid);
		primeVendorRepository.save(primevendor);

	}

	@Override
	public void deletePrimeVendor(int primevendorid) {
		// TODO Auto-generated method stub
		primeVendorRepository.delete(primevendorid);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sourceinfo.employeemanagement.service.Iservice#getAllInterviews()
	 */
	@Override
	public List<Interviews> getAllInterviews() {
		// TODO Auto-generated method stub

		Iterable<Interviews> itr = interviewRepository.findAll();
		Iterator<Interviews> iterator = itr.iterator();
		List<Interviews> interviewsList = new ArrayList<Interviews>();
		while (iterator.hasNext()) {
			Interviews interview = iterator.next();
			interviewsList.add(interview);
		}

		return interviewsList;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sourceinfo.employeemanagement.service.Iservice#addInterview(com.
	 * sourceinfo.employeemanagement.entity.Interviews)
	 */
	@Override
	public void addInterview(Interviews interview) {
		// TODO Auto-generated method stub

		interviewRepository.save(interview);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sourceinfo.employeemanagement.service.Iservice#
	 * getInterviewByCandidateName(java.lang.String)
	 */
	@Override
	public List<Interviews> getInterviewByCandidateName(String candidateName) {
		// TODO Auto-generated method stub
		return interviewRepository.findByCandidateName(candidateName);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.sourceinfo.employeemanagement.service.Iservice#getInterviewByPVName(java.
	 * lang.String)
	 */
	@Override
	public List<Interviews> getInterviewByPVName(String primeVendorName) {
		// TODO Auto-generated method stub
		return interviewRepository.findByPrimeVendorName(primeVendorName);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.sourceinfo.employeemanagement.service.Iservice#getInterviewClientName(
	 * java.lang.String)
	 */
	@Override
	public List<Interviews> getInterviewClientName(String clientName) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sourceinfo.employeemanagement.service.Iservice#getSummary()
	 */

	@Override
	public List<Summary> getSummary() {
		// TODO Auto-generated method stub

		Iterable<Summary> itr = summaryRepository.findAll();
		Iterator<Summary> iterator = itr.iterator();
		List<Summary> summaryList = new ArrayList<Summary>();
		while (iterator.hasNext()) {
			Summary s = iterator.next();
			summaryList.add(s);
		}

		return summaryList;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.sourceinfo.employeemanagement.service.Iservice#addSummaryFromExcelFile()
	 */
	@Override
	public void addSummaryFromExcelFile(MultipartFile file) {
		// TODO Auto-generated method stub
		
		

        // TODO Auto-generated method stub
       
	     System.out.println("req coming to service method");

       
         try {
            byte[] bytes = file.getBytes();
            
            System.out.println("req coming to sm");

           
             File excelFile = new File("interview_tracking_final.xlsx"); 
             FileOutputStream fileOutputStream = new FileOutputStream(excelFile);
                //write a the bytes to a new .xls file
                fileOutputStream.write(bytes);
                fileOutputStream.flush();
                fileOutputStream.close();
           
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
       
    

		Summary2 summary = new Summary2();

		List<Summary2> summaryList = new ArrayList<Summary2>();
		List<Summary> summaryList2 = new ArrayList<Summary>();
		BufferedReader br = null;

		Workbook wb = null;
		try {

			FileInputStream excelFile = new FileInputStream(new File(FILE_NAME));
			/*
			 * Workbook workbook = new XSSFWorkbook(excelFile); Sheet datatypeSheet =
			 * workbook.getSheetAt(0); Iterator<Row> iterator = datatypeSheet.iterator();
			 */

			wb = new XSSFWorkbook(excelFile);
			// System.out.println("workbook: "+wb);
			Sheet sheet = wb.getSheetAt(0);
			// System.out.println("worksheet: "+sheet);
			// HSSFRow row;

			Iterator<Row> iterator1 = sheet.iterator();
			while (iterator1.hasNext()) {
				summary = new Summary2();
				Row nextRow = iterator1.next();
				if (nextRow.getRowNum() == 0) {
					continue; // just skip the rows if row number is 0 or 1
				}

				Iterator<Cell> cellIterator = nextRow.cellIterator();
				Cell cell = cellIterator.next();
				Iterator cells = nextRow.cellIterator();

				cell = (XSSFCell) cells.next();

				/*
				 * if (cell.getCellType() == HSSFCell.CELL_TYPE_STRING) {
				 * System.out.print(cell.getStringCellValue()+" "); } else if(cell.getCellType()
				 * == HSSFCell.CELL_TYPE_NUMERIC) {
				 * System.out.print(cell.getNumericCellValue()+" "); } else
				 * if(HSSFDateUtil.isCellDateFormatted(cell)){ Date date =
				 * HSSFDateUtil.getJavaDate(cell.getNumericCellValue()); } else { //U Can Handel
				 * Boolean, Formula, Errors }
				 */

				summary.setDateofEntry(new DataFormatter().formatCellValue(nextRow.getCell(0)));
				summary.setDateofInterview(new DataFormatter().formatCellValue(nextRow.getCell(1)));
				summary.setPVSalesName(new DataFormatter().formatCellValue(nextRow.getCell(2)));
				summary.setPVSalesEmail(new DataFormatter().formatCellValue(nextRow.getCell(3)));
				summary.setPVSalesPhone(new DataFormatter().formatCellValue(nextRow.getCell(4)));
				summary.setPVSalesLinkedIn(new DataFormatter().formatCellValue(nextRow.getCell(5)));
				summary.setPVRecruiterName(new DataFormatter().formatCellValue(nextRow.getCell(6)));
				summary.setPVRecruiterEmail((new DataFormatter().formatCellValue(nextRow.getCell(7))));
				summary.setPVRecruiterPhone(new DataFormatter().formatCellValue(nextRow.getCell(8)));
				summary.setPVRecruiterLinkedIn((new DataFormatter().formatCellValue(nextRow.getCell(9))));
				summary.setSkillSet((new DataFormatter().formatCellValue(nextRow.getCell(10))));
				summary.setEndClientName((new DataFormatter().formatCellValue(nextRow.getCell(11))));
				summary.setECHiringManager((new DataFormatter().formatCellValue(nextRow.getCell(12))));
				summary.setECHiringManagerLinkedIn((new DataFormatter().formatCellValue(nextRow.getCell(13))));
				summary.setCandidateName((new DataFormatter().formatCellValue(nextRow.getCell(14))));
				summary.setCandidateEmail((new DataFormatter().formatCellValue(nextRow.getCell(15))));
				summary.setCandidatePhone((new DataFormatter().formatCellValue(nextRow.getCell(16))));
                summary.setCandidateCompanyName((new DataFormatter().formatCellValue(nextRow.getCell(17))));
                summary.setCandidateCompanyContact((new DataFormatter().formatCellValue(nextRow.getCell(18))));
                summary.setSITSalesName((new DataFormatter().formatCellValue(nextRow.getCell(19))));
                summary.setSITRecruiterName((new DataFormatter().formatCellValue(nextRow.getCell(20))));
                /*
				 * Map<String, String> inputMap = new HashMap<String, String>();
				 * inputMap.put("name", "Java2Novice"); inputMap.put("site",
				 * "http://java2novice.com");
				 */
				summaryList.add(summary);
				// System.out.println(summaryList);

				// JSON CONVERTER
				ObjectMapper mapper = new ObjectMapper();
				/*
				 * System.out.println("productsList: "+summary); DateFormat dateFormat = new
				 * SimpleDateFormat("yyyyMMddHHmmss"); Date date = new Date(); String location =
				 * dateFormat.format(date); System.out.println("productsList final: "+summary);
				 */

				// Convert object to JSON string and save into file directly
				mapper.writeValue(new File("success.json"), summaryList);
				// Convert object to JSON string and save into file directly
				// mapper.writeValue(new File("/SourceInfoProject/src/main/resources/success2.json"), summaryList);

				// Convert object to JSON string
				// String jsonInString = mapper.writeValueAsString(summaryList);
				// System.out.println("JsonInString " +jsonInString);

				// Convert object to JSON string and pretty print
				// jsonInString = mapper.writerWithDefaultPrettyPrinter()
				// .writeValueAsString(summary);
				// System.out.println("Final Json" +mapper.writerWithDefaultPrettyPrinter()
				// .writeValueAsString(summary));
				// mapper.writeValue(new File("/SourceInfoProject/src/main/resources/success2.json"),
				// jsonInString);

			}
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			/*
			 * InputStream inJson = SampleDTO.class.getResourceAsStream("/test.json");
			 * SampleDTO sample = new ObjectMapper().readValue(inJson, SampleDTO.class);
			 */

			/*
			 * try { br = new BufferedReader(new
			 * FileReader("/SourceInfoProject/src/main/resources/success.json")); } catch
			 * (FileNotFoundException e) { // TODO Auto-generated catch block
			 * e.printStackTrace(); } summaryList2 = (List<Summary>) new Gson().fromJson(br,
			 * Summary.class);
			 * 
			 * System.out.println("List size is"+ summaryList2.size());
			 * 
			 * }
			 */

			// ArrayList<Pattern> patterns = new ArrayList<>();

			// one type
			/*
			 * Gson gson = new Gson(); JsonParser jsonParser = new JsonParser(); try { br =
			 * new BufferedReader(new FileReader("/SourceInfoProject/src/main/resources/success.json"));
			 * JsonElement jsonElement = jsonParser.parse(br);
			 * 
			 * System.out.println("Buffered Reader is :"+br); //Create generic type Type
			 * type = new TypeToken<List<Summary>>() {}.getType();
			 * System.out.println("Type is :"+type.toString()); summaryList2=
			 * gson.fromJson(jsonElement, type); Object[] array2 = summaryList2.toArray();
			 * for(int i=0; i<array2.length;i++) {
			 * 
			 * System.out.println("Summary List 2 contents :"+array2[i] );
			 * 
			 * } System.out.println("List size is"+summaryList2.size());
			 * 
			 * for(Summary s : summaryList2) { summaryRepository.save(s);
			 * System.out.println(s.toString()); }
			 * 
			 * } catch (IOException e) { e.printStackTrace(); }
			 */

			JSONParser parser = new JSONParser();
			Object obj;
			try {
				obj = parser.parse(new FileReader("success.json"));
				JSONArray jsonArrayOfObj = (JSONArray) obj;

				for (int i = 0; i < jsonArrayOfObj.size(); i++) {
					JSONObject object = (JSONObject) jsonArrayOfObj.get(i);
					Summary s = new Summary();

					// String temp = (String) object.get("");
					// System.out.println("skillSet is :"+temp);
					s.setDateofEntry((String) object.get("dateofEntry"));
					s.setDateofInterview((String) object.get("dateofInterview"));
					s.setCandidateCompanyContact((String) object.get("candidateCompanyContact"));
					s.setCandidateCompanyName((String) object.get("candidateCompanyName"));
					s.setCandidateEmail((String) object.get("candidateEmail"));
					s.setCandidateName((String) object.get("candidateName"));
					s.setCandidatePhone((String) object.get("candidatePhone"));

					

					s.setPVRecruiterEmail((String) object.get("pvrecruiterEmail"));
					s.setPVRecruiterLinkedIn((String) object.get("pvrecruiterLinkedIn"));
					s.setPVRecruiterName((String) object.get("pvrecruiterName"));
					s.setPVRecruiterPhone((String) object.get("pvrecruiterPhone"));

					s.setPVSalesEmail((String) object.get("pvsalesEmail"));
					s.setPVSalesLinkedIn((String) object.get("pvsalesLinkedIn"));
					s.setPVSalesName((String) object.get("pvsalesName"));
					s.setPVSalesPhone((String) object.get("pvsalesPhone"));

					s.setSITRecruiterName((String) object.get("sitrecruiterName"));
					s.setSITSalesName((String) object.get("sitsalesName"));
					
					s.setEndClientName((String) object.get("endClientName"));
					s.setECHiringManager((String) object.get("echiringManager"));
					s.setECHiringManagerLinkedIn((String) object.get("echiringManagerLinkedIn"));
					

					s.setSkillSet((String) object.get("skillSet"));

					summaryRepository.save(s);

					// System.out.println("Json Object is "+object);
				}

			} catch (IOException | ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sourceinfo.employeemanagement.service.Iservice#getAllSummary()
	 */
	@Override
	public List<Summary> getAllSummary() {
		// TODO Auto-generated method stub

		Iterable<Summary> itr = summaryRepository.findAll();
		Iterator<Summary> iterator = itr.iterator();
		List<Summary> summaryList = new ArrayList<Summary>();
		while (iterator.hasNext()) {
			Summary s = iterator.next();
			summaryList.add(s);
		}

		System.out.println(summaryList);
		
		return summaryList;
	}

	
	
	@Override
	public void addSummaryFromTextFile(Summary summary) {
		// TODO Auto-generated method stub
		
		summaryRepository.save(summary);
	}

	@Override
    public void uploadFile(MultipartFile file) {
        // TODO Auto-generated method stub
       
	     System.out.println("req coming to service method");

       
         try {
            byte[] bytes = file.getBytes();
            
            System.out.println("req coming to sm");

           
             File excelFile = new File("interview_tracking_final.xlsx"); 
             FileOutputStream fileOutputStream = new FileOutputStream(excelFile);
                //write a the bytes to a new .xls file
                fileOutputStream.write(bytes);
                fileOutputStream.flush();
                fileOutputStream.close();
           
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
       
    }

	@Override
	public void addSummary(Summary summary) {
		// TODO Auto-generated method stub
		summaryRepository.save(summary);
	}

}

/*
 * (non-Javadoc)
 * 
 * @see com.sourceinfo.employeemanagement.service.Iservice#getAllInterviews()
 */
