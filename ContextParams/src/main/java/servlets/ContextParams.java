package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ContextParams extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	ServletContext context = getServletContext();
	PrintWriter printWriter = response.getWriter();

	printWriter.print("<h1>About me</h1>" + "My name : " + context.getInitParameter("my-name") + "<br> My e-mail : "
		+ context.getInitParameter("my-mail"));

	printWriter.print("<h1>List of param names</h1>");

	Enumeration<String> paramNames = context.getInitParameterNames();

	for (int i = 1; paramNames.hasMoreElements(); i++)
	    printWriter.print(i + " - " + paramNames.nextElement() + "<br>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	doGet(request, response);
    }

}
