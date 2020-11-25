<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>Customer registered successfully ${customer.firstName} ${customer.lastName }</h2>
<br><br>
Free Passes ${customer.freePasses}
<br><br>
Postal Code ${customer.postalCode}
</body>
</html>