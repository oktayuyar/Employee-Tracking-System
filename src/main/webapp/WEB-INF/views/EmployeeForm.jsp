<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>New/Edit Contact</title>
	
	<script src="resources/js/bootstrap.min.js"></script>
	<link href="resources/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

    <nav class="navbar navbar-default">
        <div class="container-fluid">
            <div class="navbar-header page-scroll">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    Menu <i class="fa fa-bars"></i>
                </button>
                <a class="navbar-brand" href="${pageContext.request.contextPath}/">Employee Tracking System</a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-left">
                  	<li class="active">
						<li><a href="${pageContext.request.contextPath}/newEmployee">Add Employee</a>
					</li>
                </ul>
            </div>
        </div>
    </nav>
	
	<div align="center">
		<h1>New/Edit Employee</h1>
		<form:form action="${pageContext.request.contextPath}/saveEmployee"
			method="post" modelAttribute="employee">
			<table>
				<form:hidden path="id" />
				<tr>
					<td>Name:</td>
					<td><form:input path="name" /></td>
				</tr>
				<tr>
					<td>Surname:</td>
					<td><form:input path="surname" /></td>
				</tr>
				<tr>
					<td>Employee No:</td>
					<td><form:input path="employeeNo" /></td>
				</tr>
				<tr>
					<td>Anual Leave Day:</td>
					<td><form:input path="anualLeaveDay" /></td>
				</tr>
				<tr>
					<td>Email:</td>
					<td><form:input path="e_mail" /></td>
				</tr>
				<tr>
					<td>Address:</td>
					<td><form:input path="address" /></td>
				</tr>
				<tr>
					<td>Telephone:</td>
					<td><form:input path="phone" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="Save"></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>