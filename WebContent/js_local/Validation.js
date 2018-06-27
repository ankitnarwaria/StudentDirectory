function submitForm() {
	var name = document.getElementById("name");
	var branch = document.getElementById("branch");
	var inputEmail = document.getElementById("inputEmail");
	var inputYear = document.getElementById("inputYear");
	var inputAddress = document.getElementById("inputAddress");
	var inputNumber = document.getElementById("inputNumber");
	var inputCity = document.getElementById("inputCity");
	var inputState = document.getElementById("inputState");
	var inputZip = document.getElementById("inputZip");
	if (!name.value) {
		alert("provide name");
		name.focus();
		return false;
	} else if (!branch.value) {
		alert("provide branch name");
		branch.focus();
		return false;
	} else if (!inputEmail.value) {
		alert("provide email");
		return false;
	} else if (!inputYear.value) {
		alert("provide joining year");
		return false;
	} else if (!inputNumber.value) {
		alert("provide mobile number");
		return false;
	} else if (!inputState.value) {
		alert("provide state name");
		return false;
	}

	document.forms[0].submit();

}