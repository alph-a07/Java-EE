<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>

<html>

	<head>
	<meta charset="ISO-8859-1">
	<title>Feedback page</title>
	</head>
	
	<body>
		<h1>Provide your valuable feedback.</h1>

		<!-- action - URL path of page after submission of response -->
		<!-- GET vs POST -->
		<!-- GET will transmit response through URL path -->
		<!-- POST will transmit data in encrypted form -->
		<form action="feedbackReceieved" method="post">
			<!-- name - Input response name used when capturing response -->
			<textarea rows=10 name="feedbackParam"></textarea>
			<input type="submit" name="submit" value="Submit feedback" />
		</form>
	</body>
	
</html>