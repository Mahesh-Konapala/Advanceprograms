package com.sathya.servlets;

import java.io.IOException;
import java.io.PrintWriter;

//import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ThirdServlet")
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
  

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		

		//String userqual=request.getParameter("user email");
		//int=Integer.parseInt(request.getParameter("user Moblno"));
		
		//create the session object
		HttpSession session=request.getSession(false);
		
	//place the data into session object
		
		//request.getParameter(useremail, "user email");
		//request.getParameter(userMoblno, "user Moblno");
		
		
	//forward the next form to client
		
		
		//Dispatcher.forward(request, response);
		
		
		PrintWriter writer =response.getWriter();
		response.setContentType("text/html");
		writer.println("<html>");
		
		writer.println("User name..."+session.getAttribute("user name"));
		writer.println("User age..."+session.getAttribute("user age"));
		writer.println("User Qual..."+session.getAttribute("user qual"));
		writer.println("User Desg..."+session.getAttribute("user desg"));
		
		writer.println("Email..."+request.getParameter("user email"));
		writer.println("Mobile..."+request.getParameter("user Moblno"));
		
		writer.println("</html>");
		
		

	}

}
