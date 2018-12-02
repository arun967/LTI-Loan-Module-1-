<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<%@ page isErrorPage = "true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Loan Details</title>
<link href="css/newstyle.css" rel="stylesheet" type="text/css">
<link href="css/bootstrap.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css" integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU" crossorigin="anonymous">


<script type="text/javascript" src="js/bootstrap.js"></script>
<script type="text/javascript" src="js/jquery-1.11.1.min.js"></script>

 <style >
body {
background-image: url(images/l2.jpg);
background-size: cover;
background-position: center center;
background-attachment: fixed;
} 

</style>


<script>

function checkform(event)
{
	var myForm=document.loanform;
	var condition=true;
	if(myForm.loan_amount.value>myForm.max_loan_amount_grantable.value){
		alert("You cannot apply for more then you are eligible for");
		condition=false;
	}
	}
</script>	<form action="saveLoan" id="log" name="loanform" onsubmit="checkform(event)">

</head>
<body>


	<div class="container">
<div class="row ">
<div class="col-lg-3"></div>
<div class="col-lg-6">
<div id="ui">
<label><h1 class="text-center">&nbsp &nbsp&nbsp  &nbsp&nbsp&nbsp &nbspLOAN DETAILS</h1></label>
<form action="saveLoan" id="log" name="loanform" onsubmit="checkform(event)"> 

                         <label>Max Loan Amount Grantable:</label>
						 <input type="text" value = "${max_loan_amount}"  readonly>
					
				
						<label>Interest rate:</label>
						 <input type="text" name="interestRate" value="8.5" class="form-control" readonly>
					
					
						<label>Tenure:</label>
						 <input type="text" name="tenure" class="form-control" placeholder="Tenure">
					

						<label> Loan Amount:</label>
						 <input type="text" name="loanAmount" class="form-control" placeholder="Loan Amount:">
			<br>
					
<input type="submit" value="submit" name="submit" class="btn-btn-primary btn-block btn-lg">
</form>
</div>
</div>

<div class="col-lg-3"></div>


</div>
</body>
</html>