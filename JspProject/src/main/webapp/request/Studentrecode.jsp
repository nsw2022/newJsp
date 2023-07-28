<%@page import="java.util.Arrays"%>
<%@page import="java.util.Collections"%>
<%@page import="java.util.Comparator"%>
<%@page import="java.util.Collection"%>
<%@page import="Student.Student"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%
    request.setCharacterEncoding("utf-8");

    String[] name = request.getParameterValues("name");
    String[] kor = request.getParameterValues("kor");
    String[] eng = request.getParameterValues("eng");
    String[] math = request.getParameterValues("math");

    int[] sum = new int[name.length];
    double[] avg = new double[name.length];

    for (int i = 0; i < name.length; i++) {
        int a = Integer.parseInt(kor[i]);
        int b = Integer.parseInt(eng[i]);
        int c = Integer.parseInt(math[i]);
        sum[i] = a + b + c;
        avg[i] = sum[i] / 3.0; // 평균은 합계를 과목 수로 나눈 값
    }
    
    ArrayList<Student> students = new ArrayList<>();
    
    for (int i = 0; i<name.length;i++){
 	  	  int a = Integer.parseInt(kor[i]);
	      int b = Integer.parseInt(eng[i]);
	      int c = Integer.parseInt(math[i]);
	      sum[i] = a + b + c;
	      avg[i] = sum[i] / 3.0;
    	Student std = new Student(name[i],kor[i],eng[i],math[i],sum[i],avg[i]);
	    
    	students.add(std);
        
	    //Collections.sort(students.get()); 흠.. 배열안에 문자를 할순있는데 객체안에를
	    // 제어할수가없음.. 팍쉬 sort 재정의?
	    
	    // 여튼 Rank도 만들어서 제어
	    
    	
    }
    
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
        function cuntChange() {
            alert('하이욤')
        }
    </script>
</head>
<body>
	<h1>결과</h1>
	<form action="recode.jsp">
		<table border="">
			<thead>
				<tr>
					<td>이름</td>
					<td>국어</td>
					<td>영어</td>
					<td>수학</td>
					<td>총점</td>
					<td>평균</td>
					<td>등수</td>
				</tr>
			</thead>
			<tbody>
				<%
				
					for (int i = 0; i < name.length; i++) { 
					int rank = 1;
					int count = 1;
					for(int j=0; j<name.length;j++){
						
						if(students.get(i).getAvg() < students.get(j).getAvg()){
							// i가 왔을때 j로 모두를 비교 i가 지면 등수가 올라감
							count++;
						}
						rank=count;
						
					}
					
						
							
					%>
				<tr>
			
					
							<td>
								<input type="text" value="<%=students.get(i).getName() %>">
							</td>
							<td> 
								<input type="text" value="<%=students.get(i).getKor() %>">
							</td>
							<td>
								<input type="text" value="<%=students.get(i).getEng() %>">
							</td>
							<td>
								<input type="text" value="<%=students.get(i).getMath() %>">
							</td>
							<td>
								<input type="text" value="<%=students.get(i).getSum() %>">
							</td>
							<td>
								<input type="text" value="<%=students.get(i).getAvg() %>">
							</td>
							<td>
								<input type="text" value="<%=rank %>">
							</td>
	

					<% } %>
				</tr>
			</tbody>
		</table>
		<input type="submit" value="전송">
	</form>
</body>
</html>
