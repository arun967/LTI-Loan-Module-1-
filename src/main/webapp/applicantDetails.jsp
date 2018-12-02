<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isErrorPage = "true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/application3.css">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css" integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU" crossorigin="anonymous">

<title>APPLICANT DETAILS</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="css/bootstrap.min.css">

<!-- jQuery library -->
<script src="js/jquery-1.11.1.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="js/bootstrap.min.js"></script>

<!--
#ui {
background-color: #333;
padding: 30px;
margin-top: 30px;
border-radius: 10px;
opacity: 0.9;
}
#ui label{

color: #fff;
}
h1
{
text-align: center;;
}

</style>
 -->
 
 <style >
body {
background-image: url(images/l2.jpg);
background-size: cover;
background-position: center center;
background-attachment: fixed;
} 

</style>
<!--  
 <script type="text/javascript">


 function checkform(event)
 {
 	var myForm=document.applicationform;
 	var condition=true;
 	if(myForm.aadharNumber.value!=12){
 		alert("You cannot apply for more then you are eligible for");
 		condition=false;
 	}
 	}
</script>-->
<script type="text/javascript">
window.onload = function () {
	document.getElementById("password").onchange = validatePassword;
	document.getElementById("confirmPassword").onchange = validatePassword;
	<!--document.getElementById("phoneNumber").onchange = validateNumber;
	document.getElementById("panNumber").onchange = validatePanNumber;-->
}
function validatePassword(){
	var pass2=document.getElementById("password").value;
	var pass1=document.getElementById("confirmPassword").value;
	if(pass1!=pass2)
		document.getElementById("confirmPassword").setCustomValidity("Passwords Don't Match");
	else
		document.getElementById("confirmPassword").setCustomValidity('');	 
	//empty string means no validation error
	}
	<!--
function validateNumber(){
var no=document.getElementById("aadharNumber").value.length;

if(no==12)
	document.getElementById("aadharNumber").setCustomValidity("ENTER");
//empty string means no validation error
}
function validatePanNumber(){
	var no1=document.getElementById("panNumber").value.length;

	if(no1==10)
		document.getElementById("panNumber").setCustomValidity("ENTER");
	//empty string means no validation error
	}-->
</script>
</head>
<body>
<div class="container">
<div class="row ">
<div class="col-lg-3"></div>
<div class="col-lg-6">
<div id="ui">
<label><h1 class="text-center">&nbsp &nbsp&nbsp &nbsp&nbsp &nbspPERSONAL DETAILS</h1></label>
<form class="form-group" name="applicationform" action="saveApplicant">
<label>Phone Number: <i class="far fa-calendar "></i></label>
<input type="tel" name="phoneNumber" id="phoneNumber" class="form-control" placeholder="Enter your Phone Number" pattern="[7-9]{1}[0-9]{9}" maxlength="10" required>
<label>Email ID:</label>
<input type="email" name="emailId" class="form-control" placeholder="Enter your Email ID" required>
<div class="row">
<div class="col-lg-6">

<label>Password:</label>
<input type="password" name="password" id="password" class="form-control" placeholder="Enter your Password">

</div>

<div class="col-lg-6">

<label>Confirm Password</label>
<input type="password" name="confirmPassword" id="confirmPassword" class="form-control" placeholder="Re-type Password">

</div>
</div>
<div class="row">
<div class="col-lg-4">

<label>First Name:</label>
<input type="text" name="firstName" id="firstName" class="form-control" placeholder="First name" required>

</div>

<div class="col-lg-4">

<label>Middle Name:</label>
<input type="text" name="middleName" id="middleName" class="form-control" placeholder="Middle name" required>

</div>
<div class="col-lg-4">

<label>Last Name:</label>
<input type="text" name="lastName" id="lastname" class="form-control" placeholder="Last name" required>

</div>
</div>
<label>Date Of Birth:</label><br>
<input type="date" name="dateOfBirth" id="dateOfBirth" class="form-control" placeholder="Enter your Date of birth">

<label>Gender:</label><
<select name = "gender" class="form-control">
<option>Choose Gender</option>
<option>Male</option>
<option>Female</option>
<option>Other</option>
</select>

