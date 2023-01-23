package servlets;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ImageAsResponse extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	
	// 1 - Set content type
	response.setContentType("image/png");
	
	// 2 - Convert web resource into stream
	// Image is in the input buffer
	InputStream inputStream = getServletContext().getResourceAsStream("images/gs0cwwza47da1.png");
	
	// 3 - Create a byte array of size of the image
	byte[] imageBytes = new byte[inputStream.available()];
	
	// 4 - Read the byte image
	// InputStream reads the number of bytes specified from the input buffer
	inputStream.read(imageBytes);
	
	// 5 - Write image to response output stream
	// Output stream writes the number of bytes specified from the InputStream
	response.getOutputStream().write(imageBytes);
	// response.getOutputStream().flush(); - Force write
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	doGet(request, response);
    }

}
