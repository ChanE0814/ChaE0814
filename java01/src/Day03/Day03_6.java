package Day03;

import java.util.Scanner;

public class Day03_6 {
	
	public static void main(String[] args) {
		
	try (Scanner scanner = new Scanner(System.in)) {
		//별문제1 : 입력받은 수 만큼 * 출력 
		System.out.println("문제1)별개수 :"); int s1 = scanner.nextInt();
		for(int i=1; i <=s1 ; i++) {
			
			System.out.println("*");
		}
			System.out.println("\n-------------------------------------------");
		
			//별문제2 : 입력 받은 수 
		
			System.out.println("문제2)별개수 :"); int s2 = scanner.nextInt();
		for (int i=1; i<=s2 ; i ++) {
			//*i는 1부터 입력받은 수까지 i는 1씩 증가하면서 실행문 반복처리
			System.out.println("*");
			//5개마다 줄바꿈 -> 5배수마다 ->배수찾기
			if (i%5 ==0) System.out.println();//줄바꿈처리 
				
		}
			System.out.println("\n--------------------------------------------");
		//별문제3 : 입력받은 줄 수 만큼 출력
		System.out.println("문제3) 줄수 :"); int line3 = scanner.nextInt();
		for(int i = 1; i <=line3; i++)  {
			//i는 1부터 입력받은 줄 수까지 1씩증가 
			
			//1.별찍기
			for (int s = 1; s<=i ; s++) {
				System.out.println("*");
			}//for star point end 
				//2. 줄바꿈처리 
				System.out.println();
		}//for end 
			
	
	
						//문제3 순서도 
						//사용자가 3을 입력했을때
						//i = 1 i<=3 [true] -> i++
							//s = 1 s<=1 [true] ->
							//s = 2 s<=1 [false] ->
					
						//순서도
							//사용자가 3을 입력했을때
							//i = 1  i=3 [true]
								// s = 1 s<=1 [true] -> * -> s++
								// s = 2 s<=1 [false] -> * - > s++
					
							//줄바꿈 
							//i =2  i<=3 [ true ] -> i++
								//s = 1 s=3 [true] -> * -> s++
								//s = 2 s=3 [true] -> * -> s++
								//s = 3 s=3 [true] -> * -> s++
								//s = 4 s=3 [false] -> 반복문 종료 
							//줄바꿈 
							//i = 4 i<=3 [ false ] for1 반복문 종료 
		System.out.println("\n-------------------------------------");
	 //별문제4 : 입력받은 줄 수 만큼 출력 
	System.out.println("문제3) 줄수 :"); int line4 = scanner.nextInt();
	for(int i=1; i <=line4; i++) { 
		
		//1. 별찍기
		for(int s=1; s <=line4-i+1; s++) {
			System.out.println("*");
		}
		//2.줄바꿈 
		System.out.println();
		}
		
			//별문제4 : 입력받은 줄 수 만큼 출력
		System.out.println("문제3) 줄수 :");
		int line5 = scanner.nextInt();
		
		for( int i = 1; i <=line5; i++) {
			//1.공백찍기
			for(int b = 1; b<=line5-i ; b++) {
				System.out.println(" "); //공백 => 스페이스바	
		}		
		
		//2.별찍기 
		for (int s = 1 ; s<=i; s++ ) {
			System.out.println("*");
		}
		//3.줄바꿈 
		System.out.println();{
			}
	
	
	//별문제5 : 입력받은 줄 수 만큼 출력 
	Scanner line9 = new Scanner(System.in);
	System.out.print("문제6)줄수  :");
	int line52 = scanner.nextInt();
	
		
		for (int j = 1; i<=line52 ; i++) {
			//1.공백찍기 
			System.out.print(" ");	
		}
		//2. 별찍기 
		for (int s = 1 ; s<=line52-i+1; s++) {
			System.out.println("*");
		}
		//3.줄바꿈 
		System.out.println();
	}
	//별문제6 : 입력받은 줄 수 만큼 출력 
	System.out.print("문제6)줄수 :");
	int line7 = scanner.nextInt();
	
	for( int i = 1 ; i <=line7 ; i++) {
		//공백
		for( int b=1 ; b<=line7-i ; b++) {
			System.out.print(" ");
		}
		//별찍기
		for(int s=1; s<=line7-i+1; s++ ) {
	}		
		
		
		System.out.println("문제7) 줄수 :");
		int line52 = scanner.nextInt();
		for (int j = 1 ;  i<=10 ; i++) {
			//1.공백찍기
			
			for (int b = 1 ; b<=line7; b++) {
			System.out.println(" ");
			}
			
			//별찍기
			for ( int s=1;  s<=i*2-1; s++ ) {
					System.out.println(" ");{
					}
			}
			
		}
	}
	


			}
		}
	}

		
