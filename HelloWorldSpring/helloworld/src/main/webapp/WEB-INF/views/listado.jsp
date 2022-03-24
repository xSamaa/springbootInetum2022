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
		<div class="container">
		<h2>Lista de alumnos</h2>
		<table class="table table-bordered">
			<tr>
			<th>Codigo</th><th>Nombre</th><th>Apellido</th><th>Repo</th>
			</tr>
			<c:forEach items="${alumnoss}" var="alumno">
				<tr>
					<td><c:out value="${alumno.getCodigo()}"/>  </td>
					<td><c:out value="${alumno.getNombre()}"/>  </td>
					<td><c:out value="${alumno.getApellido()}"/></td>
					<td><c:out value="${alumno.getLinkArepositorio()}"/></td> 
				</tr>
			</c:forEach>
		</table>
	
	</div>
</body>
</html>