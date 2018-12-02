package com.home.model;

public class ApplicantLoginModel {
	private String emailId;
	   private String password;
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = MD5.getMd5(password);
	}
}
