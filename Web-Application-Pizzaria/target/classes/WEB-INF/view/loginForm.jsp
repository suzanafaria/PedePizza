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
<style type="text/css">
div.a {
	text-align: center;
}
</style>

<body>
	<div class="container">

       	<br>

       	 <div class = "a">
       	 	<h2><b>Realizar Login:</b></h2>
       	 	<hr />
       	 </div>
       	 
       	 
        <form:form method="post" action="${pageContext.request.contextPath}/logar" modelAttribute="usuario">
       		<div class="a">
       			<c:if test="${not empty error}">
					<div class= "alert alert-danger">
						<c:out value="${error}"></c:out>
					</div>
				</c:if>

            <label>Login: </label>
            	<input name="login" value="${usuario.login}"/>
            <br>
            <label>Senha: </label>
            	<input type="password" name="senha" value="${usuario.senha}"/>
            <br>
            <br>
            
				<input type="submit" value="Logar" />
            </div>
        </form:form>    
	</div>
</body>
</html>