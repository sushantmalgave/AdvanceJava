<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
</head>
<body>


<h3>User Registriation :: BBBBB</h3>

<c:if test="${q == 1 }">
	<div class="alert alert-success">Resgistration Success</div>
</c:if>

<div>
	<form action="register" method="post">
		<div>
			<input class="form-control" type="text" name="username" placeholder="Enter Username....">
		</div>
		
		<div>
			<input class="form-control" type="password" name="password" placeholder="Enter Password....">
		</div>
		
		<div>
			<input class="form-control" type="text" name="email" placeholder="Enter Email....">
		</div>
		
		<div>
			<input class="form-control" type="text" name="mobile" placeholder="Enter Mobile....">
		</div>
		<div>
			<input class="btn btn-primary btn-block" type="submit" value="Register">
		</div>
	</form>
</div>


</body>
</html>