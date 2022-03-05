package Day02;

import java.util.Scanner;

public class Day02_5 {	// c s 
	
		public static void main(String[] args) {
		//p.64 연산자 
			
		/*1.산술
		* 	//1. +(더하기)2.-(빼기)3.*(곱하기)4./ (나누기)=몫) 
		*2.비교 [비교연산자의 결과는  , flase
		*		>초과 	< 미만
		*		>=이상 	<=이하
		*		==같다   !=같지않다 [다르다]
		*3.논리  [ 2개이상 비교 연산자 사용시]
		*		&&이면서 면서 이고 모두 그리고 and 
		*		||이거나 거나 또는 하나라도 or [엔터위 원화기호 |]
		* 		!부정 [반대]  or flase / flase-> true 
		*
		*4.대입		 
		*             = : 오른쪽값이 왼쪽으로 
		* 				+=: 오른쪽값이 왼쪽갑과 더하기 후에 왼쪽값에 대입 
		
		
		
		
		* 5
		*/
		
		 
		 
		
		 
			if( 3>1 )System.out.println("예)3이 1보다 크다.");
			//만약에 3이 1보다 크면 출력o 아니면 출력x
		 
		 
		 
		 
		 //산술연산자 예제
	
		int 정수1 = 10; int 정수2 = 20; //각각 10과 20을 저장하는 2개의 변수 선언
		System.out.println("더하기 :"+정수1 + 정수2); //문자열+정수 -> 연결연산자
		System.out.println("더하기 :"+(정수1+정수2));
		System.out.println("빼기 :"+(정수1-정수2));
		System.out.println("곱하기 :"+정수1*정수2);
		System.out.println("나누기 (몫):"+(정수1/정수2));
		System.out.println("나머지 : "+ (정수1%정수2));
	
			//증감연산자 예제 
	 	정수1++; //변수명뒤에 ++할 경우 해당 변수내 데이터에  +1
	 	System.out.println("증가 :"+ 정수1);	//11
	 	정수1--; //변수명뒤에 --할 경우 해당 변수내 데이터에 -1]
	 	System.out.println("감소 :"+ 정수1);
	 	
		System.out.println("선위증가 :"+ ++정수1);	//11출력
		System.out.println("후위증가 :"+ 정수1++);	//11출력
				//명령어처리는 동시처리 불가능 -> 처리 순서가 존재!
				//++변수 : 먼저 증가후에 print 실행
				//변수++ : print 실행후에 증가
		System.out.println("후위증가 후 :"+정수1); //12
		
		System.out.println("선위감소 "+ --정수1); //1감소후 출력 => 11출력
		System.out.println("후위감소 "+ 정수1--); //출력후 1감소 => 11출력
		
		System.out.println("후위감소 후"+정수1); //10출력
		
		//비교연산자 예제 
		System.out.println("이상 :"+ (정수1 >= 정수2)); 	//10 >= 20 : false 
		System.out.println("이하 :"+ (정수1 <= 정수2));			//10<= 20 : true
		System.out.println("초과 :"+ (정수1 > 정수2));			//10> 20 : false
		System.out.println("미만 :"+ (정수1 <= 정수2));			//10< 20 : true
		System.out.println("같다 :"+ (정수1 == 정수2));			//10== 20 :false 	
		System.out.println("같지않다 :"+ (정수1 != 정수2));	//10 != 20 : true
	
		
		//논리연산자 예제
		
			//and &&: 2개이상의 비교연산자가 모두 true => 결과도 true 아니면 false
			//or || : 2개이상의 비교연산자가 하나라도 true => 결과도 true 아니면 false
		int  정수3 = 30; int 정수4 = 40;
		
		System.out.println("and : "+(정수1 >= 정수2 && 정수4 >= 정수3 ) );
									//10 >=20  and   40 >= 30
															//false 	true => 결과 false 
		System.out.println("or :"+(정수1 >=정수2 || 정수4>=정수3 ) );
															// false or true => 결과 true
		
		//대입연산자 예제
		정수1 = 정수1 + 10;	System.out.println((정수1=10));
		정수1 +=10;		 System.out.println((정수1/=10));
		
		System.out.println("정수1 :"+(정수1-=10));
	    System.out.println("정수1"+(정수1/=10));
	    
	    //조건연산자 예제
	    int 점수 = 85;
	    char 등급 = 점수> 90? 'A' : 'B';
	    	//조건식 ? 참 (true : 거짓 (flase
	    	//점수변수가 90 초과하면  A대입 아니면 B대입
	    System.out.println("등급 :"+ 등급);
	
	    char 등급2 = 점수 > 90 ? 'A' : 점수 > 80 ? 'B' : 'C';
	    		//조건식 ? 참true 거짓 false
	    		//점수변수가 90 초과하면 A 대입 아니면 점수변수가 80 초과하면 B 대입 아니면 C
	    
	    
	 }//m e
	 
	 
	}//c s 
