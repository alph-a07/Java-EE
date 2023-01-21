package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletClass implements Servlet {

	ServletConfig config = null;

	@Override
	public void init(ServletConfig config) throws ServletException {
		this.config = config;

	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		PrintWriter responseWriter = response.getWriter();
		responseWriter.print("<h1>This is a servlet implementing Servlet interface</h1>");
		responseWriter.print("<h3>Today is : "+  new Date() + "</h3>");
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
	}

	@Override
	public ServletConfig getServletConfig() {
		return config;
	}

	@Override
	public String getServletInfo() {
		return null;
	}
}
