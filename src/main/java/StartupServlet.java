package rastmonitor;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StartupServlet extends HttpServlet {
	  @Override
	  public void init() throws ServletException {
		  
		  System.out.println("**** StartupServlet invoked ****");
	  }

}
