<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isErrorPage = "true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/application3.css">

<title>APPLICANT DETAILS</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="css/bootstrap.min.css">

<!-- jQuery library -->
<script src="js/jquery-1.11.1.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="js/bootstrap.min.js"></script>


 <style >
body {
background-image: url(images/l2.jpg);
background-size: cover;
background-position: center center;
background-attachment: fixed;
} 

</style>
 
</head>
<body>
<div class="container">
<div class="row ">
<div class="col-lg-3"></div>
<div class="col-lg-6">
<div id="ui">
<label><h1 class="text-center">&nbsp &nbsp&nbsp &nbsp&nbsp &nbspINCOME DETAILS</h1></label>
<form class="form-group" action="saveIncome">

<label>Type Of Employee:</label>
<select class="form-control" name="employmentType" id="employmentType">
<option>Choose Type:</option>
<option>Salaried</option>
<option>Self-Employed</option>

</select><br>
<label>Employer Name:</label>
<input type="text" name="employerName" id="employerName" class="form-control" placeholder="Enter Employer Name" required> 
<br>
<label>Monthly Income:</label>
<input type="text" name="monthlyIncome" id="monthlyIncome" class="form-control" placeholder="Enter Monthly Income" required> 
<br>
<label>Retirement Age:</label>
<input type="text" name="retirementAge" id="retirementAge" class="form-control" placeholder="Enter Retirement Age" required> 
<br>
<input type="submit" value="submit" name="submit" class="btn-btn-primary btn-block btn-lg">
</form>
</div>
</div>

<div class="col-lg-3"></div>


</div>

</body>
</html>

