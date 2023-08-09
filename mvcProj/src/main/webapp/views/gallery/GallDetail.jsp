<%@page import="model_p.GallDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	GallDTO dto = (GallDTO) request.getAttribute("GallDetail");
%>
<table border="">
	<tr>
		<td>번호</td>
		<td><%= dto.getId() %></td>
	</tr>
	<tr>
		<td>제목</td>
		<td><%= dto.getTitle() %></td>
	</tr>
	<tr>
		<td>작성자</td>
		<td><%= dto.getPname() %></td>
	</tr>
	<tr>
		<td>작성일</td>
		<td><%= dto.getReg_date() %></td>
	</tr>
	<tr>
		<td>내용</td>
		<td><%= dto.getContent() %></td>
	</tr>
	<tr>
		<td>이미지</td>
		<td>
			<img src="../up/<%= dto.getUpfile() %>" alt="사진" width="180px"
					height="200px" />
		</td>
	</tr>
</table>