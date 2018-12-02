package com.home.model;

public class DisplayRecordModel {

	 private String applicantId;
	 private long phoneNumber;
     private String emailId;
	 private String password;
	 private String confirmPassword;
     private String firstName;
     private String middleName;
	 private String lastName;
     private String dateOfBirth;
     private String gender;
     private String nationality;
     private String aadharNumber;
     private String panNumber;
     private String Status;
     
     private String applicationId;
     private String property_location;
	 private String property_name;
	 private double estimated_property_amount;
	
	 private String incomeId;
	 private String employment_type;
	 private String employer_name;
	 private long monthly_income;
	 private int retirement_age;
	 private double max_loan_amount_grantable;
	 
	 private String loanId; 
	 private float interestRate;
	 private int tenure;
	 private double loanAmount;
	
	 private String addressId;
	 private String field1;
	 private String field2;
	 private String state;
	 private String city;
	 private String landmark;
	 private int pincode;
	 
	 private int accountNumber;	
	 private double accountBalance;
	 
	 
   public int getAccountNumber() {
			return accountNumber;
		}
   public void setAccountNumber(int accountNumber) {
			this.accountNumber = accountNumber;
		}
   public double getAccountBalance() {
			return accountBalance;
		}
   public void setAccountBalance(double accountBalance) {
			this.accountBalance = accountBalance;
		}
   
  //====================================================================================================== 
    public String getAddressId() {
			return addressId;
	}
	public void setAddressId(String addressId) {
			this.addressId = addressId;
	}	
	public String getField1() {
		return field1;
	}
	public void setField1(String field1) {
		this.field1 = field1;
	}
	public String getField2() {
		return field2;
	}
	public void setField2(String field2) {
		this.field2 = field2;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getApplicantId() {
		return applicantId;
	}
	
//=================================================================================================================	
	
	public void setApplicantId(String applicantId) {
		this.applicantId = applicantId;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
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
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	public String getStatus() {
 		return Status;
 	}
 	public void setStatus(String status) {
 		Status = status;
 	}
 	
 //=================================================================================================================
	
 	public String getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}
	public String getProperty_location() {
		return property_location;
	}
	public void setProperty_location(String property_location) {
		this.property_location = property_location;
	}
	public String getProperty_name() {
		return property_name;
	}
	public void setProperty_name(String property_name) {
		this.property_name = property_name;
	}
	public double getEstimated_property_amount() {
		return estimated_property_amount;
	}
	public void setEstimated_property_amount(double estimated_property_amount) {
		this.estimated_property_amount = estimated_property_amount;
	}
	public String getIncomeId() {
		return incomeId;
	}
	
//=================================================================================================================	

	public void setIncomeId(String incomeId) {
		this.incomeId = incomeId;
	}
	public String getEmployment_type() {
		return employment_type;
	}
	public void setEmployment_type(String employment_type) {
		this.employment_type = employment_type;
	}
	public String getEmployer_name() {
		return employer_name;
	}
	public void setEmployer_name(String employer_name) {
		this.employer_name = employer_name;
	}
	public long getMonthly_income() {
		return monthly_income;
	}
	public void setMonthly_income(long monthly_income) {
		this.monthly_income = monthly_income;
	}
	public int getRetirement_age() {
		return retirement_age;
	}
	public void setRetirement_age(int retirement_age) {
		this.retirement_age = retirement_age;
	}
	public double getMax_loan_amount_grantable() {
		return max_loan_amount_grantable;
	}
	public void setMax_loan_amount_grantable(double max_loan_amount_grantable) {
		this.max_loan_amount_grantable = max_loan_amount_grantable;
	}
	
	
//=================================================================================================================	
	public String getLoanId() {
		return loanId;
	}
	public void setLoanId(String loanId) {
		this.loanId = loanId;
	}
	public float getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
		 
}
 	