<label>Nationality:</label>
<select name="nationality" class="form-control">
  <option value="">-- Select One --</option>
  <option value="afghan">Afghan</option>
  <option value="albanian">Albanian</option>
  <option value="algerian">Algerian</option>
  <option value="american">American</option>
  <option value="andorran">Andorran</option>
  <option value="angolan">Angolan</option>
  <option value="antiguans">Antiguans</option>
  <option value="argentinean">Argentinean</option>
  <option value="armenian">Armenian</option>
  <option value="australian">Australian</option>
  <option value="austrian">Austrian</option>
  <option value="azerbaijani">Azerbaijani</option>
  <option value="bahamian">Bahamian</option>
  <option value="bahraini">Bahraini</option>
  <option value="bangladeshi">Bangladeshi</option>
  <option value="barbadian">Barbadian</option>
  <option value="barbudans">Barbudans</option>
  <option value="batswana">Batswana</option>
  <option value="belarusian">Belarusian</option>
  <option value="belgian">Belgian</option>
  <option value="belizean">Belizean</option>
  <option value="beninese">Beninese</option>
  <option value="bhutanese">Bhutanese</option>
  <option value="bolivian">Bolivian</option>
  <option value="bosnian">Bosnian</option>
  <option value="brazilian">Brazilian</option>
  <option value="british">British</option>
  <option value="bruneian">Bruneian</option>
  <option value="bulgarian">Bulgarian</option>
  <option value="burkinabe">Burkinabe</option>
  <option value="burmese">Burmese</option>
  <option value="burundian">Burundian</option>
  <option value="cambodian">Cambodian</option>
  <option value="cameroonian">Cameroonian</option>
  <option value="canadian">Canadian</option>
  <option value="cape verdean">Cape Verdean</option>
  <option value="central african">Central African</option>
  <option value="chadian">Chadian</option>
  <option value="chilean">Chilean</option>
  <option value="chinese">Chinese</option>
  <option value="colombian">Colombian</option>
  <option value="comoran">Comoran</option>
  <option value="congolese">Congolese</option>
  <option value="costa rican">Costa Rican</option>
  <option value="croatian">Croatian</option>
  <option value="cuban">Cuban</option>
  <option value="cypriot">Cypriot</option>
  <option value="czech">Czech</option>
  <option value="danish">Danish</option>
  <option value="djibouti">Djibouti</option>
  <option value="dominican">Dominican</option>
  <option value="dutch">Dutch</option>
  <option value="east timorese">East Timorese</option>
  <option value="ecuadorean">Ecuadorean</option>
  <option value="egyptian">Egyptian</option>
  <option value="emirian">Emirian</option>
  <option value="equatorial guinean">Equatorial Guinean</option>
  <option value="eritrean">Eritrean</option>
  <option value="estonian">Estonian</option>
  <option value="ethiopian">Ethiopian</option>
  <option value="fijian">Fijian</option>
  <option value="filipino">Filipino</option>
  <option value="finnish">Finnish</option>
  <option value="french">French</option>
  <option value="gabonese">Gabonese</option>
  <option value="gambian">Gambian</option>
  <option value="georgian">Georgian</option>
  <option value="german">German</option>
  <option value="ghanaian">Ghanaian</option>
  <option value="greek">Greek</option>
  <option value="grenadian">Grenadian</option>
  <option value="guatemalan">Guatemalan</option>
  <option value="guinea-bissauan">Guinea-Bissauan</option>
  <option value="guinean">Guinean</option>
  <option value="guyanese">Guyanese</option>
  <option value="haitian">Haitian</option>
  <option value="herzegovinian">Herzegovinian</option>
  <option value="honduran">Honduran</option>
  <option value="hungarian">Hungarian</option>
  <option value="icelander">Icelander</option>
  <option value="indian">Indian</option>
  <option value="indonesian">Indonesian</option>
  <option value="iranian">Iranian</option>
  <option value="iraqi">Iraqi</option>
  <option value="irish">Irish</option>
  <option value="israeli">Israeli</option>
  <option value="italian">Italian</option>
  <option value="ivorian">Ivorian</option>
  <option value="jamaican">Jamaican</option>
  <option value="japanese">Japanese</option>
  <option value="jordanian">Jordanian</option>
  <option value="kazakhstani">Kazakhstani</option>
  <option value="kenyan">Kenyan</option>
  <option value="kittian and nevisian">Kittian and Nevisian</option>
  <option value="kuwaiti">Kuwaiti</option>
  <option value="kyrgyz">Kyrgyz</option>
  <option value="laotian">Laotian</option>
  <option value="latvian">Latvian</option>
  <option value="lebanese">Lebanese</option>
  <option value="liberian">Liberian</option>
  <option value="libyan">Libyan</option>
  <option value="liechtensteiner">Liechtensteiner</option>
  <option value="lithuanian">Lithuanian</option>
  <option value="luxembourger">Luxembourger</option>
  <option value="macedonian">Macedonian</option>
  <option value="malagasy">Malagasy</option>
  <option value="malawian">Malawian</option>
  <option value="malaysian">Malaysian</option>
  <option value="maldivan">Maldivan</option>
  <option value="malian">Malian</option>
  <option value="maltese">Maltese</option>
  <option value="marshallese">Marshallese</option>
  <option value="mauritanian">Mauritanian</option>
  <option value="mauritian">Mauritian</option>
  <option value="mexican">Mexican</option>
  <option value="micronesian">Micronesian</option>
  <option value="moldovan">Moldovan</option>
  <option value="monacan">Monacan</option>
  <option value="mongolian">Mongolian</option>
  <option value="moroccan">Moroccan</option>
  <option value="mosotho">Mosotho</option>
  <option value="motswana">Motswana</option>
  <option value="mozambican">Mozambican</option>
  <option value="namibian">Namibian</option>
  <option value="nauruan">Nauruan</option>
  <option value="nepalese">Nepalese</option>
  <option value="new zealander">New Zealander</option>
  <option value="ni-vanuatu">Ni-Vanuatu</option>
  <option value="nicaraguan">Nicaraguan</option>
  <option value="nigerien">Nigerien</option>
  <option value="north korean">North Korean</option>
  <option value="northern irish">Northern Irish</option>
  <option value="norwegian">Norwegian</option>
  <option value="omani">Omani</option>
  <option value="pakistani">Pakistani</option>
  <option value="palauan">Palauan</option>
  <option value="panamanian">Panamanian</option>
  <option value="papua new guinean">Papua New Guinean</option>
  <option value="paraguayan">Paraguayan</option>
  <option value="peruvian">Peruvian</option>
  <option value="polish">Polish</option>
  <option value="portuguese">Portuguese</option>
  <option value="qatari">Qatari</option>
  <option value="romanian">Romanian</option>
  <option value="russian">Russian</option>
  <option value="rwandan">Rwandan</option>
  <option value="saint lucian">Saint Lucian</option>
  <option value="salvadoran">Salvadoran</option>
  <option value="samoan">Samoan</option>
  <option value="san marinese">San Marinese</option>
  <option value="sao tomean">Sao Tomean</option>
  <option value="saudi">Saudi</option>
  <option value="scottish">Scottish</option>
  <option value="senegalese">Senegalese</option>
  <option value="serbian">Serbian</option>
  <option value="seychellois">Seychellois</option>
  <option value="sierra leonean">Sierra Leonean</option>
  <option value="singaporean">Singaporean</option>
  <option value="slovakian">Slovakian</option>
  <option value="slovenian">Slovenian</option>
  <option value="solomon islander">Solomon Islander</option>
  <option value="somali">Somali</option>
  <option value="south african">South African</option>
  <option value="south korean">South Korean</option>
  <option value="spanish">Spanish</option>
  <option value="sri lankan">Sri Lankan</option>
  <option value="sudanese">Sudanese</option>
  <option value="surinamer">Surinamer</option>
  <option value="swazi">Swazi</option>
  <option value="swedish">Swedish</option>
  <option value="swiss">Swiss</option>
  <option value="syrian">Syrian</option>
  <option value="taiwanese">Taiwanese</option>
  <option value="tajik">Tajik</option>
  <option value="tanzanian">Tanzanian</option>
  <option value="thai">Thai</option>
  <option value="togolese">Togolese</option>
  <option value="tongan">Tongan</option>
  <option value="trinidadian or tobagonian">Trinidadian or Tobagonian</option>
  <option value="tunisian">Tunisian</option>
  <option value="turkish">Turkish</option>
  <option value="tuvaluan">Tuvaluan</option>
  <option value="ugandan">Ugandan</option>
  <option value="ukrainian">Ukrainian</option>
  <option value="uruguayan">Uruguayan</option>
  <option value="uzbekistani">Uzbekistani</option>
  <option value="venezuelan">Venezuelan</option>
  <option value="vietnamese">Vietnamese</option>
  <option value="welsh">Welsh</option>
  <option value="yemenite">Yemenite</option>
  <option value="zambian">Zambian</option>
  <option value="zimbabwean">Zimbabwean</option>
