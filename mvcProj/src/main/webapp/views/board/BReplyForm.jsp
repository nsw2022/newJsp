<%@page import="model_p.PageData"%>
<%@page import="model_p.BoardDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%
	BoardDTO dto = (BoardDTO) request.getAttribute("mainDTO");
	PageData pd = (PageData) request.getAttribute("pd");
%>

<form action="BReplyReg" method="post" >
	
	<input type="hidden" name="page" value="<%=pd.page %>" />
	<input type="hidden" name="gid" value="<%=dto.getGid() %>" />
	<input type="hidden" name="seq" value="<%=dto.getSeq() %>" />
	<input type="hidden" name="lev" value="<%=dto.getLev() %>" />
	
	<table border="">

		<tr>
			<td>제목</td>
			<td><input type="text" name="title" style="width: 99%;" value="[Re]${ mainDTO.title }" /></td>
		</tr>
		<tr>
			<td>작성자</td>
			<td><input type="text" name="pname" style="width: 99%;" value="${ mainDTO.pname }" /></td>
		</tr>

		<tr>
			<td>암호</td>
			<td><input type="text" name="pw" style="width: 99%;" /></td>
		</tr>
	
		<tr>
			<td>내용</td>
			<td><textarea cols="30" rows="10" name="content" style="resize: none; width: 99%;">${ mainDTO.BContent }</textarea></td>
		</tr>
		
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="답변하기" />
				<input type="reset" value="초기화" />
				<a href="BDetail?id=${ mainDTO.id }&page=<%=pd.page%>">뒤로</a>
			</td>
		</tr>
	</table>
</form>