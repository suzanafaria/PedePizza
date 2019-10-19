<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<title>Login</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>

</head>
<body>
<div class="container">
${loginError}

	<form:form action= "login" method="post">

	  	<div class="form form-group">
	      <label for="login">Login:</label>
			<input type ="email" class="form-control" name="login">
		</div>
		
		<div class="form-group">
	      <label for="senha">Senha:</label>
			<input type ="password" class="form-control" name="senha">
		</div>
		
	    <br>
		<button id=class="form-control">Login</button>
	
	</form:form>
</div>
</body>
</html>