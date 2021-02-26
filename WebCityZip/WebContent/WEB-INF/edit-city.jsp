<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action = "editcityServlet" method = "post">
	City : <input type="text" name = "city" value = "${cityToEdit.city}">
	Zip Code: <input type="text" name = "zipCode" value = "${cityToEdit.zipCode}">
	<input type = "submit" value="Save Edited City">
	</form>
</body>
</html>