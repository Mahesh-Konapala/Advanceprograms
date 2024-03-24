package com.sathya.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			

			        // Read form data
			        String username = request.getParameter("Username");
			        String userPassword = request.getParameter("UserPassword");
			        long mobile =Long.parseLong(request.getParameter("Mobile"));
			        String email = request.getParameter("Email");
			        String gender = request.getParameter("Gender");
			        String dob = request.getParameter("DOB");
			        String[] qualifications = request.getParameterValues("Qualification");
			        String country = request.getParameter("Country");
			        String[] languages = request.getParameterValues("Language");
			        String comment = request.getParameter("Comment");

			        // Process data (example: printing to console)
			       
			       String q=String.join(",",qualifications);
			       String l=String.join("-" ,languages);


			        
			        response.setContentType("text/html");
			       PrintWriter out=response.getWriter();
			        out.println("<html>");
			        out.println("<head>");
			        out.println("<title>Registration Form..</title>");
			        
			        out.println("<h2>Registration Form...</h2>");
			        out.println("<p>Your User Name:"+username+"</p>");
			        out.println("<p>Your Password: " +userPassword+ "</p>");
			        out.println("<p>your mobile number: "+mobile+"</p>");
			        out.println("<p>your email: " +email+ "</p>");
			        out.println("<p>your gender: " +gender+ "</p>");
			        out.println("<p>Your dob:" +dob+"</p>");
			        out.println("<p>Your qualifications: " +q+ "</p>");
			        out.println("<p>your Country:" +country+ "</p>");
			        out.println("<p>your languages: "+l+"</p>");
			        out.println("<p>YourComment:"+comment+"</p>");

			        out.println("</body>");
			        out.println("</html>");
			    }
			

		}


	
