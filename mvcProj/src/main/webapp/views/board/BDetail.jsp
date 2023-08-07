<%@page import="model_p.PageData"%>
<%@page import="model_p.BoardDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% BoardDTO mainDTO = (BoardDTO) request.getAttribute("mainDTO"); %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<% PageData pd = (PageData) request.getAttribute("pd"); %>
<table border="">
    <tr>
        <td width="200px">번호</td>
        <td width="700px">${mainDTO.id}</td>
    </tr>

    <tr>
        <td>제목</td>
        <td>${mainDTO.title}</td>
    </tr>

    <tr>
        <td>작성자</td>
        <td>${mainDTO.pname}</td>
    </tr>

    <tr>
        <td>작성일</td>
        <td>${mainDTO.reg_date}</td>
    </tr>

    <tr>
        <td>조회수</td>
        <td>${mainDTO.cnt}</td>
    </tr>

    <tr>
        <td>내용</td>
        <td>${mainDTO.content}</td>
    </tr>
	<c:if test="${mainDTO.upfile != '' }">
    <tr>
        <td>파일</td>

         <c:choose>
         	<c:when test="${mainDTO.isImg }">
         		<td>
         			<img width="500px;" src="/mvcProj/up/${ mainDTO.upfile}" alt="사진에요" />
         		</td>
         	</c:when>
         	<c:otherwise>
         		<td>
         			<a href="/mvcProj/nonJsp/FileDown?fName=${ mainDTO.upfile}">${mainDTO.upfile }</a> 
         		</td>
         	</c:otherwise>
         	
         </c:choose>
    </tr>
    </c:if>
    
    <tr>
        <td colspan="2" align="right">
     
        	<a href="BDeleteForm?id=${mainDTO.id }&page=<%=pd.page%>">삭제</a>
        	<a href="BModifyForm?id=${mainDTO.id }&page=<%=pd.page%>">수정</a>
        	<a href="BReplyForm?id=${mainDTO.id }&page=<%=pd.page%>">답변</a>
        	<a href="BList?&page=<%=pd.page%>">목록으로</a>
       	</td>
    </tr>
    
</table>
