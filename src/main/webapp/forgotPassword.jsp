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
<h1>change your password here</h1>
<form action="forgotPassword">
<div class="form-group">
<p>Enter your Email</p>
<input type="email" name="emailId" id="emailId" placeholder="Enter Email"><br></div>
<div class="form-group">
<p>Enter your new Password</p>
<input type="password" name="newPassword" id="password" placeholder="Enter new Password" ></div>
<input type="submit" value="Change Password">


</form>

</div>


		
</body>
</html>