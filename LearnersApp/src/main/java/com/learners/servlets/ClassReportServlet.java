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

@WebServlet("/ClassReportServlet")
public class ClassReportServlet extends HttpServlet {
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
	    try {
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("select * from student where classname='4thyear'");
			PrintWriter out = response.getWriter();
			out.println("<h1>4thyear ClassReport</h1>");
			out.println("<h2>StudentsList</h2>");
			out.println("<table border=2px>");
			out.println("<tr>");
			out.println("<td>Sid</td>");
			out.println("<td>SName</td>");
			out.println("<td>className</td>");
			out.println("<td>Percent</td>");
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
			out.println("<br><br>");
			out.println("<h2>TeachersList</h2>");
			ResultSet rs1 = statement.executeQuery("select * from teachers where classname='4thyear'");
			out.println("<table border=2px>");
			out.println("<tr>");
			out.println("<td>TeacherId</td>");
			out.println("<td>TeacherName</td>");
			out.println("<td>Qualification</td>");
			out.println("<td>Classname</td>");
			out.println("<td>ContactNo</td>");
			out.println("</tr>");
			while(rs1.next()) {
				out.println("<tr>");
				out.println("<td>"+rs1.getString(1)+"</td>");
				out.println("<td>"+rs1.getString(2)+"</td>");
				out.println("<td>"+rs1.getString(3)+"</td>");
				out.println("<td>"+rs1.getString(4)+"</td>");
				out.println("<td>"+rs1.getString(5)+"</td>");
				out.println("</tr>");
			}
			out.println("</table>");
			out.println("<br><br>");
//			3rdyear
			out.println("<hr>");
			ResultSet rs2 = statement.executeQuery("select * from student where classname='3rdyear'");
			out.println("<h1>3rdyear ClassReport</h1>");
			out.println("<h2>StudentsList</h2>");
			out.println("<table border=2px>");
			out.println("<tr>");
			out.println("<td>Sid</td>");
			out.println("<td>SName</td>");
			out.println("<td>className</td>");
			out.println("<td>Percent</td>");
			out.println("</tr>");
			while(rs2.next()) {
				out.println("<tr>");
				out.println("<td>"+rs2.getInt(1)+"</td>");
				out.println("<td>"+rs2.getString(2)+"</td>");
				out.println("<td>"+rs2.getString(3)+"</td>");
				out.println("<td>"+rs2.getInt(4)+"</td>");
				out.println("</tr>");
			}
			out.println("</table>");
			out.println("<br><br>");
			out.println("<h2>TeachersList</h2>");
			ResultSet rs3 = statement.executeQuery("select * from teachers where classname='3rdyear'");
			out.println("<table border=2px>");
			out.println("<tr>");
			out.println("<td>TeacherId</td>");
			out.println("<td>TeacherName</td>");
			out.println("<td>Qualification</td>");
			out.println("<td>Classname</td>");
			out.println("<td>ContactNo</td>");
			out.println("</tr>");
			while(rs3.next()) {
				out.println("<tr>");
				out.println("<td>"+rs3.getString(1)+"</td>");
				out.println("<td>"+rs3.getString(2)+"</td>");
				out.println("<td>"+rs3.getString(3)+"</td>");
				out.println("<td>"+rs3.getString(4)+"</td>");
				out.println("<td>"+rs3.getString(5)+"</td>");
				out.println("</tr>");
			}
			out.println("</table>");
			out.println("<br><br>");
//			2ndyear
			out.println("<hr>");
			ResultSet rs4 = statement.executeQuery("select * from student where classname='2ndyear'");
			out.println("<h1>2ndyear ClassReport</h1>");
			out.println("<h2>StudentsList</h2>");
			out.println("<table border=2px>");
			out.println("<tr>");
			out.println("<td>Sid</td>");
			out.println("<td>SName</td>");
			out.println("<td>className</td>");
			out.println("<td>Percent</td>");
			out.println("</tr>");
			while(rs4.next()) {
				out.println("<tr>");
				out.println("<td>"+rs4.getInt(1)+"</td>");
				out.println("<td>"+rs4.getString(2)+"</td>");
				out.println("<td>"+rs4.getString(3)+"</td>");
				out.println("<td>"+rs4.getInt(4)+"</td>");
				out.println("</tr>");
			}
			out.println("</table>");
			out.println("<br><br>");
			out.println("<h2>TeachersList</h2>");
			ResultSet rs5 = statement.executeQuery("select * from teachers where classname='2ndyear'");
			out.println("<table border=2px>");
			out.println("<tr>");
			out.println("<td>TeacherId</td>");
			out.println("<td>TeacherName</td>");
			out.println("<td>Qualification</td>");
			out.println("<td>Classname</td>");
			out.println("<td>ContactNo</td>");
			out.println("</tr>");
			while(rs5.next()) {
				out.println("<tr>");
				out.println("<td>"+rs5.getString(1)+"</td>");
				out.println("<td>"+rs5.getString(2)+"</td>");
				out.println("<td>"+rs5.getString(3)+"</td>");
				out.println("<td>"+rs5.getString(4)+"</td>");
				out.println("<td>"+rs5.getString(5)+"</td>");
				out.println("</tr>");
			}
			out.println("</table>");
			out.println("<br><br>");
//			1styear
			out.println("<hr>");
			ResultSet rs6 = statement.executeQuery("select * from student where classname='1styear'");
			out.println("<h1>1styear ClassReport</h1>");
			out.println("<h2>StudentsList</h2>");
			out.println("<table border=2px>");
			out.println("<tr>");
			out.println("<td>Sid</td>");
			out.println("<td>SName</td>");
			out.println("<td>className</td>");
			out.println("<td>Percent</td>");
			out.println("</tr>");
			while(rs6.next()) {
				out.println("<tr>");
				out.println("<td>"+rs6.getInt(1)+"</td>");
				out.println("<td>"+rs6.getString(2)+"</td>");
				out.println("<td>"+rs6.getString(3)+"</td>");
				out.println("<td>"+rs6.getInt(4)+"</td>");
				out.println("</tr>");
			}
			out.println("</table>");
			out.println("<br><br>");
			out.println("<h2>TeachersList</h2>");
			ResultSet rs7 = statement.executeQuery("select * from teachers where classname='1styear'");
			out.println("<table border=2px>");
			out.println("<tr>");
			out.println("<td>TeacherId</td>");
			out.println("<td>TeacherName</td>");
			out.println("<td>Qualification</td>");
			out.println("<td>Classname</td>");
			out.println("<td>ContactNo</td>");
			out.println("</tr>");
			while(rs7.next()) {
				out.println("<tr>");
				out.println("<td>"+rs7.getString(1)+"</td>");
				out.println("<td>"+rs7.getString(2)+"</td>");
				out.println("<td>"+rs7.getString(3)+"</td>");
				out.println("<td>"+rs7.getString(4)+"</td>");
				out.println("<td>"+rs7.getString(5)+"</td>");
				out.println("</tr>");
			}
			out.println("</table>");
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


}
