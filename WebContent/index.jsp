<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>INDEX</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="css/bootstrap.min.css">
 
  
  <style>
  .jumbotron{
  	padding: 1rem 1rem 1rem 1rem;  
  	margin-bottom: 5px;
  }
  .bottom{
  	padding: 0rem 1rem 1rem 1rem;
  }
  .sidenav {
      padding-top: 20px;
      background-color: #f1f1f1;
      height: 100%;
    }
  </style>
  <script type="text/javascript">
	function submitForm() {
		var nid = document.getElementById("firstName");
		if (!nid.value) {
			var messageContainer = document.getElementById("messageContainer");
			messageContainer.style.display = "block";
			messageContainer.innerHTML  = "Please provide first name"
			nid.focus();
			return;
		}
		var lastName = document.getElementById("lastName");
		if (!lastName.value) {
			var messageContainer = document.getElementById("messageContainer");
			messageContainer.style.display = "block";
			messageContainer.innerHTML  = "Please provide last name"
			lastName.focus();
			return;
		}
		document.forms[0].submit();
	}
</script>
</head>
<body>
<div class="container">
		<div class="jumbotron">			
			<div class="float-right"><a href="login.jsp">Login</a></div>
			<div class="float-right"><a href="signup.jsp">SignUP</a></div>			
			<div ><div class="text-left">
			  <img src="img/college.jpg" class="rounded" alt="..." height="50px;"><span style=" color:red; font-size:30px;"> Student Directory</span>
			</div>
			</div>
		</div>

		<div class="row bottom" style="height: 400px;">
			
			<div class="col-sm-12 rounded" style="background: #e9ecef; padding-top: 10px; ">		
				<p style="text-align:center;">AADHAR REGISTRATION</p>
				<p style="text-align:center; color:green; font-size:30px;">This Page is for Information Registration <br> Made By ankit   </p>

			</div>
		</div>
	</div>


</body>
</html>