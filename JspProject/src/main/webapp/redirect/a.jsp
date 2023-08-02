<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>redirect > a</title>
</head>
<body>
<h1>redirect > a</h1>
<script type="text/javascript">
	alert("누가 이렇게 슬프게 울어!!")
	location.href="b.jsp";
</script>
<% 
request.setAttribute("pname", "aaa");
response.sendRedirect("b.jsp?age=26");
%>
</body>
</html>