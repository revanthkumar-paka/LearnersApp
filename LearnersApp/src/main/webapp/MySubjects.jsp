<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="addSubjectServlet" method="post" >
<table>
<tr>
<td>SubjectId:</td>
<td><input name="subjectid"></td>
<tr>
<tr>
<td>SubjectName:</td>
<td><input name="subjectname"/>
</tr>
<tr>
<td>Level:</td>
<td>
<select name="level">
<option value="beginner">Beginner</option>
<option value="intermediate">InterMediate</option>
<option value="expert">Expert</option>
</select>
</td>
</tr>

<tr>
<td>
Qualification:
</td>
<td>
<input name="qualification"/>
</td>
</tr>

<tr>
<td>Department:</td>
<td><input name="department"/>
</td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="Add"></td>
</tr>
<tr>
<td></td>
<td><a href="assign_class.jsp" role="button">Assign Class</a></td>
</tr>
</table>
</form>
</body>
</html>