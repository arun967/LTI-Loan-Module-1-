

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/Login.css" type="text/css">
</head>

<body>
<div class="loginbox">
<img src="images/login1.jpg" class="logo">
<h1>Login here</h1>
<form action="adminLogin">
<div class="form-group">
<p>Enter your Admin-Id</p>
<input type="number" name="adminId" id="adminId" placeholder="Enter Admin-Id"><br></div>
<div class="form-group">
<p>Password</p>
<input type="password" name="password" id="password" placeholder="Enter Password" ></div>
<input type="submit" value="Login">
<a href="#"> Forgot Password?</a><br>
<a href="#"> Don't have An Account?</a>

</form>

</div>

<script src="css/bootstrap-validate.js"></script>
<script>

bootstrapValidate(
		   '#emailId', 'email:Enter VAlid Email address'
		   
		);
bootstrapValidate(
		   '#password', 'regex:^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$:At least 8 chars consisting 1 digit,one lowercase,uppercase,special characters,no space tab etc'
  
		   
		);
		</script>
		
</body>
</html>

</body>
</html>