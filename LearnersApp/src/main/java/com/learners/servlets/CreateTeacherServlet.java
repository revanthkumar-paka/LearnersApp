package com.learners.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addTeacherServlet")
public class CreateTeacherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
private Connection connection;
    
	public void init() {
		System.out.println("initializing addservlet....");
				try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","revanthkumar123");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      System.out.println("Inside post method...");
      String teacherid = request.getParameter("teacherid");
      String teachername = request.getParameter("teachername");
      String qualification = request.getParameter("qualification");
      String classname = request.getParameter("classname");
      String contactno = request.getParameter("contactno");
      try {
  		Statement statement=connection.createStatement();
          int rs = statement.executeUpdate("insert into teachers values('"+teacherid+"','"+teachername+"','"+qualification+"','"+classname+"','"+contactno+"')"); 	
          PrintWriter out=response.getWriter();
          
          if(rs>0) {
          	out.println("<h1>Teacher record created</h1>");
          }
          else {
          	out.println("<h1>Error in creating teacher record</h1>");
          }
          
  	} catch (SQLException e) {
  		// TODO Auto-generated catch block
  		e.printStackTrace();
  	}
	}
	public void destroy() {
		   if(connection!=null) {
			   try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   }
	   }

}
