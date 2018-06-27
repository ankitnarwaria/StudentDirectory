<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Registry</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="css/bootstrap.min.css">
<style>
.jumbotron {
	padding: 1rem 1rem 1rem 1rem;
	margin-bottom: 5px;
}

.bottom {
	padding: 0rem 1rem 1rem 1rem;
}

.sidenav {
	padding-top: 20px;
	background-color: #f1f1f1;
	height: 100%;
}

.form-row {
	font-size: 10px;
}

.form-control {
	font-size: 10px;
}

#btn {
	font-size: 10px;
}

.form-group {
	font-size: 10px;
}
.table{
font-size: 10px;
}
</style>

</head>
<body>
     <% 
        String s="STUDENT";
        String t="TEACHER";
     %>
	<div class="container">
		<div class="jumbotron">

			<div class="float-right">
				<a href="/StudentDirectory/home.jsp">Home</a>
			</div>

			<div>
				<div class="text-left">
					<img src="img/college.jpg" class="rounded" alt="..." height="50px;">
					Student Directory <span style="color: orange;"><b>Hello
							${username}</b></span>
				</div>

			</div>
		</div>
    
		<div class="row bottom" style="height: 400px;">
			<div class="col-sm-3" style="padding-left: 0px;">
				<div class="col-sm-12 rounded sidenav"
					style="background: #e9ecef; font-size: 13px">
					<ul>
			 <c:choose>
			      <c:when test="${usertype=='STUDENT'}">
				        <li><a href="./dashboard"><b>Dashboard</b></a></li>
						<li><a href="./classwork"><b>Today's Class Work</b></a></li>
						<li><a href="./search"><b>Search</b></a></li>
						<li><a href="#"><b>Semester Details</b></a></li>
						<li><a href="./updateProfile"><b>Update Profile</b></a></li>
				 </c:when>    
							    <c:otherwise>
						 <li><a href="./dashboard"><b>Dashboard</b></a></li>
						<li><a href="#"><b>Update Class Work</b></a></li>
						<li><a href="./search"><b>Search</b></a></li>
						<li><a href="#"><b>Semester Details</b></a></li>
						<li><a href="./updateProfile"><b>Update Profile</b></a></li> 
							    </c:otherwise>
			</c:choose>
						
						
					</ul>
				</div>
			</div>
			<div class="col-sm-9 rounded"
				style="background: #e9ecef; padding-top: 10px;">
				<div class="text-center">
					<p style="color: blue;">Profile Status</p>
					${errormsg}
				</div>
				<div class="alert alert-danger" role="alert" id="messageContainer"
					style="display: none;"></div>

					<jsp:include page="${pageBody}"></jsp:include>

			</div>

		</div>
		

	</div>


</body>
</html>