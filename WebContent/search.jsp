<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<% %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Map<String,String> dictionary = new HashMap<>();

	dictionary.put("hello","xin chao");
	
	String search = request.getParameter("english");
	
	String result = dictionary.get(search);
	if(result !=null){
		out.println("Result: "+search+" means " + result);
	}else out.println("Not found");
%>
</body>
</html>