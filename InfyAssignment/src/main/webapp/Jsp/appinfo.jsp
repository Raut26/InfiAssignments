<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<h2><font color="blue">Application Information</font></h2>
</head>
<body>

<c:forEach items="${appdata }" var="appdata">
		<br>
		<br>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color="green"><h3
				style="margin-left: 138px;">
				<c:out value="${appdata.key }"></c:out>
				&nbsp; : &nbsp;&nbsp;

				<c:out value="${appdata.value }"></c:out>

			</h3></font>

	</c:forEach>



</body>
</html>