package com.home.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.home.dao.ApplicantDetailsDao;
import com.home.dao.ApplicantLoginDao;
import com.home.model.ApplicantDetailsModel;
import com.home.model.ApplicantLoginModel;
import com.home.model.DisplayRecordModel;

@Controller
public class ApplicantLoginController { 
	
	@Autowired
	ApplicantLoginDao ldao;
	
	@Autowired
	ApplicantDetailsDao adao;
	
	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response , @ModelAttribute ApplicantLoginModel l,ApplicantDetailsModel a) throws ServletException, IOException{
		
		System.out.println("INSIDE LOGIN CONTOLLER");
		
	    String email = l.getEmailId();
		String pass = l.getPassword();	
	
	
		
		HttpSession session=request.getSession();  
        session.setAttribute("email",l.getEmailId());  
        
		ApplicantDetailsModel appl = ldao.validateApplicantdetails(l);
		System.out.println("LOGIN 2");
		
		String name = ldao.getFirstName(l);
		System.out.println("hey"+ name);
		
		
		if(appl !=null) {
			
			
			

			
			 ModelAndView model=new ModelAndView();
			 model.addObject("firstName", name);
			 model.setViewName("loggedIn");
			 return model;		
			
		}
		else {
			
			return new ModelAndView("sorry");
		}
		
		}
	

	
	
	@RequestMapping("/yourRecord")
	public ModelAndView yourRecord(HttpServletRequest request, HttpServletResponse response , @ModelAttribute ApplicantLoginModel l,ApplicantDetailsModel a,DisplayRecordModel d) throws ServletException, IOException{
		
		     HttpSession session=request.getSession();
		     String email = (String) session.getAttribute("email");
		     l.setEmailId(email);
			 
		     List<DisplayRecordModel> lst = ldao.displayLoanRecord(l);
			
			 
			 
			 ModelAndView model=new ModelAndView();
			 model.addObject("list", lst);
			 model.setViewName("yourRecord");
			 return model;		
			
		}
	
	@RequestMapping("/loanTrack")
	public ModelAndView loanTrack(HttpServletRequest request, HttpServletResponse response , @ModelAttribute ApplicantLoginModel l,ApplicantDetailsModel a,DisplayRecordModel d) throws ServletException, IOException{
		
		     HttpSession session=request.getSession();
		     String email = (String) session.getAttribute("email");
		     l.setEmailId(email);
			 
		   String loanStatus = ldao.getLoanStatus(l);
			
			 if (loanStatus.equals("approved")) 
			 {
				 ModelAndView model=new ModelAndView();
				 model.addObject("loanStatus", loanStatus);
				 model.setViewName("loanStatus");
				 return model;		
				 
				 
			 }
			 else 
			 {
				 ModelAndView model=new ModelAndView();
				 model.addObject("list", loanStatus);
			     model.setViewName("loanStatus1");
			     return model;		
			 }
		}

	@RequestMapping("/yourAccount")
	public ModelAndView yourAccount(HttpServletRequest request, HttpServletResponse response , @ModelAttribute ApplicantLoginModel l,ApplicantDetailsModel a,DisplayRecordModel d) throws ServletException, IOException{
		
		     HttpSession session=request.getSession();
		     String email = (String) session.getAttribute("email");
		     l.setEmailId(email);
			 
		     List<DisplayRecordModel> lst = ldao.displayLoanRecord(l);
			
			 ModelAndView model=new ModelAndView();
			 model.addObject("list", lst);
			 model.setViewName("yourAccount");
			 return model;		
			
		}
	
	
	
	
}
