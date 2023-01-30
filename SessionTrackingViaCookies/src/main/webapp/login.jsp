<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1" />
        <title>Login page</title>
    </head>
    <body>
    	
    	<form action="loginServlet" method="post">
    	
    		<label>User name: </label>
    		<input type="text" name="userName"/>
    		
    		<br>
    		<br>
    		
    		<label>Password: </label>
			<input type="password" name="password"/>
			
			<br>
			<br>
			
			<input type="submit" name="login" value="Login"/>   
			 	
    	</form>
    	
    </body>
</html>
