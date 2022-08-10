<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Enter Product Details</h1>
<form action="Product" method="post">
<table>
<tr>
<td>Product ID:</td>
<td><input type="number" name="ID"></td>
</tr>
<tr>
<td>name:</td>
<td><input type="text" name="name"></td>
</tr>
<tr>
<td>color:</td>
<td><input type="text" name="color"></td>
</tr>
<tr>
<td>price:</td>
<td><input type="number" name="price"></td>
</tr>
<tr>
<td><input type="submit" name="submit"></td>
<td><input type="reset" name="reset"></td>
</tr>



</table>
</form>
</body>
</html>