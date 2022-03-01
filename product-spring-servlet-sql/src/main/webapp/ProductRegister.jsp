<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to Product Page</h1>

	<form action="product.do" method="post">
		<div>
			<label>Name</label> <input type="text" name="name" />
		</div>
		<div>
			<label for="type">product Type</label> <select name="type"
				id="type">
				<option value="select">--SELECT--</option>
				<option value="electronics">Electronics</option>
				<option value="skinCare">Skin Care</option>
				<option value="groceries">Groceries</option>
				<option value="fasion">Fasion</option>
			</select>
		</div>
		<div>
			<label for="quantity">Product Quantity</label> <select name="quantity"
				id="quantity">
				<option value="select">--SELECT--</option>
				<option value="1">1</option>
				<option value="2">2</option>
				<option value="3">3</option>
				<option value="4">4</option>
				<option value="5">5</option>
				<option value="6">6</option>
				<option value="7">7</option>
				<option value="8">8</option>
			</select>
		</div>
		<div>
			<label for="price">Price</label> <select name="price" id="price">
				<option value="select">--SELECT--</option>
				<option value="below 100">below 100</option>
				<option value="above 100">above 100</option>
				<option value="above 500">above 500</option>
				<option value="above 1000">above 1000</option>
				<option value="above 5000">above 5000</option>

			</select>
		</div>
		
		<input type="submit" value="Save product details" />
	</form>
	
	<span style="color: red;">${message}</span>
	
</body>
</html>