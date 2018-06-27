<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<script type="text/javascript">
	function loadSubjects() {
		document.forms[0].method = "GET";
		document.forms[0].submit();
	}
	function submitForm() {
		document.forms[0].method = "POST";
		document.forms[0].submit();
	}
</script>

<form action="./classwork" name="classwork">
	${classworkSaved}
	<div class="row">
		<div class="form-group col-12">
			<div class="form-group col-md-4">
				<label for="branch">Branch</label> <select id="branch"
					class="form-control" name="branch">
					<option selected>Choose...</option>
					<c:forEach var="branch" items="${branches }">
						<c:choose>
							<c:when test="${branch.id == selectedBranch}">
								<option value="${branch.id }" selected="selected">${branch.name }</option>
							</c:when>
							<c:otherwise>
								<option value="${branch.id }" >${branch.name }</option>
							</c:otherwise>
						</c:choose>
					</c:forEach>
				</select>
			</div>
			<div class="form-group col-md-4">
				<label for="semester">Semester</label> <select id="semester"
					class="form-control" name="semester" onchange="loadSubjects();">
					<option selected>Choose...</option>
					<c:forEach var="semester" items="${semesters }">
						<c:choose>
							<c:when test="${semester.id == selectedSemesterId}">
								<option value="${semester.id }" selected="selected">${semester.name}</option>
							</c:when>
							<c:otherwise>
								<option value="${semester.id }">${semester.name}</option>
							</c:otherwise>
						</c:choose>
					</c:forEach>
				</select>
			</div>
			<div class="form-group col-md-4">
				<label for="subject">Subject</label> <select id="subject"
					class="form-control" name="subject">
					<option selected>Choose...</option>
					<c:forEach var="subject" items="${subjects}">
						<option value="${subject.id }">${subject.name}</option>
					</c:forEach>
				</select>
			</div>
		</div>
		<div class="form-group col-md-6">
			<textarea rows="5" cols="50" name="classWorkDetails"></textarea>
			<input type="button" value="Save" onclick="submitForm()" />
		</div>


	</div>
	<br>
	<div></div>
</form>