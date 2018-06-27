<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>AADHAR REGISTRATION</title>
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
    .form-row{
    	font-size: 10px;
    }
    .form-control{
    	font-size: 10px;
    }
    .btn{
    font-size: 10px;
    }
    .input-group-text{
    font-size: 10px;
    }
  </style>
  <script type="text/javascript">
	function submitForm() {
		var nid = document.getElementById("username");
          if (!nid.value) {
			var messageContainer = document.getElementById("messageContainer");
			messageContainer.style.display = "block";
			messageContainer.innerHTML  = "Please provide username"
			nid.focus();
			return;
		}
		var Email = document.getElementById("email");
		if (!Email.value) {
			var messageContainer = document.getElementById("messageContainer");
			messageContainer.style.display = "block";
			messageContainer.innerHTML  = "Please provide Email"
			Email.focus();
			return;
		}
		var Password= document.getElementById("password");
		if (!Password.value) {
			var messageContainer = document.getElementById("messageContainer");
			messageContainer.style.display = "block";
			messageContainer.innerHTML  = "Please provide password"
		     password.focus();
			return;
		}
		var rpassword=document.getElementById("rpassword");
		if((password.value)!=(rpassword.value))
			{
			var messageContainer = document.getElementById("messageContainer");
			messageContainer.style.display = "block";
			messageContainer.innerHTML  = "password not matched"
		     rpassword.focus();
			return;
			 
			}
		document.forms[0].submit();
	}
</script>
</head>
<body>
<div class="container">
		<div class="jumbotron">			
			<div class="float-right"><a href="/StudentDirectory/login.jsp">Login</a></div>			
			<div ><div class="text-left">
			  <img src="img/college.jpg" class="rounded" alt="..." height="50px;"> Student Directory
			</div>
			</div>
		</div>

		<div class="row bottom" style="height: 400px;">
			
			<div class="col-sm-12 rounded" style="background: #e9ecef; padding-top: 10px; ">		
				<div>
				<p>Signup Here</p>
					</div>				
				<div class="alert alert-danger" role="alert" id="messageContainer" style="display: none;">				  
				</div>


				<form class="needs-validation" action="./signup" method="post" novalidate>
					<div class="form-row">
						<div class="col-md-4 mb-3">
							<label for="validationTooltip01">Username</label> <input
								type="text" class="form-control" id="username"
								placeholder="Username" name="username" required>
						</div>
						<div class="col-md-4 mb-3">
							<label for="validationTooltip02">Email</label> <input
								type="text" class="form-control" id="email"
								placeholder="Email"  name="email" required>
						</div>
						
					</div>
					<div class="form-row">
						<div class="col-md-6 mb-3">
						<label for="validationTooltip04">Password</label> <input type="password"
								class="form-control" id="password"
								placeholder="password" name="password" required>
							
						</div>
						<div class="col-md-3 mb-3">
							<label for="validationTooltip04">Re-enter-Password</label> <input type="password"
								class="form-control" id="rpassword"
								placeholder="Re-enter-password" name="rpassword" required>
							</div>						
						<div class="col-md-3 mb-3">
							<label for="validationTooltip05">Zip</label> <input type="text"
								class="form-control" id="validationTooltip05" placeholder="Zip"
								required>
						</div>
						</div>
					<button class="btn btn-primary" type="button" onclick="submitForm()">Submit form</button>
				</form>
			</div>

		</div>

	</div>

</body>
</html>