package test;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@SuppressWarnings("serial")
@WebServlet("/pis")
public class PlayerData extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		  
		String id = req.getParameter("id");
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String mid = req.getParameter("mid");
		String phone = req.getParameter("phone");
	     req.getParameter("submit");
	     res.setContentType("text/html");
	     PrintWriter p = res.getWriter();
	     p.println("User Id : "+id+"<br>");
	     p.println("User FName : "+fname+"<br>");
	     p.println("User LName : "+lname+"<br>");
	     p.println("User MailId : "+mid+"<br>");
	     p.println("User Phone Number : "+phone);
		 
		
	}

}