</select>

<div class="col-lg-4">

<label>Address Field 1:</label>
<input type="text" name="field1" id="field1" class="form-control" placeholder="Middle name" required>
</div>

<div class="col-lg-4">

<label>Address Field 2:</label>
<input type="text" name="field2" id="field2" class="form-control" placeholder="Middle name" required>
</div>

<div class="col-lg-4">

<label>State:</label>
<input type="text" name="state" id="state" class="form-control" placeholder="Middle name" required>
</div>

<div class="col-lg-4">

<label>City:</label>
<input type="text" name="city" id="city" class="form-control" placeholder="Middle name" required>
</div>

<div class="col-lg-4">

<label>landmark:</label>
<input type="text" name="landmark" id="landmark" class="form-control" placeholder="Middle name" required>
</div>

<div class="col-lg-4">

<label>Pincode</label>
<input type="number" name="pincode" id="pincode" class="form-control" placeholder="Middle name" required>
</div>


<label>Aadhar Number:</label>
<input type="text" name="aadharNumber" id="aadharNumber" class="form-control" length="12" placeholder="Enter your AAdhar Number">
<label>Pan Number:</label>
<input type="text" name="panNumber" id="panNumber" class="form-control" placeholder="Enter your Pan Number" pattern="[A-Z]{4}[0-9]{6}" maxlength="10"><br>
<input type="submit" value="submit" name="submit" class="btn-btn-primary btn-block btn-lg">
</form>
</div>
</div>

<div class="col-lg-3"></div>


</div>

</body>
</html>

