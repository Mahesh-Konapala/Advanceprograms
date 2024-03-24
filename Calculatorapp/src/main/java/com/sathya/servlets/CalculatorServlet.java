package com.sathya.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int num1=Integer.parseInt(request.getParameter("First"));
		int num2=Integer.parseInt(request.getParameter("Second:"));
		String operation= request.getParameter("operation");
		
		int result=0;
		switch(operation){
		    case"+":
		    	result=num1+num2;
		       break;
		    case"-":
		    	result=num1+num2;
		       break;
		    case"*":
		    	result=num1+num2;
		       break;
		    case"/":
		    	result=num1+num2;
		       break;
		    case"%":
		    	result=num1+num2;
		       break;
		
		}
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		
		writer.println("<html>");
		writer.println("<h1>Calculator Result</h1>");
		writer.println("<p> your first number:"+num1+"</p>");
		writer.println("<p>your second number:"+num2+"</p>");
		writer.println("<p> your operation type:"+operation+"</p>");
		writer.println("<p> your result is:"+result+"</p>");
		//writer.println();
		writer.println("/<html>");
		
		
	}
}
		
		
		
		
		
		