<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>369</title>
</head>
<body>
	<h1>3,6,9에 짝이 들어가요</h1>	
	
     <%
    /*
    for (int i = 1; i < 100_000; i++) {
        String test = Integer.toString(i); // 문자로 받아서
        int count369 = 0; // 상태변수
        StringBuilder result = new StringBuilder(); // arraylist로 하려다가 bulider가 더 나아보임

        for (int j = 0; j < test.length(); j++) {// 길이많큼 반복해서 자리수마다 비교
        	
            char digit = test.charAt(j); // 자리수를 비교해줌
            if (digit == '3' || digit == '6' || digit == '9') {
                count369++; // 상태변수 더함
            }
            
        }

        for (int k = 0; k < count369; k++) {
            result.append("짝");//상태변수의 길의만큼 append시킴        	
        }
            
        if (result.length() == 0) {
            out.print(i + "<br>");//"짝있으면 여기서 출력"
        } else {
            out.print(result + "<br>");//없으면 여기서 걸림
        }
    }
	*/
		
	
	/*
	System.out.println("1 ->  100 >>>>>>>>>>>> ");
		for (int i = 1; i <=100; i++) {
			int one = i % 10;
			int ten = i/10;
			
			String ttt = "";
			if(ten%3==0 && ten!=0) {
				ttt += "짝";
			}
			if(one%3==0 && one!=0) {
				ttt += "짝";
			}
			if(ttt.equals("")) {
				ttt += i;
			}
			System.out.println(ttt);
		}
	*/
	/*
	int num = 100;
	for (int i = 1; i <= num; i++) {
	    int test = i;
	    String ttt = "";

	    while (true) {
	        int one = test % 10; // 나머지 뽑자
	        test /= 10; // 몫

	        if (one % 3 == 0 && one != 0) { // 조건식에걸림짝
	            ttt += "짝";
	        }

	        if (test == 0) {
	            break;
	        }
	    }//// while

	    if (ttt.equals("")) {
	        ttt += i;
	    }
	    out.println(ttt+"<br>");
	}
	*/
	
	for(int i=3;i<100;i+=3){
		
		try{
			out.println(i);
		}catch(ArrayIndexOutOfBoundsException e){
			out.println(i);
		}
	}
	
	
    %>
    
    
</body>
</html>