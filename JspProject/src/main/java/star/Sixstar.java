package star;

import java.util.Iterator;

public class Sixstar {
	public static void main(String[] args) {

		// 공백 5 별 1 
		// 공백 4 별 3
		// 공백 3 별 5
		// 공백 2 별 7
		// 공백 1 별 9

		// 그럼 전체 반복 5번
		// 공백이 blank 5번돌때 5부터빼서 하나씩출력
		// 처음별 star 5번돌때 1부터 5까지 증가
		// 두번째별 twoStar 5번 돌때 두번째부터 1씩 증가
		// 뒤에별은 막상찍어보니깐 생각한대로 안나와서 이쁘게 바꿔봄
		// 걍 처음 별을 홀수로 뽑으면 될듯
		// 고고
		int good;
		int blank = 5;
		int star = 5;
		int twoStar = 1;

		for (good= 6; good > 0; good--) {
			for (blank = 1; blank < good; blank++) {
				System.out.print(" ");
			}

			for (star= good; star>1; star--) {
				System.out.print("*");
			}
			
			System.out.println();

		}
		
		


		/*
		for (int i = 5; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		 */


	}
}
