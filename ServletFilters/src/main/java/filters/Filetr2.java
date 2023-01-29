package filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Filetr2 implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
	    throws IOException, ServletException {
	// Filter2 logic
	System.out.println("This is Filter2");
	
	// Onto the next filter in chain or to the target servlet
	chain.doFilter(request, response);
	
	System.out.println("Filter2 executed");
    }

}
