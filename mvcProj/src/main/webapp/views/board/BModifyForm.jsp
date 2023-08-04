<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<form action="BModifyReg" method="post" enctype="multipart/form-data">
	<table border="">
		<tr>
			<td width="100px">번호</td>
			<td width="800px"><input type="text" name="id" style="width: 99%;" value="${ mainDTO.id }" readonly /></td>
		</tr>
		<tr>
			<td>제목</td>
			<td><input type="text" name="title" style="width: 99%;" value="${ mainDTO.title }" /></td>
		</tr>
		<tr>
			<td>작성자</td>
			<td><input type="text" name="pname" style="width: 99%;" value="${ mainDTO.pname }" /></td>
		</tr>
		<tr>
			<td>작성일</td>
			<td>${ mainDTO.reg_date }</td>
		</tr>
		<tr>
			<td>내용</td>
			<td><textarea cols="30" rows="10" name="content" style="resize: none; width: 99%;">${ mainDTO.BContent }</textarea></td>
		</tr>
		<tr>
			<td>암호</td>
			<td><input type="text" name="pw" style="width: 99%;" /></td>
		</tr>
		<tr>
			<td>파일</td>
			<td>
				<c:choose>
					<c:when test="${ mainDTO.upfile eq '' }">
						<input type="file" name="upfile" style="width: 99%;" />
					</c:when>
					<c:otherwise>
						${ mainDTO.upfile }<input type="button" value="파일삭제">
						
					</c:otherwise>
				</c:choose>
			</td>
		</tr>
		<c:if test="${mainDTO.upfile != '' }">
		<tr>
			<td>전사진 미리 보기</td>
			<td><img width="500px;" src="/mvcProj/up/${ mainDTO.upfile}" alt="사진에요" /></td>
		</tr>
		</c:if>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="수정하기" />
				<input type="reset" value="초기화" />
				<a href="BDetail?id=${ mainDTO.id }">뒤로</a>
			</td>
		</tr>
	</table>
</form>