<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>HomePage</h1>
<form >
<table border="2px">
<tr>
<td>AddSubject:</td>
<td><a href="MySubjects.jsp">AddSbjects</a></td>
</tr>
<tr>
<td>AddTeacher:</td>
<td><a href="teacher.jsp">AddTeacher</a></td>
</tr>
<tr>
<td>AddClass:</td>
<td><a href="classes.jsp">AddClass</a></td>
</tr>
<tr>
<td>AssignTeacher:</td>
<td><a href="assign_teacher.jsp">AssignStudents</a></td>
</tr>
<tr>
<td>AssignClass:</td>
<td><a href="assign_class.jsp">AssignClass</a></td>
</tr>
<tr>
<td>MasterList of Students:</td>
<td><a href="ReadStudentServlet">MasterList of Students</a></td>
</tr>
<tr>
<td>Class-Report:</td>
<td><a href="ClassReportServlet">ClassReport</a></td>
</tr>
</table>
</form>
</body>
</html>