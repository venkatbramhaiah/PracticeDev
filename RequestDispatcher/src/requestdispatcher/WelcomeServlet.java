package requestdispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelcomeServlet extends HttpServlet {
	
	public void  doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException{
		
		resp.setContentType("text/html");
	PrintWriter pw=resp.getWriter();
	String name=req.getParameter("Username");
	pw.println("Successfully login");
		
	}

}
