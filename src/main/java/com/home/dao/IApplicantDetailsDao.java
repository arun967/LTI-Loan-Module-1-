package com.home.dao;

import com.home.model.ApplicantDetailsModel;
import com.home.model.IncomeDetailsModel;
import com.home.model.LoanDetailsModel;
import com.home.model.PropertyDetailsModel;

public interface IApplicantDetailsDao {
	 
	 public void savePropertyData(PropertyDetailsModel p); 
	 public void saveIncomeData(IncomeDetailsModel i);
	 public void saveLoanData(LoanDetailsModel l);
	 public void saveApplicantData(ApplicantDetailsModel p);
	 public String getDocName(int index);
}
