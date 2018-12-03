package com.home.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.home.dao.ApplicantLoginDao.ApplicantdetailsMapper;
import com.home.model.AdminLoginModel;
import com.home.model.ApplicantDetailsModel;
import com.home.model.ApplicantLoginModel;
import com.home.model.ForgotPasswordModel;



public class AdminLoginDao {

private JdbcTemplate jdbctemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}
    private JdbcTemplate getJdbcTemplate() {
		return jdbctemplate;
    } 
    
public AdminLoginModel validateAdmin(AdminLoginModel l) {
	    
		String sql = "select * from gr8_admin where admin_id='"+l.getAdminId()+"'and password='"+l.getPassword()+"'";
		System.out.println("anuboi");
	    List<AdminLoginModel> applicants = jdbctemplate.query(sql, new AdmindetailsMapper());
	    System.out.println("anuboi 22222222");
	    
	    return applicants.size() > 0 ? applicants.get(0) : null;
	    }
	
	 public String getAdminName(AdminLoginModel l) 
	    {  
		 System.out.println("anuboi 44444444444444");
	   	     String adminName = "select admin_name from gr8_admin where admin_id='"+l.getAdminId()+"'";
	   	  System.out.println("anuboi 55555555555555");
		     String adminName1=(String)getJdbcTemplate().queryForObject(adminName, String.class);
		     return adminName1;   	 
	    }
	 
	 class AdmindetailsMapper implements RowMapper<AdminLoginModel> {
		 
		    public AdminLoginModel mapRow(ResultSet rs, int arg1) throws SQLException {
		    AdminLoginModel a= new AdminLoginModel();
		    a.setAdminId(rs.getLong(1));
		    a.setPassword(rs.getString(2));
		    System.out.println("anuboi 3333333333333");

		    return a;
		}
	}
	 
	
	
	
	
	
	
	
	
	
	
}
