package com.sathya.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet1")
public class LoginServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		String username= request.getParameter("username");
		String Password= request.getParameter("Password");
		
		
		String status;
		if(username.equals("Mahesh")&&Password.equals("Maahi@123"))
		{
			status="Login successfull....";
		}
		else {
			status="Login Fail...";
		}
		PrintWriter writer =response.getWriter();
		writer.println("text/html");
		writer.println("<html>");
		writer.println("<h1> Login status...</h1>"+status);
		writer.println("</html>");
		
}
}
