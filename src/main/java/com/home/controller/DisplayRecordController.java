package com.home.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.codec.multipart.SynchronossPartHttpMessageReader;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.home.dao.AdminDao;
import com.home.dao.ApplicantDetailsDao;
import com.home.model.AccountDetailsModel;
import com.home.model.ApplicantDetailsModel;
import com.home.model.ApplicantLoginModel;
import com.home.model.DisplayRecordModel;
import com.home.model.IncomeDetailsModel;

@Controller
public class DisplayRecordController {

	@Autowired
	AdminDao admindao;
    
	
	@RequestMapping(value="/displayRecord")
	public ModelAndView displayAdmin(HttpServletRequest request,HttpServletResponse response,HttpSession session,@ModelAttribute DisplayRecordModel d,ApplicantLoginModel l)
	{
		
		 
        //session.setAttribute("loanAmount",d.getLoanAmount()); 
	    
		List<DisplayRecordModel> lst = admindao.displayAllRecord();
		ModelAndView model=new ModelAndView();
		
	    model.addObject("list", lst);
	    model.setViewName("applicantRecord");
	    return model;
	    
	}
	
	@RequestMapping(value="/viewAllRecord/{applicationId}")  
    public ModelAndView viewAllRecord(@PathVariable int applicationId){  
        
		System.out.println(applicationId);
		List<DisplayRecordModel> lst = admindao.displayLoanRecord(applicationId);  
		ModelAndView model=new ModelAndView();
	    model.addObject("list", lst);
	    model.setViewName("adminView");
		return model;		
    }  
	
	@RequestMapping(value="/approveApplication/{applicationId}/{loanAmount}")  
    public ModelAndView approveApplication(@PathVariable("applicationId") int applicationId,@PathVariable("loanAmount") double loanAmount,HttpServletRequest request,HttpServletResponse response,HttpSession session,@ModelAttribute AccountDetailsModel d)
    		{  
       
		d.setAccountBalance(loanAmount);   
	    d.setApplicationId(applicationId);
	    System.out.println("ayushiomboiui");
		admindao.approveApplication(applicationId);  
		admindao.accountCreation(d);
		 System.out.println("ayushiomboiui sdbgjfasjdgho");
		return new ModelAndView("redirect:../../displayRecord");  
				
    }  
	
	@RequestMapping(value="/rejectApplication/{applicationId}")  
    public ModelAndView rejectApplication(@PathVariable int applicationId){  
        
	   admindao.rejectApplication(applicationId);  
	   return new ModelAndView("redirect:../displayRecord");
				
    }  
}
