package com.DemoServlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

public class AddServlets extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.service(req, resp);
		
		int num1=Integer.parseInt(req.getParameter("num1"));
		int num2=Integer.parseInt(req.getParameter("num2"));
		
		int sum=num1+num2;
//		int sub=num1-num2;
//		int mul=num1*num2;

		
//		PrintWriter out=resp.getWriter();
//		out.println("sum is : "+sum);
//		System.out.println("sum is : "+sum);

//		req.setAttribute("sum", sum);
//		RequestDispatcher rd=req.getRequestDispatcher("sq");
//		rd.forward(req, resp);
		
//		resp.sendRedirect("sq?sum="+sum);
		
		HttpSession session=req.getSession();
		session.setAttribute("sum", sum);
//		session.setAttribute("sub", sub);
//		session.setAttribute("mul", mul);
		resp.sendRedirect("sq");
	}
}
