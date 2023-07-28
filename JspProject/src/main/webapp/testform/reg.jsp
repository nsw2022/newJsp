<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>regex두과자</title>
</head>
<body>
	<form action="good.jsp">
	
	
     <c:forEach begin="1" end="20">
     	<input type="text" name="test" value="<%=(int)(Math.random()*100)+100 %>">
     	<br>
     </c:forEach>
     
     <input type="submit" value="전송" style="margin-top: 5px;">
     </form>
    
</body>
</html>