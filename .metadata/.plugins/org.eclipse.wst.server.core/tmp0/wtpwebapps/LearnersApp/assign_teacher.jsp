<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="assignTeacherServlet" method="post">
<table>
<tr>
<td>ClassName</td>
<td><input name="classname"></td>
</tr>
<tr>
<td>teacherId</td>
<td><input name="teacherid"></td>
</tr>
<tr>
<td>TeacherName:</td>
<td><input name="teachername"></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="Assign"></td>
</tr>
</table>
</form>
</body>
</html>