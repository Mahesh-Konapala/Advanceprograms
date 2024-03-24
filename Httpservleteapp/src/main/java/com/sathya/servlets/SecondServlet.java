package com.sathya.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String userqual=request.getParameter("user qual");
		String userdesg=request.getParameter("user desg");
		
		//create the session object
		HttpSession session=request.getSession(false);
		
	//place the data into session object
		
		session.setAttribute(userqual, "user qual");
		session.setAttribute(userdesg, "user desg");
		
		
	//forward the next form to client
		RequestDispatcher Dispatcher=request.getRequestDispatcher("Form3.html");
		
		Dispatcher.forward(request, response);

		
		
		
	}

}
