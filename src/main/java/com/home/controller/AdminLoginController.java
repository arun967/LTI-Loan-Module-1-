package com.home.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.home.dao.AdminDao;
import com.home.dao.AdminLoginDao;
import com.home.model.AdminLoginModel;


@Controller
public class AdminLoginController {
   
	@Autowired
	AdminLoginDao aldao;
	
	@RequestMapping("/adminLogin")
	public ModelAndView adminLogin(@ModelAttribute AdminLoginModel alm) throws ServletException, IOException{
		
		long adminId = alm.getAdminId();
		String password = alm.getPassword();
		AdminLoginModel admin = aldao.validateAdmin(alm);
		String name = aldao.getAdminName(alm);
		
		if(null !=admin) {
			ModelAndView m = new ModelAndView();
			m.addObject("firstname", name);
			m.setViewName("admin");
			return m;
		}
		else
		{
			return new ModelAndView("adminLogin");
		}
		
	}
	
}

