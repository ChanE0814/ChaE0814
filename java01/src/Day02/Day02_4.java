package Day02;

import java.util.Scanner;

public class Day02_4 {
	
	 public static void main(String[] args) {
		 
		 
		 //*입력 -> 저장 -> 출력 
		 //1.입력 객체를 만든다.
		 
		 //2.입력받은 값을 변수에 저장한다. [ 입력객체는 입력받을때마다 기존 데이터가 사라짐 ]
		 
		 //3.변수를 연산(계산)한다
		 
		 //4.출력한다.
		 
		 Scanner scanner = new Scanner(System.in);
				 
				 
				 //2.입력받은 값을 변수에 저장한다. [ 입력객체는  입력받을때마다 기존 데이터가 사라짐 ] 
				 
				 
		System.out.println("기본급 입력 : "); int  기본급 = scanner.nextInt();
													//입력객체명.nextInt() int형 데이터 가져오기 
													//입력객체명.next() : 문자열 데이터 가져오기
		
		System.out.println("수당 입력 :"); int 수당 = scanner.nextInt();
		
		//3.변수를 연산(계산)한다
		
		int 세금 = (int)(기본급 *0.1); //int*double 후에 int형으로 강제변환 (캐스팅)
		int 실수령금액 = 기본급 + 수당 - 세금;	//100% : 1 	 10% : 0.1
		
		//4.출력한다.
		System.out.println();
		

	}
	

}
