<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employee Management Screen</title>

<script src="resources/js/jquery-1.9.1.js"></script>
<script src="resources/js/bootstrap.min.js"></script>
<link href="resources/css/bootstrap.css" rel="stylesheet">
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

	<nav class="navbar navbar-default">
	<div class="container-fluid">
		<div class="navbar-header page-scroll">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#bs-example-navbar-collapse-1">
				<span class="sr-only">Toggle navigation</span> Menu <i
					class="fa fa-bars"></i>
			</button>
			<a class="navbar-brand" href="${pageContext.request.contextPath}/">Employee
				Tracking System</a>
		</div>

		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav navbar-left">
				<li class="active">
				<li><a href="${pageContext.request.contextPath}/newEmployee">Add
						Employee</a></li>
			</ul>
		</div>
	</div>
	</nav>

	<div class="main_bg">
		<div class="wrap">
			<div class="main">
				<div class="container">
					<div class="row">
						<form:form modelAttribute="employee">
							<div class="col-md-6 col-xs-12">


								<td>Name:<input type="text" class="form-control" readonly="readonly"
									value="${employee.name}">
								</td>

								<td>Employee No:<input type="text" class="form-control" readonly="readonly"
									value="${employee.employeeNo}">
								</td>
								
								<td>E-Mail:<input type="text" class="form-control" readonly="readonly"
									value="${employee.e_mail}">
								</td>
								
							</div>
							<div class="col-md-6 col-xs-12">
								<td>Surname:<input type="text" class="form-control" readonly="readonly"
									value="${employee.surname}">
								</td>
								
									
								<td>Anual Leave Day:<input type="text" class="form-control" readonly="readonly"
									value="${employee.anualLeaveDay}">
								</td>

								<td>Phone:<input type="text" class="form-control" readonly="readonly"
									value="${employee.phone}">
								</td>
							</div>
						</form:form>
					</div><br></br>
					<hr>
					
					<div class="table-responsive">
							<table id="example" class="table table-striped table-bordered">
								<thead>
									<tr>
										<th>Employee Name</th>
										<th>Employee Surname</th>
										<th>Leave Day</th>
										<th>Start Date</th>
										<th>End Date</th>

									</tr>
								</thead>
								<tbody>

									<c:forEach var="empLeave" items="${listEmployeeLeave}">
										<tr>
											<td><c:out value="${empLeave.employee.name}" /></td>
											<td><c:out value="${empLeave.employee.surname}" /></td>
											<td><c:out value="${empLeave.leaveDay}" /></td>
											<td><c:out value="${empLeave.startDate}" /></td>
											<td><c:out value="${empLeave.endDate}" /></td>
									
									</c:forEach>
								</tbody>
							</table>
						</div>
					
				</div>
			</div>
		</div>
	</div>

</body>
</html>