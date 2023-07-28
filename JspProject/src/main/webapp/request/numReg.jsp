<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>numReg.jsp</title>
</head>
<body>
<%
	String[] noArr = request.getParameterValues("no");
%>
	<h1>numReg</h1>
	no:<%=request.getParameter("no") %>
	noArr<%=Arrays.toString(noArr) %>
</body>
</html>