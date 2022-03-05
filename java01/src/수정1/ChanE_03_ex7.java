package 수정1;
import java.util.Scanner;
public class ChanE_03_ex7 {
		 // c s 

		// 공통 변수 [ 모든곳에서 사용할수 있는 변수 선언 ]
		public static void main(String[] args) { // ms
			
			
			boolean run = true; // 실행 여부 변수 / true = 실행 false = 종료
			int balance = 0; // 예금액 [통장안에 있는 금액 ]변수 
			Scanner scanner = new Scanner(System.in); // 입력객체 
			
			while(run) { //while ( true ) { }  :무한루프 
				System.out.println("---------------");
				System.out.println("1.예금 2.출금 3.잔고 4.종료");
				System.out.println("---------------");
				System.out.print("선택>");
				
				int 선택 = scanner.nextInt(); // 입력받은 값을 가져오기 
				
			if (선택 == 1) { // 만약 입력값이 1 이면
				System.out.print("예금액 :"); int 예금액 = scanner.nextInt();
				balance += 예금액; // 입력받은 예금액을 통장에 추가 + 
			}
			 
			else if (선택 == 2) {//만약 입력값이 2 이면 
				System.out.print("출금액 :"); int 출금액 = scanner.nextInt();
				
				//만약에 출금액이 예금액보다 더 크면 잔액부족 
				if(출금액 > balance) { System.out.println("알림) 잔액 부족."); }
				//아니면 출금실행
				else { balance -= 출금액; } //입력받은 출금액을 통장에서 - 
				
				}// else if end 
			else if (선택 == 3) { //만약 입력값이 3 이면 
				System.out.println("잔고 :"+balance);	
			}
			else if(선택 == 4) {//만약 입력값이 4 이면
				break; // while 탈출 [ 무한루프 종료  ]
				
			}else { //그외 
				System.err.println("알림)atm기가 이해하지 못했어요.");
			}
	
			}// w e 

			
			
		}// m e 

	}// c e 



