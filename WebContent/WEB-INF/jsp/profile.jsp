
<script type="text/javascript">
	function submitForm() {
		var username = document.getElementById("username");
		var inputEmail = document.getElementById("inputEmail");
		var fname = document.getElementById("fname");
		var lname = document.getElementById("lname");
		var inputBranch = document.getElementById("inputBranch");

		var inputYear = document.getElementById("inputYear");
		var inputAddress = document.getElementById("inputAddress");
		var inputContact = document.getElementById("inputContact");
		var inputCity = document.getElementById("inputCity");
		var inputState = document.getElementById("inputState");

		if (!username.value) {
			alert("provide name");
			name.focus();
			return false;
		} else if (!fname.value) {
			alert("provide First name");
			fname.focus();
			return false;
		} else if (!lname.value) {
			alert("provide Last name");
			lname.focus();
			return false;
		}

		else if (!inputBranch.value) {
			alert("provide branch name");
			inputBranch.focus();
			return false;
		} else if (!inputEmail.value) {
			alert("provide email");
			inputEmail.focus();
			return false;
		} else if (!inputYear.value) {
			alert("provide joining year");
			inputYear.focus();
			return false;
		} else if (!inputAddress.value) {
			alert("provide joining year");
			inputAddress.focus();
			return false;
		} else if (!inputContact.value) {
			alert("provide mobile number");
			inputContact.focus();
			return false;
		} else if (!inputState.value) {
			alert("provide state name");
			inputState.focus();
			return false;
		}

		document.forms[0].submit();

	}
</script>
<form action="./updateProfile" method="POST" name="profileForm" >
				<div class="form-row">
				    <div class="col-3">
				    <label for="name">Username</label>
				      <input type="text" class="form-control" disabled="disabled" id="username"  value="${username}" >
				      <input type="hidden" name="username" value="${username}">
				    </div>
				    
				  </div>
				<div class="form-row">
				    <div class="col-4">
				    <label for="fname">First Name</label>
				      <input type="text" class="form-control" value="${user.fname}" name="fname" id="fname"  >
				    </div>
				    <div class="col-4">
				    <label for="lname">Last Name</label>
				      <input type="text" class="form-control" value="${user.lname}" name="lname" id="lname">
				    </div>
				  </div>
				  <div class="form-row">
				    <div class="form-group col-md-6">
				    <label for="inputEmail">Email</label>
				      <input type="email" class="form-control"  value="${user.email}" id="inputEmail"  name="email" >
				    </div>
				    <div class="form-group col-md-6">
				      <label for="inputBranch">Branch</label>
				      <input type="text" class="form-control" id="inputBranch" value="${user.branch}" name="branch">
				    </div>
				  </div>
				  <div class="form-row">
				  <div class="form-group col-md-6">
				    <label for="inputYear">Joining Year</label>
				  <input type="text" class="form-control" id="inputYear" value="${user.year}" name="year">
				  </div>
				  <div class="form-group col-md-6">
				    <label for="inputAddress">Address</label>
				    <input type="text" class="form-control" id="inputAddress" value="${user.address}" name="address">
				  </div>
				  </div>
				  <div class="form-row">
				    <div class="form-group col-md-6">
				      <label for="inputContact">Mobile No.</label>
				      <input type="text" class="form-control" id="inputContact" value="${user.contact}" name="contact">
				    </div>
				    <div class="form-group col-md-4">
				      <label for="inputCity">City</label>
				       <input type="text" class="form-control" id="inputCity" value="${user.city}" name="city">
				     
				    </div>
				    <div class="form-group col-md-2">
				      <label for="inputState">State</label>
				      <input type="text" class="form-control" id="inputState" value="${user.state}" name="state">
				    </div>
				  </div>
				  
				  <input type="button" value="Update" id="btn"  onclick="return submitForm()">
</form>