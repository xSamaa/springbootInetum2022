<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<title>Juego piedra papel o tijera</title>
</head>
<body>
	<select name="selJuegador">
		<c:forEach items="${opciones}" var="opcion">
			<option value=<c:out value="${opcion}" ></c:out>> <c:out value="${opcion}"></c:out></option>
			
		</c:forEach>
		
	</select>
	<ul>
		<c:forEach items="${opciones}" var="opcion">
			<li> <c:out value="${opcion}"/> </li>
		</c:forEach>
	</ul>
	
</body>
</html>