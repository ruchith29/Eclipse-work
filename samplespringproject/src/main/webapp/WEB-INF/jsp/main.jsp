<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>
Welcome to main page
</h1>

<h3>The Filled form values are:</h3>
<br>
<h4>Username : <%= request.getParameter("username")%></h4>
<h4>Passowrd : <%= request.getParameter("password")%></h4>

</body>
</html>