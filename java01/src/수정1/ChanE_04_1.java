package ����1;

import java.util.Scanner;

public class ChanE_04_1 {// c s
	
	public static void main(String[] args) { //  m s 
		
		
			//��� : if, switch 
			//�ݺ��� : for[] , while [ ���ѷ��� ]
				//1.�ʱⰪ 2.���ǽ� 3.������ 4.���๮
				//while ����
				// 		 	1.�ʱⰪ
				// 			while( 2.���ǽ� ) {
				// 				
				//					4.���๮;
				// 					3.������;
				// 	}
		//for ex1)
		
		for (int i= 1; i<=10  ; i++ ) {
				System.out.println(i + " ");
		}//for end 
		
				System.out.println();
				
		//while EX1)
		int i=1; // 1.�ʱⰪ
		while( 1<=10 ) { //2 ���ǽ� 
				System.out.println( i +  " " ); //4.���๮ 
				i++; //3.������ 
	
		 
		//for ex2) 1~100  ������ 
		int sum = 0;
		for ( int j =1 ;  j<=100 ; j ++ ) {
				sum+= j; //sum = sum + j ; 
				
		}//for ex2) end 
				System.out.println("1~100���� ������ : "+sum);
			
		//while ex2) 1~100���� ������
		int j = 1 ; 
		int sum2 =0;
		while (j<=100) { //2.���ǽ� [ true�̸� ���� false �̸� ����Ұ� 
				sum2 +=j; //���๮
				j++; //������ 
				
		}//while ex2 end 
		
		System.out.println("while 1~100���� ������ :"+sum2);
		
		//while ex3) [ ���� ���� ]
		
		while(true) { //���ǽ��� true ���� // true= ��� -> ���ѷ��� 
				System.out.println("���ѷ���");
				Scanner scanner2 = new Scanner(System.in);
				int exit = scanner2.nextInt();
				if(exit == 3)  
					break; //���� ����� �ݺ���Ż�� [if ���� ]
				
				
				
		}//while ex3 end 
	
	}	
		}//m e 

}

