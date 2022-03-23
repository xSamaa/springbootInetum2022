<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado</title>
</head>
<body>
	

	<div id=first>
		<h2>${pptPlayer.getNombre()}</h2>
		</br>
		<h1>VS</h1>
		<h2>${pptPC.getNombre()}</h2>
	
	</div>
	<div id=resultado>
		</br>
		<h2>${pptPlayer.getDescripcionResultado()}</h2>
		
		<h2> 
	</div>
</body>
</html>