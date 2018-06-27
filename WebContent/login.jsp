
    <!DOCTYPE html>
<html lang="en">
<head>
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
  
  .container{
     background-image:url('img/pic1.jpg')  
  }
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
		var password = document.getElementById("password");
		if (!password.value) {
			var messageContainer = document.getElementById("messageContainer");
			messageContainer.style.display = "block";
			messageContainer.innerHTML  = "Please provide password"
			password.focus();
			return;
		}
		document.forms[0].submit();
	}
</script>
</head>
<body>
	<div class="container">
		<div class="jumbotron">			
			<div class="float-right"><a href="/StudentDirectory/signup.jsp">SignUp</a></div>			
			<div ><div class="text-left">
			  <img src="img/college.jpg" class="rounded" alt="..." height="50px;"> Student Directory			  
			</div>
			</div>
		</div>

		<div class="row bottom justify-content-center" style="height: 400px;">
			
			<div class="col-sm-8 rounded" style="background: #e9ecef; padding-top: 10px; ">		
				<div>
				<p>LOGIN HERE</p>
				${loginError}
				</div>				
				<div class="alert alert-danger" role="alert" id="messageContainer" style="display: none;">				  
				</div>
			    
				
				<form action="./login" method="POST" name="adharFOrm">
					<div class="row">
						<div class="col-4"></div>
						<div class="col-4">
					  
							<input type="text" class="form-control" placeholder="Username..."
								name="username" id="username"> <br> <input type="password"
								class="form-control" placeholder="password..." name="password"
								id="password"> <br> <input type="button" value="Login"
								onclick="submitForm()">
						</div>
						<div class="col-4"></div>						
					</div>
				
				</form>
			</div>

		</div>

	</div>

</body>
</html>
