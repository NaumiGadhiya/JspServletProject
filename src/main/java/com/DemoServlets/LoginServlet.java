package com.DemoServlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		req.getRequestDispatcher("linkPages.html").include(req, res);
		
		String userName=req.getParameter("userName");
		String userPass=req.getParameter("userPass");
		
		if(userPass.equals("User@123")) {
			out.print("You're Logged in Successfully!");
			out.print("  Dear "+userName+", Welcome to the page");
			
			Cookie ck=new Cookie("userName", userName);
			res.addCookie(ck);
		}
		else {
			out.print("your username or password is invalid");
			req.getRequestDispatcher("loginPage.html").include(req, res);
		}
		
		out.close();
	}
}
