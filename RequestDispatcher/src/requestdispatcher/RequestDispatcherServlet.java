package requestdispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class RequestDispatcherServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		
		resp.setContentType("text/plain");
		
		PrintWriter pw=resp.getWriter();
		
		String name=req.getParameter("Username");
		String pass=req.getParameter("Userpass");
		
		if(pass.equals("Venkat"))
		{
			RequestDispatcher rd= req.getRequestDispatcher("Servlet2");
			rd.forward(req, resp);
			
		}
		else
		{
			pw.println("Please enter the correct password");
			RequestDispatcher rd= req.getRequestDispatcher("/index.html");
			rd.forward(req, resp);
	
		}
}
}