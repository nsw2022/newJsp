package basic_p;



public class TSNTEST {
	
	public static void main(String args[]) {
		/*
		System.out.println("3, 6, 9 게임 ");
		System.out.println("1 -> 20 ");
		for (int i = 1; i <=20; i++) {
			int one = i % 10;
			if(one%3==0 && one!=0) {
				System.out.println("짝");
			}else {
				System.out.println(i+" , "+one);
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
		
		int no = 1245;
		System.out.println("1 ->  "+no+" >>>>>>>>>>>> ");
		for (int i = 1; i <=no; i++) {
			
			String ttt = "";
			
			int buf = i;
			
			while(true) {
				int one = buf % 10;
				buf /= 10;
				if(one%3==0 && one!=0) {
					ttt += "짝";
				}
				
				if(buf == 0) {
					break;
				}	
			}
			
			if(ttt.equals("")) {
				ttt += i;
			}
			System.out.println(ttt);
		}
		*/
		
		
		/*
		for (int i = 1; i < n; i++) {
			int a = i%10; 
			
			try {
				int b = a%3;
				int c = i/a;
				try {
					int d= c/b;
					
					
				} catch (Exception e) {
					System.out.println(i);
				}
			} catch (Exception e) {
				System.out.println(i);
			}
			
		}
		*/
		int n = 20;
		/*
		System.out.println("3,6,9 게임 ");
		System.out.println("1 -> 20 ");
	
		for ( int i = 1; i <=20; i++) {
			int one = i % 10;
			int three = one % 3;
			try {
				
				int a = 1234/three;
				System.out.println(i+","+one+","+ three);
				
			} catch (Exception e) {
				
				try {
					int a = 123/one;
					System.out.println("짝"+","+one+","+ three);	
				} catch (Exception e2) {
					System.out.println(i+","+one+","+ three);
				}// catch
				
			}//catch
			
		}//for
		*/
		
		
		
		
		//처음버전
		/*
		for (int i = 1; i < 11; i++) {
			int one = i % 10; // i가 10으로 나눠떨어지는 경우
			int three = i % 3;// i가 3으로 나눠떨어지는 경우 
			try {
				int a=1234/three;
				System.out.println(i);
				
			} catch (Exception e) {
				System.out.println("짝");
				
			}
		}//for
		*/
		
		//두번째 try
		for (int i = 1; i < 21; i++) {
			int one = i % 10; // i가 10으로 나눠떨어지는 경우 one 0~9
			int three = one % 3;// three가 0 이되는경우 one이 0369
			try {
				int a=1234/three; 
				System.out.println(i);
				
			} catch (Exception e) {
									// i의 일의자리수가 0369일떄
				try {
					int a = 1234/one;
					System.out.println("짝");
				} catch (Exception e2) {
					System.out.println(i);
				}
			}
		}//for
		System.out.println();
		System.out.println(0%3);
		
	
	}

}
