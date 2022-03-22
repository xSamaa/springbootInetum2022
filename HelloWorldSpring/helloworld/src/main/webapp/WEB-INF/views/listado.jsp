<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>${titulo}</title>
</head>
	<body>
	
		<h1>Profesor ${profesor}</h1>
		
		<ul>
			<c:forEach items="${alumnos}" var="alumno">
				<li> <c:out value="${alumno}"/> </li>
			</c:forEach>
		</ul>
		
		
	</body>
</html>