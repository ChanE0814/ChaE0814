package Day02;

import java.util.Scanner;

public class Day02_6 {
	
	private static final int 키 = 0;

	public static void main(String[] args) {
		
		// 문제2 : 지폐 세기 
		/*
		 * [ 입력조건 ] 
		 * 		금액 
		 * [ 조건 ] 
		 * 		십만원 부터 백원 까지의 개수 세기 
		 * [ 출력조건 ]
		 * 		예) 356789 입력시 
		 * 		십만원 3장 
		 * 		만원 5장
		 * 		천원 6장 
		 * 		백원 7개
		 */
		// 1. 입력객체 
		Scanner scanner = new Scanner(System.in);
		// 2. 입력받은 데이터 -> 변수로 이동 
		System.out.println("금액 : ");	int 금액 = scanner.nextInt();
		// 3. 연산 
		System.out.println(" 입력한 금액 : " + 금액 );
		System.out.println(" 십만원  : " + (금액/100000) + "장" );
			
		//금액 = 금액 - ( 금액/100000 )*100000 ; // 금액에서 십만원 단위 제거
		금액 -= ( 금액/100000 )*100000 ;
		System.out.println(" 십만원 제외 : " + 금액 );
		System.out.println(" 만원 : " + (금액/10000) + "장");
		
		금액 -= (금액/10000) * 10000; // 금액에서 만원 단위 제거 
		System.out.println(" 천원 : " + (금액/1000) + "장");
		
		금액 -= (금액/1000) * 1000; // 금액에서 천원 단위 제거 
		System.out.println(" 백원 : " + (금액/100) + "개");
		
		//문제3 : 하나의 정수를 입력받아 7의 배수인지 출력[ true , false ]
			// 배수찾기 
				// 값 % 수 했을때 나머지가 0 이면 값은 그 수의 배수 
		System.out.println(" 문제3) 정수 입력:"); 	int 문제3 = scanner.nextInt(); // 하나의 정수를 입력받기 
		System.out.println(" 입력한 정수는 7의 배수 판단 : " + ( 문제3%7 == 0 ) );
		
		//문제4 : 하나의 정수를 입력받아 홀수 인지 확인 [ true , false ]
			// 홀짝 찾기 
				// 홀수 : 값 % 2 했을때 나머지가 1 이면 값은 홀수 
				// 짝수 : 값 % 2 했을때 나머지가 0 이면 값은 짝수 
		
		//문제5 : 하나의 정수를 입력받아 7의 배수 이면서 짝수 인지 확인 [ true , false ]
		
		System.out.println("문제5) 정수 입력 :");	int 문제5 = scanner.nextInt();
		System.out.println("입력한 정수는 7의배수 이면서 짝수 판단 : "							+(문제5%7 == 0 && 문제5%2 == 0 ) );
		
	    //문제6 : 두개의 정수를 입력받아 더 큰지 출력  [ true , false ]
		
		
		
		//문제7 : 반지름을 입력받아 원 넓이 출력하기 
				// 원 넓이 공식 => 반지름 * 반지름 * 원주율[3.14]
		
		
		
		
		
		//문제8 : 두 실수를 입력받아 앞실수의 값이 뒤의 값의 몇% 인지 출력하기
		
				// 예) 54.5   84.3 이면    64.285714%
		
		System.out.println("문제8)실수1 입력 :"); double 문제8_1 = scanner.nextDouble();
		System.out.println("문제8)실수2 입력 :"); double 문제8_2 = scanner.nextDouble();
		
		
		double 비율 = (문제8_1/문제8_2)*100;
		System.out.println("실수1의 실수2 백분율 :"+비율+ "%");
		System.out.printf("실수1의 실수2 백분율 : %.1 %%",비율);
				//%f :  실수 표현
					//%숫자f 	//%.2f : 소수 2자리 까지 표현 
								//%.5f : 소수 5자리 까지 표현
		

		
		
		//문제9 : 사다리꼴 넓이 구하기[윗변과 밑변 높이를 입력받아 출력하기]
		
				//사다리꼴 계산식 = > (윗변 * 밑변) * 높이 / 2
		
		System.out.println("문제9)윗변 :"); double 윗변 = scanner.nextDouble();
		System.out.println("문제9)밑변 :"); double 밑변 = scanner.nextDouble();
		System.out.println("문제9)높이 :"); double 높이 = scanner.nextDouble();
		System.out.println(" 사다리꼴 넓이 :"+ ( 윗변 * 밑변 )*높이 / 2);
		
		
		
		
		//문제10: 키를 정수를 입력받아 표준체중 출력하기
				//표준체중 계산식 = > (키 - 100) * 0.9
				Scanner scanner2 = new Scanner(System.in);
				System.out.print("문제10) 키  :"); 	int 키 = scanner.nextInt();
				System.out.println("표준체중 :"+ (키-100) * 0.9);
		
		
		//문제11: 키와 몸무게를 입력받아 BMI 출력하기
				//BMI 계산식 = > 몸무게 / ((키 / 100) * (키 / 100))
		System.out.println("문제11) 키 :"); int 키2 = scanner.nextInt();
		System.out.println("문제11) 몸무게 :"); int 몸무게 = scanner.nextInt();
		System.out.println("BMI :"+(몸무게/ ((키2/100.0)*(키2/100.0))));
		
		
		
		//문제12: inch 를 입력받아 cm 로 변환하기 [ 1 inch -> 2.54cm ] 
		System.out.println("문제12)inch :"); int 인치 = scanner.nextInt();
		System.out.println("inch -> cm :"+ (인치*2.54)  );
		
		
		
		
		//문제13:  중간고사, 기말고사, 수행평가를 입력받아 반영비율별 계산하기
				//소수 둘째 자리 까지 점수 출력하기
				//중간고사 반영비율 => 30 %
				//기말고사 반영비율 => 30 %
				//수행평가 반영비율 => 40 %
		System.out.println("문제13) 중간고사 :"); double 중간고사 = scanner.nextDouble();
		System.out.println("문제13) 기말고사 :"); double 기말고사 = scanner.nextDouble();
		System.out.println("문제13) 수행평가 :"); double 수행평가 = scanner.nextDouble();
		중간고사 = 중간고사 * 0.3; 기말고사 *= 0.4;  수행평가 *= 0.4;
		
		System.out.printf(" 반영비율별 점수 : %.2f \n", (중간고사+기말고사+수행평가) );
		
		
		//문제14 :  연산 순서 나열 하고 x와 y값 예측하기
		 	//int x = 10;
			//int y = x-- + 5 + --x;
			//printf(" x의 값 : %d , y의값 :  %d ", x, y)
		
		
		
		
		
			
		
		// p. 102 확인문제
			//1.:3
			//2.: ++10 + 20-- => 11 + 20 -> 31 
				//++10 :더하기 전에 증가
				//20-- :더하기 후에 증가 
			//3.:85>90 ? "가" : "나"
			//	80>90 -> false -> (!) -> true -> 가 
		
			//4.(1) : 연필수/학생수 -> 몫  pencils / students
			//  (2)  : 연필수%학생수 -> 나머지 pencils % students
		
			//5.10자리 버리기 
		 		//예 356일때 56(나머지)제거 [-] 356 - 56 => 300
				//value - (value % 100)
		
			//6.윗변 * 밑변 *높이 / 2 
				//lenthTop * lengthBottom * height /2 
			//7
				//10 > 7 && 5 <=5 true => 결과 true 
				//10%3 ==2 || 5%2 != 1	false || false => 결과 false 
		
		
		
		
	}
}


