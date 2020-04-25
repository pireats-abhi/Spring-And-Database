<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
		<h4>Create/Edit Student Information</h4>
		<form action="#">
			<label>Name:</label><br> <input type="text" name="name"><br>
			<label>Email:</label><br> <input type="text" name="email"><br>
			<label>Age:</label><br> <input type="text" name="age"><br>

			<label>Sex:</label><br> <input type="radio" name="gender"
				value="male"> <label>Male</label><br> <input
				type="radio" name="gender" value="female"> <label>Female</label><br>
			<input type="radio" name="gender" value="other"> <label>Other</label>
			<br><br> <input type="submit" value="Submit">
		</form>
	</div>
</body>
</html>