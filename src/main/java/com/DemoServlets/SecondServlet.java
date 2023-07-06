package com.DemoServlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet2")
public class SecondServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

//			String name="";
			
			Cookie totalCookies[]=null;
			Cookie cookie=null;
			
			totalCookies=req.getCookies();
			
			res.setContentType("text/html");
			PrintWriter out=res.getWriter();
			
			if(totalCookies!=null) {
				for (int i = 0; i < totalCookies.length; i++) {
					cookie = totalCookies[i];
					out.println("hello "+cookie.getValue());
				}
			}
			else {
				out.println("error");
			}

	}
}
