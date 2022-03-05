package Day02;

import java.util.Scanner;

public class Day02_T01 {
	public static void main(String[] args) {
		
		
		
		try (Scanner scanner = new Scanner (System.in)) {
			System.out.println("국어점수 :"); int 국어 = scanner.nextInt();
			System.out.println("영어점수 :"); int 영어 = scanner.nextInt();
			System.out.println("수학점수 :"); int 수학 = scanner.nextInt();
			int 평균 = (국어+영어+수학)/3; //평균 구하기 
				
			if (평균 >=90) { //평균 90점 이상이면
				//if 중첩

				 if (국어 == 100 ) System.out.println("결과 : 국어우수");
				 if (영어 == 100 ) System.out.println("결과 : 영어우수");
				 if (수학 == 100 ) System.out.println("결과 : 수학우수");

			} //if e 
			else if (평균 == 90) System.out.println("A등급");
			else if (평균 == 80) System.out.println("B등급");
			else if (평균 == 70) System.out.println("C등급");
			else System.out.println("재시험");
		}
		
		
			
		
		
	
	
	}

}
