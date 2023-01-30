package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DisplayCookies extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	
	// Get cookies array from request
	Cookie[] cookies = request.getCookies();
	
	PrintWriter printWriter = response.getWriter();

	// Print each cookie
	for (Cookie cookie : cookies) {
	    printWriter.print("Name : " + cookie.getName() + " :: Value : " + cookie.getValue() + "\n");
	}
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	doGet(request, response);
    }

}
