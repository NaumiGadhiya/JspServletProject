package com.DemoServlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

@WebServlet("/ValidLogin")
public class ValidLogin extends HttpServlet {

	public ValidLogin() {
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		
		String uname=request.getParameter("username");
		String pass=request.getParameter("userpass");
		
		JDBCservlet dao=new JDBCservlet();
		
			if(dao.check(uname, pass)) {
				HttpSession session=request.getSession();
				session.setAttribute("username", uname);
				response.sendRedirect("Welcome.jsp");
			}
			else {
				out.print("invalid password");
				request.getRequestDispatcher("Login.jsp").include(request, response);
				
			}
	}

}
