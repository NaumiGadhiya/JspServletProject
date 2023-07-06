<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>welcome page</title>
</head>
<body>
	<%
		response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
	
		if(session.getAttribute("username")==null){
			response.sendRedirect("Login.jsp");
		}
	%>
	
	<h1>Welcome Page</h1>
	welcome ${username}
	<br/>
	<a href="Content.jsp">Content</a>|
	<a href="AboutUs.jsp">About Us</a>
	
	<form action="ValidLogout" method="get">
		<br/>
		<input type="submit" value="Log out">
	</form>
</body>
</html>
