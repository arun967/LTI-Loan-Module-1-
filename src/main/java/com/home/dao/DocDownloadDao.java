package com.home.dao; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import com.home.model.ApplicantDetailsModel;
import com.home.model.IncomeDetailsModel;
import com.home.model.LoanDetailsModel;
import com.home.model.PropertyDetailsModel;

public class DocDownloadDao implements IApplicantDetailsDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	public String getlocation(long gs_aadhar,String document_name )
	{
		String loc=null;
		Object obj=null;
		
		System.out.println("Inside Download Dao");
		
		try {
			obj = jdbcTemplate.queryForObject("select "+document_name+" from gr12_documents where gs_aadhar_no="+gs_aadhar+"", String.class);
		} catch (DataAccessException e) {
			
			
			e.printStackTrace();
		}
		
		loc=obj.toString();
		System.out.println("location is : "+loc);
		return loc;
	}

	public void savePropertyData(PropertyDetailsModel p) {
		// TODO Auto-generated method stub
		
	}

	public void saveIncomeData(IncomeDetailsModel i) {
		// TODO Auto-generated method stub
		
	}

	public void saveLoanData(LoanDetailsModel l) {
		// TODO Auto-generated method stub
		
	}

	public void saveApplicantData(ApplicantDetailsModel p) {
		// TODO Auto-generated method stub
		
	}

	public String getDocName(int index) {
		// TODO Auto-generated method stub
		return null;
	}	

}

