package 수정1;

import java.util.Random;
import java.util.Scanner;

public class ChanE_가위바위보 {// c s
	/*
	 * 가위바위보게임
		1. 사용자에게 가위[0]바위[1]보[2] 종료[3] 중에  입력받기
		2. 컴퓨터 난수발생[0~2] 
		3. 사용자와 컴퓨터중 승리자 판단 [ 경우의수 ]
		4. 3번 선택하기 전까지 게임 실행 
		5. 3번 선택시 게임종료 
			1. 총 게임수 출력	예) 3판
			2. 최종 승리 출력	예) 컴퓨터 2  사용자 1
	 */
	
	public static void main(String[] args) { // m s 
		
		 	
				int 플레이어; 
				int 컴퓨터;
				int 게임수=0;
				int 플레이어승리수=0; int 컴퓨터승리수=0; 
				Scanner scanner = new Scanner (System.in);
				
				while ( true ) { 
					System.out.println("--------가위바위보게임-----------");
					System.out.print("가위(0) 바위(1) 보(2)     종료(3) 선택 : ");
					플레이어 = scanner.nextInt();
					
					Random random =new Random();
					
					// random.nextInt() :  int가 표현할수 있는 범위내 난수 발생 
					// random.nextInt(수) + 시작번호 :  0 ~ 수 전까지 범위내 난수 발생 
						// random.nextInt(10) : 0~9 중 난수 발생
						// random.nextInt(11)+10 : 10~20 중 난수 발생
					컴퓨터 = random.nextInt(3);
					
					
				if (플레이어 ==3) {
					System.out.println("알림) 게임종료");
					System.out.println("총 게임 횟수 :"+게임수);
					if ( 플레이어승리수 > 컴퓨터승리수 ) { System.out.println(" 최종 승리자 : 플레이어 ("+플레이어승리수+")");
					}
					else if (플레이어승리수 < 컴퓨터승리수) {System.out.println("최종 승리자 : 컴퓨터("+컴퓨터승리수+")");}
					else { System.out.println("최종 승리 : 무승부");}
					
					break;
					
				}else if (플레이어 >=0 && 플레이어 <=2) {
					
					if( ( 플레이어 ==0 && 컴퓨터==2)|| (플레이어==1&&컴퓨터==0)||(플레이어==2&&컴퓨터==1)) {
						
						System.out.println("알림)) 플레이어 승리");
						플레이어승리수++; //승리수증가
					}else if((플레이어==0 &&컴퓨터==0)|| (플레이어==1&&컴퓨터==1)||(플레이어==2&&컴퓨터==2)) {
						System.out.println("알림)) 무승부");
					}
					else {//그외 컴퓨터 승리
						System.out.println("알림)) 컴퓨터 승리");
						컴퓨터승리수++;
					}
					//게임수 증가
					게임수++;
					
				}else {
						System.out.println("알림)) 알수없는 행동입니다.");
					
					
						
					
					
					}
					
				}//while end
	
	
		
		
		
		
		
		
	}//  m e
		
}// c e
