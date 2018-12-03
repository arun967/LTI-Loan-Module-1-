package com.home.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.home.model.ApplicantDetailsModel;
import com.home.model.ApplicantLoginModel;
import com.home.model.DisplayRecordModel;
import com.home.model.ForgotPasswordModel;

public class ApplicantLoginDao {
private JdbcTemplate jdbctemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}
    private JdbcTemplate getJdbcTemplate() {
		return jdbctemplate;
    }
    
	public ApplicantDetailsModel validateApplicantdetails(ApplicantLoginModel l) {
	    
		String sql = "select * from gr8_applicant_details where email_id='"+l.getEmailId()+"' and password='"+l.getPassword()+"'";
	    List<ApplicantDetailsModel> applicants = jdbctemplate.query(sql, new ApplicantdetailsMapper());
	    return applicants.size() > 0 ? applicants.get(0) : null;
	    }
	
	 public String getFirstName(ApplicantLoginModel l) 
	    {
		     
	   	     String firstName = "select first_name from gr8_applicant_details where email_id='"+l.getEmailId()+"'";
		     System.out.println("inside getFirstName");
		     String firstName1=(String)getJdbcTemplate().queryForObject(firstName, String.class);
		     return firstName1;
	    }
	  
	 
	   public void changePassword(ForgotPasswordModel fpm) {
	    	
		   String query1 = "update gr8_applicant_details set password ='"+fpm.getNewPassword()+"',confirm_password ='"+fpm.getNewPassword()+"' where email_id ='"+fpm.getEmailId()+"'";
		  System.out.println("djjjjjjjjjjjjjjjj");
		   jdbctemplate.update(query1);
	  	System.out.println("djjjjjjjjjjj2222222222");
	    }
	    
	 
	 
	 
	 public String getLoanStatus(ApplicantLoginModel l) 
	    {
		     
	   	     String loanStatus = "select status from gr8_applicant_details where email_id='"+l.getEmailId()+"'";
		     System.out.println("inside getLoanStatus");
		     String loanStatus1=(String)getJdbcTemplate().queryForObject(loanStatus, String.class);
		     return loanStatus1;
	    }
	 
	 
	 
	 public List<DisplayRecordModel> displayLoanRecord(ApplicantLoginModel l)
	   {
		 
		 
		String query = "Select * from gr8_property_details inner join gr8_income_details on gr8_property_details.application_id = gr8_income_details.application_id inner join gr8_loan_details ON gr8_loan_details.application_id=gr8_property_details.application_id inner join gr8_applicant_details ON gr8_applicant_details.application_id=gr8_property_details.application_id inner join gr8_address_details on gr8_address_details.application_id = gr8_property_details.application_id inner join gr8_account_details on gr8_account_details.application_id = gr8_property_details.application_id where \r\n" + 
				"gr8_applicant_details.email_id = '"+l.getEmailId()+"'";
		System.out.println("heyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy");
	 List<DisplayRecordModel> lst1=jdbctemplate.query(query, new Object[] {}, new BeanPropertyRowMapper<DisplayRecordModel>(DisplayRecordModel.class));
		
		return jdbctemplate.query(query, new RowMapper<DisplayRecordModel>(){

			public DisplayRecordModel mapRow(ResultSet rs, int rowNum) throws SQLException {
			   
			   DisplayRecordModel drm = new DisplayRecordModel(); 
	          
			 
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
	           
	           drm.setAccountNumber(rs.getInt(40));
	           drm.setAccountBalance(rs.getDouble(42));
	           
	           return drm;
			}
		
			
		});
	   }
	 
	 
	 
	 
class ApplicantdetailsMapper implements RowMapper<ApplicantDetailsModel> {
	 
	    public ApplicantDetailsModel mapRow(ResultSet rs, int arg1) throws SQLException {
	    ApplicantDetailsModel applicantdetails = new ApplicantDetailsModel();
	    applicantdetails.setApplicationId(rs.getInt("application_id"));
	    applicantdetails.setPassword(rs.getString("password"));
	    return applicantdetails;
	}
}






}
