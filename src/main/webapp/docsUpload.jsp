<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Upload Documents</title>
<link href="css/newstyle.css" rel="stylesheet" type="text/css">
<link href="css/bootstrap.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css" integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU" crossorigin="anonymous">


<script type="text/javascript" src="js/bootstrap.js"></script>
<script type="text/javascript" src="js/jquery-1.11.1.min.js"></script>

<style type="text/css">
.bg{
background: url('images/image8.jpg') no-repeat;
background-size: cover;
}</style>

</head>
<body>


	<div class="container-fluid bg">
		<div class="row">
			<div class="col-md-4 col-sm-5 col-xs-12"></div>
			<div class="col-md-4 col-sm-5 col-xs-12">
				<form action="uploadDoc" method="post" id="log" enctype="multipart/form-data">
				<h1>Upload Documents</h1>
			<div class="form-group">
						<label>Pan Card:
 <input type="file" name="uploadField" />	</label>	</div>
					<div class="form-group">
						<label>Voter Id:
						 <input type="file" name="uploadField" />	</label>	
					</div>
					<div class="form-group">
						<label>Salary Slip:
 <input type="file" name="uploadField" />					</label>		</div>
					<div class="form-group">
						<label>NOC from Builder:
						 <input type="file" name="uploadField" /></label>
					</div>
					<div class="form-group">
						<label>LOA:<br>
 <input type="file" name="uploadField" />	</label>					</div>
<div class="form-group">
						<label> Agreement To Sale:
 <input type="file" name="uploadField" />				</label>		</div> 
 
                  <label>Aadhaar Card:<br>
 <input type="file" name="uploadField" />	</label>					</div>
					
					
				
					
					
					
					
					
					
					      <input type="submit" value="submit">

				</form>
			</div>
			<div class="col-md-4 col-sm-5 col-xs-12"></div>
		</div>
		</div>
		
</body>
</html>