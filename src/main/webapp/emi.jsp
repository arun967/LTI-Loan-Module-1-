<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page isErrorPage = "true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>EMI Calculator</title>
<style >
body{
background-image: url(images/cal1.jpg);
background-size: cover;
}
</style>
<script type="text/javascript">
        function emi()
        {
                var principal = document.formval.principal_amt.value; // pick principal value from from..
                var roi = document.formval.roi.value/(100*12);
                var tenure = document.formval.tenure.value; // pick tenure value from from..
                var tenureinmonths = tenure * 12;
                var compoundinterest = (principal * roi * Math.pow((1+roi),tenureinmonths))/(Math.pow((1+roi),tenureinmonths)-1); 
                var emi = Math.ceil(compoundinterest * 100) / 100; //to calculate 
    			if(principal>=0 && roi>=0 && tenure>=0){
                document.formval.fieldemi.value = emi.toFixed(2);     // to assign value in emi as fixed upto two decimal..
    			}
    			else{
    				document.write("Invalid inputs");
        } 
        </script>
</head>
<body>
	<form name="formval">
		<table cellpadding=3 align="center">
			<caption>
				<h1><b><u>EMI Calculator</u></b></h1><br><br>
			</caption><br><br><br>
			<tr>
				<td>Loan Amount :</td>
				<td><input name="principal_amt" type="text"></td>
			</tr>
			<tr>
				<td>Tenure(in years) :</td>
				<td><input name="tenure" type="text"></td>
			</tr>
			<tr>
				<td>ROI(in years) :</td>
				<td><input name="roi" type="text"></td>
			</tr>
		<tr>
<td>Calculate:</td>	<td>	<input type="button" name="calculate" value="Calculate"
			onclick="emi()"> </td></tr>
	
			<tr>
				<td>EMI :</td>
				<td><input name="fieldemi" type="text" readonly></td>
			</tr>
		</table>
	</form>
</body>
</html>