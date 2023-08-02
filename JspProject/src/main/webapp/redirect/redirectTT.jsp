<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주민번호를 입력해주세요</title>
</head>
<body>
	<form action="./redirectProcess.jsp" method="get">
	<p>이름</p>
	<input type="text" name="name"/>
	<p>주민등록번호</p>
	<input type="number" name="year" maxlength="13"/>
	<input type="submit" value="전송" placeholder="-생략해주세요" >
	</form>
	
	
</body>
</html>