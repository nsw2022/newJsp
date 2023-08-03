<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<table border="">
	<tr align="center">
		<td width="50px;">번호</td>
		<td width="500px;">제목</td>
		<td width="100px;">작성자</td>
		<td width="200px;">작성일</td>
		<td width="50px;">조회수</td>
	</tr>
	<c:forEach items="${mainData }" var="items">
	<tr align="center">
		<td> ${items.id}</td>
		<td>
			<a href="BDetail?id=${items.id }"> ${items.title} </a>
		</td>
		<td>${items.pname}</td>
		<td>${items.reg_date}</td>
		<td>${items.cnt}</td>
	</tr>
	</c:forEach>
	

	
	
	<tr>
		<td colspan="5" align="center"></td>
	</tr>
	
	<tr>
		<td colspan="5" align="right">
			<a href="BwriteForm">글쓰기</a>
		</td>
	</tr>
</table>