package com.sathya.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/EditProductservlet")
public class EditProductservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		       
			
				String proId=request.getParameter("proId");
				
				ProductDao productDao=new ProductDao();
				Product existingproduct=productDao.findbyId(proId);
				request.setAttribute("existingproduct", existingproduct);
				RequestDispatcher dispatcher=request.getRequestDispatcher("edit-form.jsp");
				dispatcher.forward(request, response);
			}
		
		
		
		
		
		
		
			}


