<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function cuntChange()() {
		alert('하이욤')
	}
</script>
</head>
<body>
<h1>입력</h1>
<form action="Studentrecode.jsp">
	
	
	<table border="">
		<thead>
			<tr>
				<td>이름</td>
				<td>국어</td>
				<td>영어</td>
				<td>수학</td>
			
			</tr>	
		</thead>
		<tbody>
		<% for(int i = 0; i<5; i++){ %>
			<tr>
				<td>
					<input type="text" name="name">
				</td>
				<td>
					<input type="number" name="kor">
				</td>
				<td>
					<input type="number" name="eng">
				</td>
				<td>
					<input type="number" name="math">
				</td>
				<% } %>
			</tr>
		</tbody>
	</table>
	<input type="submit" value="전송">
	
</form>
</body>
</html>