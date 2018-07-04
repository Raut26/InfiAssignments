<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	<%@ page import = "java.util.ResourceBundle" %> 

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>



<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<h1>
	<font color="blue">Result:</font>
</h1>
</head>
<body>

	<c:forEach items="${data }" var="data">
		<br>
		<br>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color="green"><h3
				style="margin-left: 138px;">
				<c:out value="${data.key }"></c:out>
				&nbsp; : &nbsp;&nbsp;

				<c:out value="${data.value }"></c:out>

			</h3></font>

	</c:forEach>




</body>
</html>