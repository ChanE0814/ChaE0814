package Day03;

import java.util.Scanner;

public class Day03_평균값 {
	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		
		  System.out.print("쇼트점수 :"); int 쇼트 = scanner.nextInt();
		     System.out.print("컬링점수 :"); int 컬링 = scanner.nextInt();
		     System.out.print("스키점수 :"); int 스키 = scanner.nextInt();
		 
		     int 평균 = (쇼트+컬링+스키)/3; //평균 값 
		     
		     if(평균 >= 90 ) {
		    	 
		    	 //if 중첩
		    	 if (쇼트 ==100) System.out.println("결과 : 쇼트금메달");
		    	 if (컬링 ==100) System.out.println("결과 : 컬링금메달");
		    	 if (스키 ==100) System.out.println("결과 : 스키금메달");
		    	
		     }//if end 
		     else if (평균 >=80) {// 평균 80점 이상
		    	 if (쇼트 >= 90) System.out.println(" 결과 : 쇼트은메달");
		    	 if (컬링 >= 90) System.out.println(" 결과 : 컬링금메달");
		    	 if (스키 >= 90) System.out.println(" 결과 : 스키금메달");
		     }//elsef e 
		     else {// 그외 
		    	 System.out.println("재경기");
		     }
		     
	}// m e 

}//c s 
