<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SpringBoot Pizzaria</title>
</head>
<style type="text/css">
div.a {
	text-align: center;
}
</style>
<body>
	
	<div class="a">
	<h1> Web Application Pizzaria utilizando Spring Boot </h1>
	</div>
	
	<br>
	<h3>Bem vindo, <i>${sessionScope.login}</i>!</h3>
	<br>
	<nav>
		<a href="massa">Massa</a> 
		&nbsp; 
		<a href="recheio">Recheio</a> 
		&nbsp; 
		<a href="pizza">Pizza</a> 
		&nbsp; 
		<a href="bebida">Bebida</a>
		&nbsp; 
		<a href="cliente">Cliente</a> 
		&nbsp; 
		<a href="pedido">Pedido</a>
	</nav>
	
	<hr />

</body>
</html>