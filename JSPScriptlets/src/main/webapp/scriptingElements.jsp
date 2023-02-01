<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Scripting elements example</title>
	</head>
	
	<body>
		
		<!-- Declaration element -->
		<%!
			public String sayHello(String s)
			{
		    	return "Hello from " + s + "<br>";
			}
		%>
		
		<!-- Expression element -->
		<!-- printWriter.print(sayHello()); -->
		<%=
			sayHello("Expression element")
		%>
		
		<!-- Implicit objects -->
		<%
			out.print(sayHello("out implicit object"));
			response.getWriter().print(sayHello("response writer"));
		%>
		
	</body>
</html>