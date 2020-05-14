<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Convert Page</title>
</head>
<body>
	<%
	float usd = Float.parseFloat(request.getParameter("usd"));
	float rate = Float.parseFloat(request.getParameter("rate"));
	float result = usd * rate;
	%>
	<h3>
		USD:<%=usd%></h3>
	<h3>
		RATE:<%=rate%></h3>
	<h3>
		VND:<%=result%></h3>
</body>
</html>