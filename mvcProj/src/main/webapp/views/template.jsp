<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

 <%
	String mainPage = request.getAttribute("mainPage")+ ".jsp";
	
%>   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="">
	<tr>
		<td ><jsp:include page="Inc/header.jsp"/></td>
	</tr>
	<tr>
			
		
		<td ><jsp:include page="<%= mainPage %>"/></td>
		
		
			
		

       
		
	</tr>
	<tr>
		<td ><jsp:include page="Inc/footer.jsp"/></td>
	</tr>
</table>
</body>
</html>