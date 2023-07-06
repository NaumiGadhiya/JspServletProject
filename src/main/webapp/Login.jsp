<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login page</title>
</head>
<body>
	<%
		response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
	%>
	<h1>Register Form</h1>
	
	<form action="ValidLogin" method="post">
	
		User Name : <input type="text" name="username"><br/><br/>
		Password : <input type="password" name="userpass"><br/><br/>
		<input type="submit" value="Log in">
		
	</form>
</body>
</html>