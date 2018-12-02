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
background-image: url(images/bg.jpg);
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
<label><h1 class="text-center">&nbsp &nbsp&nbsp &nbsp&nbsp &nbspPROPERTY DETAILS</h1></label>
<form class="form-group" action="saveProperty">
<label>Property Location:</label>
<select class="form-control" name="propertyLocation">
<option>Choose Location</option>
<option>Mumbai</option>
<option>Delhi</option>
<option>Bangalore</option>
<option>Pune</option>
</select>
<label>Property Name:</label>
<select class="form-control" name="propertyName">
<option>Choose Name:</option>
<option>Lodha</option>
<option>Pallava</option>
<option>Hawara</option>
<option>Others</option>
</select>
<label>Estimated Amount:</label>
<input type="text" name="estimatedPropertyAmount" id="estimatedPropertyAmount" class="form-control" placeholder="Enter EStimated Amount of Property" required> 
<br>
<input type="submit" value="submit" name="submit" class="btn-btn-primary btn-block btn-lg">
</form>
</div>
</div>

<div class="col-lg-3"></div>


</div>

</body>
</html>

