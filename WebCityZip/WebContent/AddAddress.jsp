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
<form method = "post" action = "navigationServlet">
	<table>
	<c:forEach items="${requestScope.allCities}" var="currentCity">
	<tr>
		<td><input type="radio" name="id" value="${currentCity.zipCode}"></td>
		<td>${currentCity.city}</td>
		<td>${currentCity.zipCode}</td>
	</tr>
	</c:forEach>
	</table>
	<input type = "submit" value = "edit" name = "doThisToCity">
	<input type = "submit" value = "delete" name = "doThisToCity">
	<input type = "submit" value = "add" name = "doThisToCity">
	</form>
</body>
</html>