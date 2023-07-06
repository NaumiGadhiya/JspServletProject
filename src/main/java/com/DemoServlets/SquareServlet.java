package com.DemoServlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SquareServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session=req.getSession();
		int sum=(int)session.getAttribute("sum");
//		int sub=(int)session.getAttribute("sub");
//		int mul=(int)session.getAttribute("mul");
		
//		int sum=Integer.parseInt(req.getParameter("sum");
		
		sum=sum*sum;
		
		PrintWriter out=resp.getWriter();
		out.println("say hello to square servlet!");
		out.println("square of sum is "+sum);
//		out.println("sub is "+sub);
//		out.println("mul is "+mul);
	}
}
