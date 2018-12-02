<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin View</title>
</head>
<body>
<h1>LOAN APPLICATIONS</h1>  
<table border="2" width="70%" cellpadding="2">
  
<tr>
<th>Application Id</th>
<th>First Name</th>
<th>Last Name</th>
<th>Loan Amount</th>
<th>Loan Status</th>
<th>View all Records</th>
<th>APPROVE</th>
<th>REJECT</th>
</tr>  
   
   <c:forEach var="emp" items="${list}">   
   <tr>  
   <td>${emp.applicationId}</td>  
   <td>${emp.firstName}</td>  
   <td>${emp.lastName}</td>  
   <td>${emp.loanAmount}</td>  
   <td>${emp.status}</td>  
<td><a href="viewAllRecord/${emp.applicationId}">View All Records</a></td>    
<td><a href="approveApplication/${emp.applicationId}/${emp.loanAmount}">Approve</a></td> 
<td><a href="rejectApplication/${emp.applicationId}">Reject</a></td>  

   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
   
</body>
</html>