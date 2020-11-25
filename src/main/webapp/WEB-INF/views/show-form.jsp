<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
	First Name: <form:input path="firstName"/><br><br>
	Last Name: <form:input path="lastName"/><br><br>
	Age: <form:input path="age"/><br><br>
	
	<form:select path="country">
	
	<!-- Manual Entry -->
		<%-- <form:option value="IN" label="India"></form:option>
		<form:option value="BR" label="Brazil"></form:option>
		<form:option value="FR" label="France"></form:option>
		<form:option value="GR" label="Germany"></form:option> --%>
		<!-- Read from Java -->
		<form:options items="${student.countryOptions}"/>
	</form:select><br><br>
	
	Favourite Language: <br>
	
	<!-- Hardcoded radio -->
<%-- 	Java <form:radiobutton path="favouriteLanguage" value="Java"/>
	Javascript <form:radiobutton path="favouriteLanguage" value="Javascript"/>
	ASP .NET <form:radiobutton path="favouriteLanguage" value="ASP .NET"/> --%>
	
	<!-- From Java -->
	<form:radiobuttons path="favouriteLanguage" items="${student.languageOptions }"/>
	
	<br><br>
	
	Operation Systems: <br>
	<!-- Hard Coded -->
<%-- 	<form:checkbox path="operatingSystems" value="Linux"/> Linux
	<form:checkbox path="operatingSystems" value="Mac OS"/> Mac OS
	<form:checkbox path="operatingSystems" value="Windows"/> Windows --%>
	<!-- Java -->
	<form:checkboxes path="operatingSystems" items="${student.operatingSystemOptions }"/>
	<br><br>
	<form:button value="submit">Submit</form:button>
	</form:form>
</body>
</html>