package oops_p;

import java.util.Arrays;

public class Exam {
	
	String name, grade;
	int[] jum;
	int tot, avg, rank;
	public Exam(String name, String ...jum) {
		
		this.name = name;
		this.jum = new int[jum.length];
		
		for (int i = 0; i < jum.length; i++) {
			this.jum[i] = Integer.parseInt(jum[i]); // 입력받은 점수들 정수로 변환
		}
		calc();
	}//생성자
	
	void calc() {
		tot = 0;
		for (int i : jum) {
			tot += i;
		}
		
		avg = tot/jum.length;
		
		grade = "가가가가가가양미우수수".charAt(avg/10)+"";
		
	}
	
	
	void rankCalc(Exam[] exArr) {
		rank =1;
		for (Exam you : exArr) {
			if (avg < you.avg) {
				rank++;
			}
		}
	}//순위

	@Override
	public String toString() {
		return "Exam [name=" + name + ", jum=" + Arrays.toString(jum) + ", tot=" + tot + ", avg=" + avg + ", grade="
				+ grade + ", rank=" + rank + "]";
	}
	
	public int getRank() {
		
		return rank;
	}
	

	
	

}
