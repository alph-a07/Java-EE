package filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Filter1 implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
	    throws IOException, ServletException {
	// Filter1 logic
	System.out.println("This is Filter1");
	
	// Onto the next filter in chain or to the target servlet
	chain.doFilter(request, response);
	
	// Will be executed after filter chain ends
	System.out.println("Filter1 executed");
    }

}
