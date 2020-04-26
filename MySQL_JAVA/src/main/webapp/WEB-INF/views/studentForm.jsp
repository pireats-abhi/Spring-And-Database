<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div style="padding-left: 20px;">
		<h4>Create/Edit Student Information</h4>
		<form action="editStudent">
			<input type="hidden" name="id" value="${s.id}"> <label>Name:</label><br>
			<input type="text" name="name" value="${s.name}"><br> <label>Email:</label><br>
			<input type="text" name="email" value="${s.email}"><br>
			<label>Age:</label><br> <input type="text" name="age"
				value="${s.age}"><br> <label>Sex:</label><br> <select
				name="sex">
				<option value="${s.sex}" selected>${s.sex}</option>
				<option value="male">Male</option>
				<option value="female">Female</option>
				<option value="other">Other</option>
			</select> <br>
			<br> <input type="submit" value="Submit">
		</form>
	</div>
</body>
</html>