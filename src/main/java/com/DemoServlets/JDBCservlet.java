package com.DemoServlets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCservlet {

	public JDBCservlet() {
	}
	
	public boolean check(String uname,String pass) {

         try {
        	 
    		 String driver="com.mysql.cj.jdbc.Driver";
             String url="jdbc:mysql://localhost:3306/Employee";
             String user="root";
             String password="Admin@123";
             
             Class.forName(driver);
             Connection con= DriverManager.getConnection(url,user,password);
             
             PreparedStatement pst=con.prepareStatement("select * from login where ename=? and pwd=?");
             pst.setString(1, uname);
             pst.setString(2, pass);
             
             ResultSet rs=pst.executeQuery();
             
             if(rs.next()) {
            	 return true;
             }
		} 
         catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
