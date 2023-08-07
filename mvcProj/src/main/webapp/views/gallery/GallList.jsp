<%@page import="java.util.ArrayList"%>
<%@page import="model_p.GallDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%
	
%>
<body>
	<h1>ㅎㅇㅎㅇ</h1>
	<table border="">
	
		<%
int i=0;
for(GallDTO dto : (ArrayList<GallDTO>) request.getAttribute("GallList")) { 
i++;
%>
		<tr style="display: contents;">
			<td width="100px" align="center" >
				<%= i %>
				<p>
					<%= dto.getTitle() %>
				</p>
	
				<img src="../up/<%= dto.getUpfile() %>" alt="사진" width="180px"
					height="200px" />
	
	
				<p>
					<%= dto.getReg_date() %>
				</p>
	
				<p>
					<%= dto.getPname() %>
				</p>

			</td>


		</tr>
		<% } %>
	</table>
</body>
</html>