package com.sathya.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

    
    public FirstServlet() {
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response, Object Form2) throws ServletException, IOException {
		
	//get the client data
		
		String username=request.getParameter("user name");
		String userage=request.getParameter("user age");
		
		//create the session object
		HttpSession session=request.getSession();
		
	//place the data into session object
		
		session.setAttribute(username, "user name");
		session.setAttribute(userage, "user age");
		
		
	//forward the next form to client
		RequestDispatcher Dispatcher=request.getRequestDispatcher("Form2.html");
		
		Dispatcher.forward(request, response);

}
}
