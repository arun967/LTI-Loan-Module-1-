package com.home.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.home.dao.ApplicantDetailsDao;
import com.home.model.ApplicantAddressModel;
import com.home.model.ApplicantDetailsModel;
import com.home.model.IncomeDetailsModel;
import com.home.model.LoanDetailsModel;
import com.home.model.PropertyDetailsModel;

@Controller
public class ApplicantDetailsController {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;  
	  
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
	    this.jdbcTemplate = jdbcTemplate;  
	}
	
	private JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	@Autowired
	ApplicantDetailsDao adao;
		
	@RequestMapping(value = "/saveProperty", method = RequestMethod.GET)
	public ModelAndView saveProperty(@ModelAttribute PropertyDetailsModel p,HttpServletRequest request, HttpServletResponse response) {
		
		System.out.println("INSIDE PROPERTY CONTROLLER");
	
		adao.savePropertyData(p);
		
		long s2 = p.getApplicationId();
		HttpSession pro = request.getSession(true);
	    pro.setAttribute("application_id", s2);
		
		return new ModelAndView("incomeDetails");
   }	
	
	@RequestMapping(value ="/saveIncome", method = RequestMethod.GET)
	public ModelAndView saveIncome(HttpServletRequest request, HttpServletResponse response,@ModelAttribute IncomeDetailsModel i) {
		
		  
		  System.out.println("INSIDE INCOME CONTROLLER");	
     	   
		     adao.saveIncomeData(i);
		  
     	     double max_loan2 = adao.getMaxLoan(i);
     	  	 
			 ModelAndView model=new ModelAndView();
			 model.addObject("max_loan_amount", max_loan2);
			
			 model.setViewName("loanDetails");
			 return model;		
  
	}
	
	@RequestMapping(value = "/saveLoan", method = RequestMethod.GET)
	public ModelAndView saveLoan(@ModelAttribute LoanDetailsModel l,IncomeDetailsModel i) {
		System.out.println("INSIDE LOAN CONTROLLER");
		adao.saveLoanData(l);
		
		double max_loan2 = adao.getMaxLoan(i);
		double loan_amount = l.getLoanAmount();
		
		if(loan_amount<max_loan2) {
			return new ModelAndView("applicantDetails");
		}
		else
		return new ModelAndView("incomeDetails");
		
		
	}
	
	@RequestMapping(value = "/saveApplicant", method = RequestMethod.GET)
	public ModelAndView saveApplicant(@ModelAttribute ApplicantDetailsModel a,ApplicantAddressModel ad) {
		System.out.println("INSIDE APPLICANT CONTROLLER");
		adao.saveApplicantData(a);
		adao.saveAddressData(ad);
		/*ModelAndView mv = new ModelAndView();
          String appid = a.getApplicantId();
         */
		//return new ModelAndView("applied","appid",appid);
		return new ModelAndView("applied");
	}
	
	
}