package com.home.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.home.model.AccountDetailsModel;
import com.home.model.ApplicantDetailsModel;
import com.home.model.ApplicantLoginModel;
import com.home.model.DisplayRecordModel;

public class AdminDao {
	
	private JdbcTemplate jdbcTemplate;  
	  
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
	    this.jdbcTemplate = jdbcTemplate;  
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	
//===============================================================================================================
	
	 public void approveApplication(int applicationId)
	   {
		
		 String query1 = "update gr8_applicant_details set status = 'approved' where application_id ="+applicationId+"";
		 jdbcTemplate.update(query1);
			
	   }
	 
//================================================================================================================	 
	
	 public void rejectApplication(int applicationId)
	   {
		String query1 = "update gr8_applicant_details set status = 'Rejected' where application_id ='"+applicationId+"'";
		String query2 = "delete from gr8_account_details  where application_id ='"+applicationId+"'";
		jdbcTemplate.update(query1);
		jdbcTemplate.update(query2);
	   }
//================================================================================================================	
	 
	 public void accountCreation(AccountDetailsModel d)
	 
	 {
		 String sql= "insert into gr8_account_details values(gr8_account_details_seq.NEXTVAL,"+d.getApplicationId()+",'"+d.getAccountBalance()+"')";
	     jdbcTemplate.update(sql); 
	 }
//=================================================================================================================
	 
	 
	 
	 
	 
	 
	 
	 
	 
//===============================================================================================================
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
		 
	 
	 
//=================================================================================================================
	
	 public List<DisplayRecordModel> displayAllRecord()
	   {
		 String query = "Select * from gr8_property_details inner join gr8_income_details on gr8_property_details.application_id = gr8_income_details.application_id inner join gr8_loan_details ON gr8_loan_details.application_id=gr8_property_details.application_id inner join gr8_applicant_details ON gr8_applicant_details.application_id=gr8_property_details.application_id inner join gr8_address_details on gr8_address_details.application_id = gr8_property_details.application_id";

			return jdbcTemplate.query(query, new RowMapper<DisplayRecordModel>(){

			public DisplayRecordModel mapRow(ResultSet rs, int rowNum) throws SQLException {
			   
			   DisplayRecordModel drm = new DisplayRecordModel(); 
	          
			   System.out.println("inside admindao displayall record");
			   drm.setApplicationId(rs.getString(1));
	           drm.setProperty_location(rs.getString(2));
	           drm.setProperty_name(rs.getString(3));
	           drm.setEstimated_property_amount(rs.getDouble(4));
	           drm.setIncomeId(rs.getString(5));
	           drm.setEmployment_type(rs.getString(7));
	           drm.setEmployer_name(rs.getString(8));
	           drm.setMonthly_income(rs.getInt(9));
	           drm.setRetirement_age(rs.getShort(10));
	           drm.setMax_loan_amount_grantable(rs.getDouble(11));
	           drm.setLoanId(rs.getString(12));
	           drm.setInterestRate(rs.getFloat(13));
	           drm.setTenure(rs.getInt(14));
	           drm.setLoanAmount(rs.getDouble(15));
	           drm.setApplicantId(rs.getString(17));
	           drm.setPhoneNumber(rs.getLong(19));
	           drm.setEmailId(rs.getString(20));
	           drm.setPassword(rs.getString(21));
	           drm.setFirstName(rs.getString(23));
	           drm.setMiddleName(rs.getString(24));
	           drm.setLastName(rs.getString(25));
	           drm.setDateOfBirth(rs.getString(26));
	           drm.setGender(rs.getString(27));
	           drm.setNationality(rs.getString(28));
	           drm.setAadharNumber(rs.getString(29));
	           drm.setPanNumber(rs.getString(30));
	          
	           drm.setStatus(rs.getString(31));
	           drm.setAddressId(rs.getString(32));
	           drm.setField1(rs.getString(34));
	           drm.setField2(rs.getString(35));
	           drm.setState(rs.getString(36));
	           drm.setCity(rs.getString(37));
	           drm.setLandmark(rs.getString(38));
	           drm.setPincode(rs.getInt(39));
	          
	               
	           return drm;
			}
		
			
		});
	  }

//==================================================================================================================
	 
	 public List<DisplayRecordModel> displayLoanRecord(int applicationId)
	   {
		String query = "Select * from gr8_property_details inner join gr8_income_details on gr8_property_details.application_id = gr8_income_details.application_id inner join gr8_loan_details ON gr8_loan_details.application_id=gr8_property_details.application_id inner join gr8_applicant_details ON gr8_applicant_details.application_id=gr8_property_details.application_id inner join gr8_address_details on gr8_address_details.application_id = gr8_property_details.application_id where \r\n" + 
				"gr8_property_details.application_id = '"+applicationId+"'";
		
			return jdbcTemplate.query(query, new RowMapper<DisplayRecordModel>(){

			public DisplayRecordModel mapRow(ResultSet rs, int rowNum) throws SQLException {
			   
			   DisplayRecordModel drm = new DisplayRecordModel(); 
	          
			   System.out.println("hiiiiiiiiiiiiiiiii");
			   drm.setApplicationId(rs.getString(1));
	           drm.setProperty_location(rs.getString(2));
	           drm.setProperty_name(rs.getString(3));
	           drm.setEstimated_property_amount(rs.getDouble(4));
	           drm.setIncomeId(rs.getString(5));
	           drm.setEmployment_type(rs.getString(7));
	           drm.setEmployer_name(rs.getString(8));
	           drm.setMonthly_income(rs.getInt(9));
	           drm.setRetirement_age(rs.getShort(10));
	           drm.setMax_loan_amount_grantable(rs.getDouble(11));
	           drm.setLoanId(rs.getString(12));
	           drm.setInterestRate(rs.getFloat(13));
	           drm.setTenure(rs.getInt(14));
	           drm.setLoanAmount(rs.getDouble(15));
	           drm.setApplicantId(rs.getString(17));
	           drm.setPhoneNumber(rs.getLong(19));
	           drm.setEmailId(rs.getString(20));
	           drm.setPassword(rs.getString(21));
	           drm.setFirstName(rs.getString(23));
	           drm.setMiddleName(rs.getString(24));
	           drm.setLastName(rs.getString(25));
	           drm.setDateOfBirth(rs.getString(26));
	           drm.setGender(rs.getString(27));
	           drm.setNationality(rs.getString(28));
	           drm.setAadharNumber(rs.getString(29));
	           drm.setPanNumber(rs.getString(30));
	      
	           drm.setStatus(rs.getString(31));
	           drm.setAddressId(rs.getString(32));
	           drm.setField1(rs.getString(34));
	           drm.setField2(rs.getString(35));
	           drm.setState(rs.getString(36));
	           drm.setCity(rs.getString(37));
	           drm.setLandmark(rs.getString(38));
	           drm.setPincode(rs.getInt(39));
	           
	           
	           
	           
	           System.out.println("inside dao"+drm.getEmailId());
	           System.out.println("inside dao"+drm.getApplicationId());
	               
	           return drm;
			}	
		});
			
	   }
	 
}
