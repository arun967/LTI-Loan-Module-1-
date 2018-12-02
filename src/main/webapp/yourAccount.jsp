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


<h1>YOUR ACCOUNT</h1>  
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
<th>Loan Amount Applied for</th> <td>${emp.loanAmount}</td>  </tr>
 <tr>
<th>Account Number</th> <td>${emp.accountNumber}</td>  </tr>
 <tr>
<th>Account Balance</th> <td>${emp.accountBalance}</td>  </tr>
 <tr>
</c:forEach> 

</table>






</body>
</html>