<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1">
	<tr>
		<th>Id</th>
		<th>FirstName</th>
		<th>LastName</th>
		<th>ContactNumber</th>
	</tr>
	<core:forEach items="${requestScope.listOfUser}" var="users">
		<tr>
		<td><core:out value="${user.id}"></core:out> </td>
		<td><core:out value="${user.firstName}"></core:out> </td>
		<td><core:out value="${user.lastName}"></core:out> </td>
		<td><core:out value="${user.contactNumber}"></core:out> </td>
		</tr>
	</core:forEach>
</table>
<br/>
<a href="index.jsp">BACK</a>
</body>
</html>