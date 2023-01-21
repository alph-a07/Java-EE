package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class GenericServletClass extends GenericServlet{


	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		PrintWriter responseWriter = response.getWriter();
		responseWriter.print("<h1>This is a servlet extending GenericServlet class</h1>");
		responseWriter.print("<h3>Today is : "+  new Date() + "</h3>");
	}

}
