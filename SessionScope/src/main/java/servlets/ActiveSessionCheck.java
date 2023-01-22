package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ActiveSessionCheck extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	PrintWriter printWriter = response.getWriter();
	HttpSession httpSession = request.getSession();

	// Check if it is first time entering for the user to our application
	if (httpSession.getAttribute("hasVisited") == null) {
	    printWriter.print("<h1>Thanks for visiting our page, your welcome!</h1>");
	    httpSession.setAttribute("hasVisited", true);
	} else {
	    printWriter.print("<h1>Welcome back!</h1>");
	}
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	doGet(request, response);
    }

}
