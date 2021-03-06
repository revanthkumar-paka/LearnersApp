package com.learners.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ReadStudentServlet")
public class ReadStudentServlet extends HttpServlet {
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
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("Inside get method...");
	try {
		Statement statement = connection.createStatement();
	    ResultSet rs = statement.executeQuery("select * from student");
	    PrintWriter out = response.getWriter();
	    out.println("<table border=5px>");
	    out.println("<tr>");
	    out.println("<th>Student Id</th>");
	    out.println("<th>Student Name</th>");
	    out.println("<th>Class</th>");
	    out.println("<th>Percentage</th>");
	    out.println("</tr>");
	    while(rs.next()) {
	    	out.println("<tr>");
	    	out.println("<td>"+rs.getInt(1)+"</td>");
	    	out.println("<td>"+rs.getString(2)+"</td>");
	    	out.println("<td>"+rs.getString(3)+"</td>");
	    	out.println("<td>"+rs.getInt(4)+"</td>");
	    	out.println("</tr>");
	    }
	    out.println("</table>");
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
