<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isErrorPage = "true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Eligibility Calculator</title>
<style >
body{
background-image: url(images/cal1.jpg);
background-size: cover;
}
</style>
<script type="text/javascript">
        function eligibility()
        {
        	 
        	
                var monthly_income = document.formval.monthly_income.value; // pick principal value from from..
       
                var existing_emi = document.formval.existing_emi.value;
                // to calculate emi amount..
                var total_monthly_savings = monthly_income - existing_emi;
                // to calculate eligibility..
                var eligibility = 60*(0.4*total_monthly_savings);
    			if(eligibility>=0 ){
                document.formval.fieldeligibility.value= eligibility;     // to assign value in emi as fixed upto two decimal..
    			} 
    			else
    				document.write("Invalid inputs");
        } 
        </script>
</head>
<body>
<form name="formval" >
		<table  align="center">
			<caption>
				<h1><b><u>Eligibility Calculator</u></b></h1>
			</caption><br><br><br>
				<td>Monthly Income :</td>
				<td><input name="monthly_income" type="text"></td>
			</tr>
			
			<tr>
				<td>Existing Emi :</td>
				<td><input name="existing_emi" type="text"></td>
			</tr>
			<tr>
		
		        <td>Calculate:</td><td> <input type="button" name="calculate" value="Calculate"
			     onclick="eligibility()"> </td><br>
		    </tr>
			<tr>
				<td>Eligibility :</td>
				<td><input name="fieldeligibility" type="text" readonly></td>
			</tr>
		</table>
	</form>
</body>
</html>