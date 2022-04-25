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


@WebServlet("/addSubjectServlet")
public class CreateSubjectServlet extends HttpServlet {
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
	String subjectid = request.getParameter("subjectid");
	String subjectname = request.getParameter("subjectname");
	String level = request.getParameter("level");
	String qualification = request.getParameter("qualification");
	String department = request.getParameter("department");
	try {
		Statement statement=connection.createStatement();
        int rs = statement.executeUpdate("insert into sub_table values('"+subjectid+"','"+subjectname+"','"+level+"','"+qualification+"','"+department+"')"); 	
        PrintWriter out=response.getWriter();
        
        if(rs>0) {
        	out.println("<h1>Subject assigned to class</h1>");
        }
        else {
        	out.println("<h1>Error in assignment</h1>");
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
