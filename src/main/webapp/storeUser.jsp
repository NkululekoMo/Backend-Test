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
<table border="1">
<h2>Add User</h2>
<form action="storeUser" method="post">
	<label>Id</label><br/>
	<input type="text" name="id"><br/><br/>
	<label>FirstName</label><br/>
	<input type="text" name="fisrtName"><br/><br/>
	<label>LastName</label><br/>
	<input type="text" name="lastName"><br/><br/>
	<label>ContactNumer</label><br/>
	<input type="text" name="contactNumber"><br/><br/>
	<input type="submit" value="submit">
	<input type="reset" value="reset">
</form>
</table>
<br/>
<a href="index.jsp">BACK</a>
</body>
</html>