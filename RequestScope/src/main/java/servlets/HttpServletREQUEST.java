package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HttpServletREQUEST extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	doPost(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	PrintWriter printWriter = response.getWriter();

	printWriter.print("<h1>REQUEST HEADERS using in-built methods</h1>");
	
	// REQUEST HEADERS using in-built methods
	printWriter.print("Request loacale : " + request.getLocale() + "<br>");
	printWriter.print("Request content length : " + request.getContentLength() + "<br>");
	printWriter.print("Request server name : " + request.getServerName() + "<br>");
	printWriter.print("Request content type : " + request.getContentType() + "<br>");
	printWriter.print("Request context path : " + request.getContextPath() + "<br>");

	printWriter.print("<h1>REQUEST BODY using in-built methods</h1>");
	
	// REQUEST BODY
	printWriter.print("Request name parameter : " + request.getParameter("user-name") + "<br>");
	printWriter.print("Request name parameter : " + request.getParameter("user-country") + "<br>");
	
	printWriter.print("<h1>REQUEST HEADERS using request object</h1>");

	Enumeration<String> headerNames = request.getHeaderNames();

	for (; headerNames.hasMoreElements();) {
	    String headerName = headerNames.nextElement();
	    printWriter.print(headerName + " : " + request.getHeader(headerName) + "<br>");
	}
    }
}
