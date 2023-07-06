<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="color:yellow;background-color:brown">
	<%
		response.setContentType("text/html");
		
		String userName=request.getParameter("userName");
		String userPass=request.getParameter("userPass");
		
		if(userPass.equals("User@123")) {
			out.print("You're Logged in Successfully!");
			out.print("  Dear "+userName+", Welcome to the page");
			
			Cookie ck=new Cookie("userName", userName);
			response.addCookie(ck);
		}
		else {
			out.print("your username or password is invalid");
			request.getRequestDispatcher("loginPage.html").include(request, response);
		}
	
	%>
</body>
</html>