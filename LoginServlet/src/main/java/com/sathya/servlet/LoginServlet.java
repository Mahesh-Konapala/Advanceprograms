package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//read the form data 
		
		String username=request.getParameter("username");
		String Password=request.getParameter("Password");
		
		//process the data
		String status;
		if(username.equals("Mahesh")&&Password.equals("Maahi@123"))
		{
			status="Login successfull";
		}
		else
		{
			status="Login fail";
		}
		
		//render the response to client
		PrintWriter writer =response.getWriter();
		
		response.setContentType("text/html");
		
		writer.println("<html>");
		writer.println("<h1> Login status...</h1>"+status);
		writer.println("</html>");
	}
}
		
		
		
		