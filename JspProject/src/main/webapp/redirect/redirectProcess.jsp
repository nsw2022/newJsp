<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>검사드가자</title>
</head>

<%

request.setCharacterEncoding("utf-8");
String name = request.getParameter("name");
String year = request.getParameter("year");
request.setAttribute("name", name);
request.setAttribute("year", year);
String division = ""; // 외국인 내국구별
String age = ""; // 나이 구분
String ageString = "";// 미성년 구분

age=year.substring(0,2); // 앞자리 두개만 빼옴

//올해 미성년자는 04년생입니다 5보다 작으면 성인이아닌걸로 조건을 세웠습니다.
int compareAge=Integer.parseInt(age);

if(year.charAt(7)=='5' ||year.charAt(7)=='6' ||
year.charAt(7)=='7' || year.charAt(7)=='8'){
	
	response.sendRedirect("engPerson.jsp?name="+name+"&age="+age);
}else if(year.charAt(7)=='1'||year.charAt(7)=='2'||
		year.charAt(7)=='3'||year.charAt(7)=='4'){

	response.sendRedirect("korPerson.jsp?name="+name+"&age="+age);
}else if(compareAge<4){
	response.sendRedirect("sungPerson.jsp?name="+name+"&age="+age);
}else if(compareAge>=4) {
	response.sendRedirect("miPerson.jsp?name="+name+"&age="+age);
}


%>

<body>

</body>
</html>