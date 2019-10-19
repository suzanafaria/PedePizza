<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Alterar Bebida</title>
</head>
<body>
	<h2>Alterar Cadastro de Bebida:</h2>
	<form:form action="/bebida/alterarAction" method="post" modelAttribute="bebida">
		<form:hidden path="id" />
		<fieldset>
				<legend><b><i>Informações:</i></b></legend>
				<label>Nome:</label>
				<form:input path="nome" /> 
				<br>
				<label>Preço:</label>
				<form:input path="preco" />
				
			</fieldset>
			<br>
		<form:button>Alterar</form:button>
	</form:form>
</body>
</html>