<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
request.setCharacterEncoding("utf-8");
	String[] test = request.getParameterValues("test");
	
%>

<c:set var="cal" value="${paramValues.test}"/>
	<c:set var="sum" value="0"/>
	<c:set var="count" value="0"/>
	<c:set var="max" value="0"/>
	<c:set var="min" value="0"/>
	<c:set var="hasEven" value="0"/>
<c:forEach items="${cal}" var="ca">
	<c:out value="${ca}"/>
	
	<c:if test="${ca%2==0}">
		<c:set var="sum" value="${sum + ca }"/>
		
	</c:if>

	
	
</c:forEach>
