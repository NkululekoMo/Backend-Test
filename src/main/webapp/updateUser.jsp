<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${requestScope.msg}
<h2>Update User</h2>
<form action="updateUser" method="put">
	<label>Id</label>
	<input type="text" name="id"><br/>
	<label>ContactNumber</label><br/>
	<input type="text" name="contactNumber"><br/>
	<input type="submit" value="submit">
	<input type="reset" value="reset">
</form>
<br/>
<a href="index.jsp">BACK</a>
</body>
</html>