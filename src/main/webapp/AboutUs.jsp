<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>about page</title>
</head>
<body>
	<%
		response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
	
		if(session.getAttribute("username")==null){
			response.sendRedirect("Login.jsp");
		}
	%>
	
	<h1>About Page</h1>
	hello ${username}
	here's the learner developer
</body>
</html>