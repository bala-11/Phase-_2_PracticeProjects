<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="p" class="com.ProductDetails" scope="session"></jsp:useBean>
<strong>Record</strong><br><br>
<b>Product ID: </b><jsp:getProperty property="prodid" name="p"/><br>
<b>Product Name: </b><jsp:getProperty property="prodname" name="p"/><br>
<b>Product Price: </b><jsp:getProperty property="prodprice" name="p"/><br>
<b>Product Quantity: </b><jsp:getProperty property="prodquantity" name="p"/><br>
</body>
</html>
