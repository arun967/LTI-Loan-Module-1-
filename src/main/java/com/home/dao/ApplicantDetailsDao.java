package com.home.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.home.model.IncomeDetailsModel;
import com.home.model.LoanDetailsModel;
import com.home.model.PropertyDetailsModel;
import com.home.model.ApplicantAddressModel;
import com.home.model.ApplicantDetailsModel;
import com.home.model.ApplicantLoginModel;
import com.home.model.DisplayRecordModel;
public class ApplicantDetailsDao implements IApplicantDetailsDao{
	
	private JdbcTemplate jdbcTemplate;  
	  
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
	    this.jdbcTemplate = jdbcTemplate;  
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
//===================================================================================================	
	
	public void savePropertyData(PropertyDetailsModel p)
	{
		
		System.out.println("INSIDE PROPERTY DAO");
		
		String sql= "insert into gr8_property_details values(gr8_property_details_seq.NEXTVAL,'"+p.getPropertyLocation()+"','"+p.getPropertyName()+"',"+p.getEstimatedPropertyAmount()+")";
		jdbcTemplate.update(sql); 
		
	}	
//====================================================================================================
	
	public void saveIncomeData(IncomeDetailsModel i)
	{  
		System.out.println("INSIDE INCOME DAO");
		
	    String aid_query = "select max(application_id) from gr8_property_details";
		String aid=jdbcTemplate.queryForObject(aid_query, String.class);
	   
		String pamount_query = "select estimated_property_amount from gr8_property_details where application_id = (select max(application_id) from gr8_property_details)";
		double max_loan=(Double)getJdbcTemplate().queryForObject(pamount_query, Double.class);
		
		System.out.println("inside dao 1 "+max_loan);
		double max_loan1 = 0.9 * max_loan;
		System.out.println("inside income dao 2"+max_loan1);
		i.setMaxLoanAmountGrantable(max_loan1);
		String sql= "insert into gr8_income_details values(gr8_income_details_seq.nextval, "+aid+",'"+i.getEmploymentType()+"','"+i.getEmployerName()+"',"+i.getMonthlyIncome()+","+i.getRetirementAge()+","+i.getMaxLoanAmountGrantable()+")";
		jdbcTemplate.update(sql); 
		
	}
	
	public double getMaxLoan(IncomeDetailsModel i)
	{
		
	      String max_loan = "select max_loan_amount_grantable from gr8_income_details where income_id = (select max(income_id) from gr8_income_details)";
		  System.out.println("inside getmaxloan");
		  double max_loan1=(Double)getJdbcTemplate().queryForObject(max_loan, Double.class);
	      System.out.println("getmaxloan block");
	      return max_loan1;
	}
	
//===================================================================================================	
	
	public void saveLoanData(LoanDetailsModel l)
	{
		
		System.out.println("INSIDE LOAN DAO");
	    String aid_query = "select max(application_id) from gr8_property_details";
		String aid=jdbcTemplate.queryForObject(aid_query, String.class);
	    
		String sql= "insert into gr8_loan_details values(gr8_loan_details_seq.nextval, "+aid+",'"+l.getInterestRate()+"',"+l.getTenure()+","+l.getLoanAmount()+")";
		jdbcTemplate.update(sql); 
		
	}
//===================================================================================================		
	
	public void saveApplicantData(ApplicantDetailsModel p)
	{
		System.out.println("INSIDE APPLICANT DAO");
		
		String aid_query = "select max(application_id) from gr8_property_details";
		String aid=jdbcTemplate.queryForObject(aid_query, String.class);
		
		
		String sql= "insert into gr8_applicant_details values(gr8_applicant_details_seq.nextval,'"+aid+"','"+p.getPhoneNumber()+"','"+p.getEmailId()+"','"+p.getPassword()+"','"+p.getConfirmPassword()+"','"+p.getFirstName()+"','"+p.getMiddleName()+"','"+p.getLastName()+"','"+p.getDateOfBirth()+"','"+p.getGender()+"','"+p.getNationality()+"','"+p.getAadharNumber()+"','"+p.getPanNumber()+"','Pending')";
		jdbcTemplate.update(sql); 
	}
   
//====================================================================================================

	public void saveAddressData(ApplicantAddressModel ad)
	{
		System.out.println("INSIDE APPLICANT DAO");
		
		String aid_query = "select max(application_id) from gr8_property_details";
		String aid=jdbcTemplate.queryForObject(aid_query, String.class);
		
		String sql= "insert into gr8_address_details values(gr8_address_details_seq.nextval,'"+aid+"','"+ad.getField1()+"','"+ad.getField2()+"','"+ad.getCity()+"','"+ad.getState()+"','"+ad.getLandmark()+"','"+ad.getPincode()+"')";
		jdbcTemplate.update(sql); 
	}
		
//====================================================================================================
	public String getDocName(int index) {
		String name;
		switch(index){
		   case 1: name="Pan Card";
		            break;
		   case 2: name="Voter-Id";
		            break;  
					
		   case 3: name="Salary Slip";
		            break;          
		   case 4: name="NOC Builder";
		            break;		            

		   case 5: name="LOA";
		            break;	
		   case 6: name="Agreement to Sale";
		            break;
		    case 7: name="Aadhaar Card";
		            break;
		   default : return "Apply for necessary document";
		           
		}
		return name;
	}


  
//====================================================================================================

}
