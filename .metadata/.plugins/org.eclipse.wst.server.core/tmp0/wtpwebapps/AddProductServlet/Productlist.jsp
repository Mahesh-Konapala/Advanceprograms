<%@page import="com.sathya.servlet.ProductDao" import="java.util.Base64"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product List</title>
 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<div>
   <h1 class="text-center text-success"> List of Available Products</h1>
   </div>
   
   <div class="form-group">
   <a class="brn btn-success" href="Addproduct.html">Save Product</a>
   </div>
   
<div class="form-group">
   <input type="search"  placeholder="search">
   </div>
   
   <div class="form-group">
   <c:if test="${saveResult==1}"> </c:if>c
   <h2 class="text-center text-danger">Data Inserted Successfully...</h2>
   </div>
   
    <div class="form-group">
   <c:if test="${deleteResult==1}"> 
   <h2 class="text-center text-danger">Data Deleted Successfully...</h2>
   </c:if>
   </div>
   
   

 <div class="form-group">
   <c:if test="${deleteResult==0}">
   <h2 class="text-center text-danger">Data Deletion failed...</h2>
   </c:if>
   </div>
   
   
   
   
   <div>
	
		<c:if test="${UpdateResult==1}">
		<h1 class="text-danger text-center">DELETION SUCCESSFULL</h1>
		</c:if>
		
	</div>
	<div>
	
		<c:if test="${UpdateResult==0}">
		<h1 class="text-danger text-center">DELETION FAILED</h1>
		</c:if>
		
	</div>
   

<table class="table table-bordered table-striped">
<thead class="thead-dark">
       <tr>
           <th>ProductID</th>
           <th>ProductName</th>
           <th>ProductCost</th>
           <th>Brand</th>
           <th>Made IN</th>
           <th>MAnufacturing date</th>
           <th>ExpiryDate</th>
           <th>Image</th>
           <th>ACTIONS</th>
       </tr>
</thead>
<tbody>
       <c:forEach var="product" items="<%=new ProductDao().findAll() %>">
            <tr>
                <td>${product.proId}</td>
                <td>${product.proName}</td>
                <td>${product.proPrice}</td>
                <td>${product.proBrand}</td>
                <td>${product.proMadeIn}</td>
                <td>${product.proMfgDate}</td>
                <td>${product.proExpDate}</td>
                <td><img src="data:image/jpeg;base64,${Base64.getEncoder().encodeToString(product.proImage)}" alt="ProductImage" style="max-width:100px; max-height:100px;">
                </td>
                
				    <td>
				    <audio controls>
				   		 <source src="data:video/mp4;base64,${Base64.getEncoder().encodeToString(product.proAudio)}" type="audio/mpeg">
				    </audio>
				    </td>
				    
				     <td>
				    <video controls width="320" height="240">
				    	<source src="data:video/mp4;base64,${Base64.getEncoder().encodeToString(product.provideo)}" type="video/mp4">
				    </video>
				    </td>
				    
					<td>
                
                
                <td>
                <a class="btn btn-primary" href="DeleteServlet?proId=${product.proId }">Delete</a>
                 <a class="btn btn-primary" href="EditProductservlet?proId=${product.proId }">Edit</a>
                </td>
            </tr>
     	</c:forEach>
</tbody>
</table>
</body>
</html>