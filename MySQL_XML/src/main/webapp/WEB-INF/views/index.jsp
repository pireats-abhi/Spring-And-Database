<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
		<a href="student">Create New Student</a>
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
		<tr>
			<td>Abhijeet Das</td>
			<td>ad@gmail.com</td>
			<td>25</td>
			<td>male</td>
			<td><a href="#">Edit</a>&nbsp&nbsp<a href="#">Delete</a></td>
		</tr>
		<tr>
			<td>Rajeeb Das</td>
			<td>rd@gmail.com</td>
			<td>28</td>
			<td>male</td>
			<td><a href="#">Edit</a>&nbsp&nbsp<a href="#">Delete</a></td>
		</tr>
		
	</table>
</body>
</html>