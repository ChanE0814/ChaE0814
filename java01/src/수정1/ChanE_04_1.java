package 수정1;

import java.util.Scanner;

public class ChanE_04_1 {// c s
	
	public static void main(String[] args) { //  m s 
		
		
			//제어문 : if, switch 
			//반복문 : for[] , while [ 무한루프 ]
				//1.초기값 2.조건식 3.증감식 4.실행문
				//while 형태
				// 		 	1.초기값
				// 			while( 2.조건식 ) {
				// 				
				//					4.실행문;
				// 					3.증감식;
				// 	}
		//for ex1)
		
		for (int i= 1; i<=10  ; i++ ) {
				System.out.println(i + " ");
		}//for end 
		
				System.out.println();
				
		//while EX1)
		int i=1; // 1.초기값
		while( 1<=10 ) { //2 조건식 
				System.out.println( i +  " " ); //4.실행문 
				i++; //3.증감식 
	
		 
		//for ex2) 1~100  누적합 
		int sum = 0;
		for ( int j =1 ;  j<=100 ; j ++ ) {
				sum+= j; //sum = sum + j ; 
				
		}//for ex2) end 
				System.out.println("1~100까지 누적합 : "+sum);
			
		//while ex2) 1~100까지 누적합
		int j = 1 ; 
		int sum2 =0;
		while (j<=100) { //2.조건식 [ true이면 실행 false 이면 실행불가 
				sum2 +=j; //실행문
				j++; //증감식 
				
		}//while ex2 end 
		
		System.out.println("while 1~100까지 누적합 :"+sum2);
		
		//while ex3) [ 무한 루프 ]
		
		while(true) { //조건식이 true 실행 // true= 상수 -> 무한루프 
				System.out.println("무한루프");
				Scanner scanner2 = new Scanner(System.in);
				int exit = scanner2.nextInt();
				if(exit == 3)  
					break; //가장 가까운 반복문탈출 [if 제외 ]
				
				
				
		}//while ex3 end 
	
	}	
		}//m e 

}

