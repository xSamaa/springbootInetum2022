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
	<h1>Bienvenido ${nombre}</h1>
	
	<form method="get" action="http://localhost:8080/helloworld/resultado">
	<select name="selPPT">
		<c:forEach items="${opciones}" var="eleccion">
			<option value=<c:out value="${eleccion.getNumero()}" ></c:out>> <c:out value="${eleccion.getNombre()}"></c:out></option>
			
		</c:forEach>
		<br>
		<input type="submit" value="Piedra papel o tijera" />
	</select>
	
		
	</form>
	
	
	<ul>
		<c:forEach items="${opciones}" var="opcion">
			<li> <c:out value="${opcion}"/> </li>
		</c:forEach>
	</ul>
	
</body>
</html>