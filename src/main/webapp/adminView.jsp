<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>your record</h1>  
<table border="2" width="70%" cellpadding="2" align="left">
<c:forEach var="emp" items="${list}">   
<tr>
<th>Application Id</th><td>${emp.applicationId}</td>  </tr>
<tr>
<th>First Name</th><td>${emp.firstName}</td> </tr>
<tr>
<th>Middle Name</th><td>${emp.middleName}</td> </tr>
 <tr>
<th>Last Name</th><td>${emp.lastName}</td>  </tr>
 <tr>
<th>Email Id</th> <td>${emp.emailId}</td>  </tr>
 <tr>
<th>Phone No</th> <td>${emp.phoneNumber}</td>  </tr>
 <tr>
<th>Date of Birth</th> <td>${emp.dateOfBirth}</td>  </tr>
 <tr>
<th>Gender</th>  <td>${emp.gender}</td>  </tr>
 <tr>
<th>Nationality</th><td>${emp.nationality}</td>  </tr>
 <tr>
<th>Aadhar Number</th> <td>${emp.aadharNumber}</td>  </tr>
 <tr>
<th>Pan Number</th><td>${emp.panNumber}</td></tr>
 <tr>
<th>Loan Amount</th><td>${emp.loanAmount}</td>  </tr>
 <tr>
<th>Tenure</th> <td>${emp.tenure}</td>  </tr>
 <tr>
<th>Interest Rate</th><td>${emp.interestRate}</td> </tr>
 <tr>
<th>Address Field 1</th><td>${emp.field1}</td>  </tr>
 <tr>
<th>Address Field 2</th><td>${emp.field2}</td>  </tr>
 <tr>
<th>City</th><td>${emp.city}</td> </tr>
 <tr>
<th>State</th><td>${emp.state}</td> </tr>
 <tr>
<th>Landmark</th><td>${emp.landmark}</td></tr>
 <tr>
<th>Pincode</th><td>${emp.pincode}</td> </tr>
<tr>
<th>View Documents</th>  <td><a href="viewDocuments/${emp.applicationId}">View Documents</a></td>  
</tr> 
<tr>  
<th>Approve</th> <td><a href="approveApplication/${emp.applicationId}">Approve</a></td> 
</tr> 
<tr>
<th>Reject</th> <td><a href="rejectApplication/${emp.applicationId}">Reject</a></td>  
</tr>
 </table>  
 </c:forEach>   
   <br>  
   <br>  <br>  <br>  <br>  <br>  <br>  <br>  <br>  <br>  <br>  <br>  <br>  <br>  <br>  <br>  <br>  <br>  <br>  <br>  <br>  <br>  <br>  <br>  <br>  <br>  <br>  <br>  <br>  <br>    
  <!--   <div class="button"><a href="approveApplication/${emp.applicationId}">Approve</a></div>
   <div class="button"><a href="rejectApplication/${emp.applicationId}">Reject</a></div>-->
    
</body>
</html>