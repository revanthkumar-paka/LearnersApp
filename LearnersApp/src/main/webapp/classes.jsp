<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="addClassServlet" method="post">
<table>
<tr>
<td>ClassId:</td>
<td><input name="classid"></td>
</tr>
<tr>
<td>ClassName</td>
<td><input name="classname"></td>
</tr>
<tr>
<td>Section:</td>
<td><input name="section"></td>
</tr>
<tr>
<td>ClassTeacher</td>
<td><input name="classteacher"></td>
</tr>
<tr>
<td>Strength</td>
<td><input name="strength"></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="add"></td>
</tr>
<tr>
<td></td>
<td><a href="assign_teacher.jsp" role="button">Assign teacher</a></td>
</tr>

</table>
</form>
</body>
</html>