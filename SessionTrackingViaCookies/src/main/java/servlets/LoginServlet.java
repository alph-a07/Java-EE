package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	doPost(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	// Fetch input
	String userName = request.getParameter("userName");
	String password = request.getParameter("password");

	PrintWriter printWriter = response.getWriter();

	// Print user name and password
	printWriter.print("<h1>Username : " + userName + "</h1><br>");
	printWriter.print("<h3>Password : " + password + "</h3><br>");
	
	// Create cookies
	Cookie userNameCookie = new Cookie("userName", userName);
	Cookie passwordCookie = new Cookie("password", password);
	
	// Add response cookies
	response.addCookie(userNameCookie);
	response.addCookie(passwordCookie);
	
	printWriter.print("<a href = '/SessionTrackingViaCookies/displayCookies'>Display cookies</a>");
    }

}
