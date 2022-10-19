<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>

	<div >
		<br> <br> <br> <br>
		<h1>Register</h1>
		<form action="reg.jsp" method="post">
			<label for="username">username : </label> <input type="text" id="username"
				name="username"> <br> <label for="password">password
				: </label> <input type="password" id="password" name="password"> <br> <br>
			<input type="submit" value="Submit">
		</form>
		<br> <br> <br> <a href="index.jsp">Home</a> | <a
			href="Store.jsp">Store</a>
	</div>



</body>
</html>