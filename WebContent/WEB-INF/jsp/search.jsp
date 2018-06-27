<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<form action="./search" method="GET" name="searchForm">
	<div class="row">
		<div class="col-6">
			<input type="text" class="form-control"
				placeholder="Search by First name" name="firstName" id="firstName"
				value="${firstName}">
		</div>
		<div class="col-6">
			<input type="text" class="form-control"
				placeholder="Search by Last name" name="lastName" id="lastName"
				value="${lastName}">
		</div>
	</div>
	<br>
	<div>
		<input type="submit" value="Search">
	</div>
</form>
<c:if test="${not empty users}">

	<div class="row">
		<div class="col-12">
			<table class="table table-bordered">
				<thead>
					<tr>
						<th scope="col">#</th>
						<th scope="col">First</th>
						<th scope="col">Last</th>
						<th scope="col">Handle</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="user" items="${users}">
						<tr>
							<th scope="row">1</th>
							<td>${user.fname}</td>
							<td>${user.lname}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</c:if>
