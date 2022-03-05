package Day03;

import java.util.Scanner;

public class Day03_3login_page {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("==============login page==========");
		 System.out.print(" 아이디 :");  String id = scanner.next();
		 				// char 자료형 [ 문자 1개 저장 ]
							// 자료형으로 문자열을 저장할수 없다.
								// 1. String 클래스 사용하면 문자열 저장가능 
								// 2. char 배열/리스트 사용하면 가능 
		 System.out.print("비밀번호 :"); int pw = scanner.nextInt();
							// 객체는 연산불가
								// 자료형 사용하는 변수는 연산자 사용 가능 
								// 클래스 사용하는 객체는 연산자 사용 불가 -> 메소드
									// 문자열 비교시 .equals
									// 문자열1.equals( 문자열2 ) 
		 boolean 로그인성공 = false; 
		 	//boolean : 1bit true or false saves 
		 
		 if (id.equals("admin") ) {	//id는 클래스 객체이기 때문에 == 불ㄹ가능 // 객체비교시에는 .equals() 사용}
			 //입력한 id가 admin 이면 
			 if (pw ==1234 ) { //pw 는 자료형 변수이기 때문에 == 가능 
				 //입력한 pw 1234 이면 
				 System.err.println("알림)) 로그인 성공");
				 로그인성공 = true; //id , pw 가 모두 동일하면 로그인성공 변수를 true 변경 
			 	}//pw if end 
	
		 else {// 입력한 pw가 1234 이  아니면 
			 System.out.println("알림)비밀번호 불일치.");
		 }
		 }	else {// 입력한 id기 admin 이 아니면 
			 System.out.println("알림)아이디 불일치.");
		 }
		     if(로그인성공 == false ) System.out.println("알림)로그인 실패");{}
		     		     		//login 성공 변수가 false 이면 출력 
		     
		     
		     
	
	}//me

}// c e 
