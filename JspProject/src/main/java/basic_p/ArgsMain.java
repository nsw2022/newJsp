package basic_p;

import java.util.Arrays;
public class ArgsMain {

	public static void main(String[] args) {
		int sum = 0;      // 합계
		int count = 0;	  // 입력된거 개수세는 친구
		int max = 0;	  // 최대값
		int min = 0;      // 최소값
		boolean hasEven = false; // 짝수있으면 true로 바꿔줌
		//String regEx = "-?\\d+";
		String regEx = "-?\\d+";
		//  /-?\\d+/   <- 이게 맞지않나..?
		// 왜 '/'< 양쪽에 넣으면 에러가 날까
		for (String s : args) {

			if (!s.matches(regEx)) { // 조건에 충족안하면 건너뜀
				continue;
			}else {					//충족함

				// try 안쓰고 charAt으로 48~57(여기가 숫자0~9)
				// 아놔  -1은 0번방이 -니깐 안됨
				// 걍 정규식으로 다시만들자.. 요건 안되겠다 try catch말고

				int num = Integer.parseInt(s);

				if (num % 2 == 0) {
					sum += num;
					count++; // 입력된거 개수세는 친구
					if (!hasEven) { 
						// 여까지 왔으면 짝수들만이니깐
						// 바꿔줘야함
						hasEven = true;
					}

					// 최대값과 최소값 구하기
					if (count == 1) {
						max = num;
						min = num;
					} else {
						//최댓값 설정
						// else if로 반복돌리면서
						// max는 나보다 큰얘없으면 max변수 넣어서(min은 반대)
						// 출력하려했으나 내장함수 사용
						max = Math.max(max, num);
						min = Math.min(min, num);
					}
				}
			}// 맨처음 if의 else

		}// for



		if (hasEven) {
			double average = (double) sum / count;
			System.out.println("합계: " + sum);
			System.out.println("평균: " + average);
			System.out.println("최대값: " + max);
			System.out.println("최소값: " + min);
		} else {
			System.out.println("짝수가 없습니다. 기본값 0을 출력합니다.");
		}

	}// main
}
