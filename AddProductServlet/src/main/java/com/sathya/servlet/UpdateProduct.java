package com.sathya.servlet;



import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.Base64;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.commons.io.IOUtils;


@WebServlet("/UpdateProduct")
public class UpdateProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
   







		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			String proId=request.getParameter("proId");
			String proName=request.getParameter("proName");
			Double proPrice=Double.parseDouble(request.getParameter("proPrice"));
			String proBrand=request.getParameter("proBrand");
			String proMadeIn=request.getParameter("proMadeIn");
			Date proMfgDate=Date.valueOf(request.getParameter("proMfgDate"));
			Date proExpDate=Date.valueOf(request.getParameter("proExpDate"));
			
			
			Product product=new Product();
			product.setProId(proId);
			product.setProName(proName);
			product.setProPrice(proPrice);
			product.setProBrand(proBrand);
			product.setProMadeIn(proMadeIn);
			product.setProMfgDate(proMfgDate);
			product.setProExpDate(proExpDate);
			
			
			Part part=request.getPart("newProImage");
			
			if(part!=null && part.getSize()>0)
			{
				InputStream inputStream=part.getInputStream();
				//conversion of InputStream into byte[]
				byte[] newProImage = IOUtils.toByteArray(inputStream);
				product.setProImage(newProImage);
			}
			else
			{
				String s=request.getParameter("existingImage");
				byte[] existingImage=Base64.getDecoder().decode(s);
				product.setProImage(existingImage);
				
			}
				
				
				
			//Giving the product object to DAO layer
			
			ProductDao productDao=new ProductDao();
			int result=productDao.updateById(product);
			
			
			if(result==1)
			{
				//To send the data to JSP, add the data to request object
				request.setAttribute("updateResult", result);
				RequestDispatcher dispatcher=request.getRequestDispatcher("productList.jsp");
				dispatcher.forward(request, response);
			}
			else
			{
				response.setContentType("text/html");
				PrintWriter writer=response.getWriter();
				writer.println("<h1 class='text-danger text-center'>Data Updation Failed, Please check and enter the details again...</h1>");
				RequestDispatcher dispatcher=request.getRequestDispatcher("editForm.html");
				dispatcher.include(request, response);
			}
		}

	}