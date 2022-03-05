package 수정1;

public class ChanE_04_4 {
	
	public static void main(String[] args) {
		
		// 데이터 저장 1개  => 변수 
		// 배열 [ 특정(인덱스) 기준으로 나열 ]
			// * 동일한 자료형 여러개 변수를 저장/관리 
			// 1. 인덱스 : 저장되는 순서번호[ 0번 시작 ~  ]
			// 2. [ ] : 대괄호 사용한다.
			// 3. 동일한 자료형의 여러 변수를 관리 
		// 선언 
			// 1. 자료형[] 배열명;  	2.자료형 배열명[];
			// 3. 자료형[] 배열명 = {  데이터1 , 데이터2 , 데이터3 ~~ }
			// 4. 자료형[] 배열명 = new 자료형[길이] ; 
				// 길이 : 배열내 저장할 변수 개수 
		// 데이터 호출 
			// * 배열명 : 배열 메모리 주소값
			// 1. 배열명[인덱스번호]	: 해당 인덱스번호의 데이터 호출 
		// 데이터 변경[대입]
			// 1. 배열명[인덱스번호] = 새로운 데이터 
		// 배열의 길이 
			// 1. 배열명.length : 배열내 총길이 [ 변수의 개수 ]
		// for 과 배열 활용
			// for( 자료형 임시변수 : 배열명 ) {   } 
			// 배열내 0번 인덱스부터 끝 인덱스까지 하나씩 임시변수에 대입 반복처리
		
		//p.153 ex1)
		int[] scores = { 13, 23 , 87 };
		// 1. int[] : int형 데이터 여러개를 저장할수 있는 배열선언 
					// 2. scores : 배열이름[아무거나]
					// 3. { 데이터1 , 데이터2 , 데이터3 ~~~~~~~~~ } : 배열에 값 추가 
				//* 83 , 90 , 87 이라는 int형 데이터 3개를 저장하는 배열 선언 
					// 83 -> 0번 인덱스 에 저장 
					// 90 -> 1번 인덱스 에 저장 
					// 87 -> 2번 인덱스 에 저장 
		//배열 출력
			System.out.println("scores :" +scores);
			System.out.println("scores[0] :" +scores[0]); // 0번 index data call 
			System.out.println("scores[1] :"+scores[1]); //1number  index data call
			System.out.println("scores[2] :"+scores[2]); //2number index data call
			
			// 배열의 형태 
		int[] scores2 = {12,15,27}; //1. int[] : int형 데이터 여러개를 저장할수 있는 배열 선언 
			System.out.println("scores[0] :"+scores[0]); 
			System.out.println("scores[1] :"+scores [1]);
			System.out.println("scores[2] :"+scores [2]);
			/////////////////////////////////////////////////////////////////////
			
			//반복문과 배열 활용
			int sum =0;
			for ( int i=0; i<3 ; i++) {
				//*i 는 0부터 ~ 2까지 
				System.out.println("scores ["+i+"] : "+scores [i]);
				sum += scores[i]; //배열명 [ 인덱스 번호 ]
				
			}
			
			System.out.println("총합 :"+ sum);
			double avg = sum/3;
			System.out.println("평균 :"+ avg);
			
			//ex2  )
			int [] 정수배열1 = new int [3];
				//int[] : int 배열 선언
				//정수배열1  : 배열이름 [ 아무거나 ] 
				//new : 메모리 할당 (객체 , 배열에서 사용)
				//int [3] : 자료형 [길이] : 저장개수 
			//*int 형 변수 3개를 저장할수 있는 배열 선언 [ 메모리 할당]
			
			
			for (int i= 0; i<3; i++); { //data off
				System.out.println( 정수배열1[0] );
			}//for end 
			
			정수배열1[0] =100; 정수배열1[1] = 93; 정수배열1[2] = 20 ;
			
			for (int i = 0; i<정수배열1.length  ; i++); {
				 // 
				System.out.println(정수배열1 [0]);
			}
			
			//for문 변경 활용
			for ( int temp : 정수배열1) {
				//*배열내 인덱스 0번부터 끝까지 데이터를 temp 저장 반복 
				//임시변수
				//:
				//배열명 
				//1.정수배열1[0] - >temp 저장 
				//1.정수배열1[1] - >temp 저장 
				//1.정수배열1[2] - >temp 저장 
				System.out.println(temp);
			}
			

			
	}// m e 
}// c e 
