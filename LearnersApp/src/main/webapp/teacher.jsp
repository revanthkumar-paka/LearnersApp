<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="addTeacherServlet" method="post">
<table>
<tr>
<td>TeacherId:</td>
<td><input name="teacherid"></td>
</tr>
<tr>
<td>TeacherName:</td>
<td><input name="teachername"></td>
</tr>
<tr>
<td>Qualification:</td>
<td><input name="qualification"></td>
</tr>
<tr>
<td>ClassName:</td>
<td><input name="classname"></td>
</tr>
<tr>
<td>ContactNo:</td>
<td><input name="contactno"></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="add"></td>
</tr>
</table>
</form>
</body>
</html>