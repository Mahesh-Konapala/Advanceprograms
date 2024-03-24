
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" rel="stylesheet"/>
	<script src="Productlist.js"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container mt-5 text-center">
		<h2 class="text-center font-italic mb-1">UPDATE PRODUCTS DATA....</h2>

		<form method="post" action="./AddServlet" enctype="multipart/form-data"
			onsubmit="return validateForm()">

			<div class="form-group">
				<label class="font-italic font-weight-bold" for="proId">PRODUCT
					ID:</label> <input type="text" class="form-control-sm" id="proId"
					name="proId" value="${existingproduct.proId}" required>
			</div>

			<div class="form-group">
				<label class="font-italic font-weight-bold" for="proName">PRODUCT
					NAME:</label> <input type="text" class="form-control-sm" id="proName"
					name="proName" value="${existingproduct.proName}" required>
			</div>

			<div class="form-group">
				<label class="font-italic font-weight-bold" for="proPrice">PRODUCT
					PRICE:</label> <input type="number" class="form-control-sm" id="proPrice"
					name="proPrice" value="${existingproduct.proPrice}" required>
			</div>

			<div class="form-group">
				<label class="font-italic font-weight-bold" for="proBrand">PRODUCT
					BRAND:</label> <input type="text" class="form-control-sm" id="proBrand"
					name="proBrand" value="${existingproduct.proBrand}" required>
			</div>

			<div class="form-group">
				<label class="font-italic font-weight-bold" for="proMadeIn">PRODUCT
					MADE IN:</label> <input type="text" class="form-control-sm" id="proMadeIn"
					name="proMadeIn" value="${existingproduct.proMadeIn}" required>
			</div>

			<div class="form-group">
				<label class="font-italic font-weight-bold" for="proMnfgDate">PRODUCT
					MNFG DATE:</label> <input type="date" class="form-control-sm"
					id="proMnfgDate" name="proMnfgDate" value="${existingproduct.proMnfgDate}" required>
			</div>

			<div class="form-group">
				<label class="font-italic font-weight-bold" for="proExpDate">PRODUCT
					EXP DATE:</label> <input type="date" class="form-control-sm"
					id="proExpDate" name="proExpDate" value="${existingproduct.proExpDate}" required>
			</div>

			<!-- Display the current product image -->
			<div class="form-group">
				<label class="font-italic font-weight-bold" for="proImage">Current Image: </label>
				<img alt="Current Product Image" src="data:image/jpeg;base64,${Base64.getEncoder().encodeToString(existingProduct.proImage)}" style="max-width: 100px; max-height:100px">
				<input type="hidden"  id="existingImage" name="existingImage" value="${Base64.getEncoder().encodeToString(existingProduct.proImage)}"/>
			</div>
			
			<!-- Allow user to upload the new image -->
<div class="form-group">
				<label class="font-italic font-weight-bold" for="newProImage">New Product Image: </label>
				<input type="file" class="form-control-sm" id="newProImage" name="newProImage" accept="image/*" />
			</div>
			
			<div>
				<input type="submit" class="btn btn-success" value="Update Product"/>
			</div>
		</form>
	</div>
</body>
</html>