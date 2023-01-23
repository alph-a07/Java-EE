<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
	<head>
	<meta charset="ISO-8859-1">
		<title>Little about you</title>
	</head>
	
	<body>
		<form action = "HttpServletREQUEST" method = "POST">
		<input type = "text" name = "user-name" id = "text_user-name">
		<select name = "user-country">
			<option> "India"</option>
			<option> "Pakistan"</option>
			<option> "Nepal"</option>
			<option> "USA"</option>
		</select>
		
		<br>
		
		<input type = "submit" value = "Let's go!">
		
		</form>
	</body>
</html>