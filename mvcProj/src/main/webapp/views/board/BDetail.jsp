<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<table border="" >
	<tr>
		<td width="200px">번호</td><td width="700px">${mainDTO.id }</td>
	</tr>
	<tr>	
		<td >제목</td><td>${mainDTO.title }</td>
	</tr>
	<tr>
		<td >작성자</td><td>${mainDTO.pname }</td>
	</tr>
	<tr>
		<td >작성일</td><td>${mainDTO.reg_date }</td>
	</tr>
	<tr>
		<td >조회수</td><td>${mainDTO.cnt }</td>
	</tr>
	<tr>
		<td>내용</td><td>${mainDTO.content }</td>
	</tr>
	<tr>
		<td >파일</td><td>${mainDTO.upfile }</td>
	</tr>
	
	<tr>
		<td colspan="2"  align="right">
			<a href="BList">목록으로</a>
		</td>
	</tr>
</table>