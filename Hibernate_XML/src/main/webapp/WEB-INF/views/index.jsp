<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
table, th, td {
	text-align: center;
	border: 1px solid black;
}
</style>
</head>
<body>
	<div style="text-align: center;">
		<h2>Student Information</h2>
		<a href="crtstudent">Create New Student</a>
	</div>
	<br>
	<table style="width: 100%;">
		<tr>
			<th>Name</th>
			<th>Email</th>
			<th>Age</th>
			<th>Sex</th>
			<th>System</th>
		</tr>
		<c:forEach items="${stud}" var="s">
			<tr>
				<td>${s.name}</td>
				<td>${s.email}</td>
				<td>${s.age}</td>
				<td>${s.sex}</td>
				<td><a href="student?id=${s.id}">Edit</a>&nbsp&nbsp<a href="dltStud?id=${s.id}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>