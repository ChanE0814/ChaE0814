package Day03;

import java.util.Scanner;

public class Day03_6 {
	
	public static void main(String[] args) {
		
	try (Scanner scanner = new Scanner(System.in)) {
		//������1 : �Է¹��� �� ��ŭ * ��� 
		System.out.println("����1)������ :"); int s1 = scanner.nextInt();
		for(int i=1; i <=s1 ; i++) {
			
			System.out.println("*");
		}
			System.out.println("\n-------------------------------------------");
		
			//������2 : �Է� ���� �� 
		
			System.out.println("����2)������ :"); int s2 = scanner.nextInt();
		for (int i=1; i<=s2 ; i ++) {
			//*i�� 1���� �Է¹��� ������ i�� 1�� �����ϸ鼭 ���๮ �ݺ�ó��
			System.out.println("*");
			//5������ �ٹٲ� -> 5������� ->���ã��
			if (i%5 ==0) System.out.println();//�ٹٲ�ó�� 
				
		}
			System.out.println("\n--------------------------------------------");
		//������3 : �Է¹��� �� �� ��ŭ ���
		System.out.println("����3) �ټ� :"); int line3 = scanner.nextInt();
		for(int i = 1; i <=line3; i++)  {
			//i�� 1���� �Է¹��� �� ������ 1������ 
			
			//1.�����
			for (int s = 1; s<=i ; s++) {
				System.out.println("*");
			}//for star point end 
				//2. �ٹٲ�ó�� 
				System.out.println();
		}//for end 
			
	
	
						//����3 ������ 
						//����ڰ� 3�� �Է�������
						//i = 1 i<=3 [true] -> i++
							//s = 1 s<=1 [true] ->
							//s = 2 s<=1 [false] ->
					
						//������
							//����ڰ� 3�� �Է�������
							//i = 1  i=3 [true]
								// s = 1 s<=1 [true] -> * -> s++
								// s = 2 s<=1 [false] -> * - > s++
					
							//�ٹٲ� 
							//i =2  i<=3 [ true ] -> i++
								//s = 1 s=3 [true] -> * -> s++
								//s = 2 s=3 [true] -> * -> s++
								//s = 3 s=3 [true] -> * -> s++
								//s = 4 s=3 [false] -> �ݺ��� ���� 
							//�ٹٲ� 
							//i = 4 i<=3 [ false ] for1 �ݺ��� ���� 
		System.out.println("\n-------------------------------------");
	 //������4 : �Է¹��� �� �� ��ŭ ��� 
	System.out.println("����3) �ټ� :"); int line4 = scanner.nextInt();
	for(int i=1; i <=line4; i++) { 
		
		//1. �����
		for(int s=1; s <=line4-i+1; s++) {
			System.out.println("*");
		}
		//2.�ٹٲ� 
		System.out.println();
		}
		
			//������4 : �Է¹��� �� �� ��ŭ ���
		System.out.println("����3) �ټ� :");
		int line5 = scanner.nextInt();
		
		for( int i = 1; i <=line5; i++) {
			//1.�������
			for(int b = 1; b<=line5-i ; b++) {
				System.out.println(" "); //���� => �����̽���	
		}		
		
		//2.����� 
		for (int s = 1 ; s<=i; s++ ) {
			System.out.println("*");
		}
		//3.�ٹٲ� 
		System.out.println();{
			}
	
	
	//������5 : �Է¹��� �� �� ��ŭ ��� 
	Scanner line9 = new Scanner(System.in);
	System.out.print("����6)�ټ�  :");
	int line52 = scanner.nextInt();
	
		
		for (int j = 1; i<=line52 ; i++) {
			//1.������� 
			System.out.print(" ");	
		}
		//2. ����� 
		for (int s = 1 ; s<=line52-i+1; s++) {
			System.out.println("*");
		}
		//3.�ٹٲ� 
		System.out.println();
	}
	//������6 : �Է¹��� �� �� ��ŭ ��� 
	System.out.print("����6)�ټ� :");
	int line7 = scanner.nextInt();
	
	for( int i = 1 ; i <=line7 ; i++) {
		//����
		for( int b=1 ; b<=line7-i ; b++) {
			System.out.print(" ");
		}
		//�����
		for(int s=1; s<=line7-i+1; s++ ) {
	}		
		
		
		System.out.println("����7) �ټ� :");
		int line52 = scanner.nextInt();
		for (int j = 1 ;  i<=10 ; i++) {
			//1.�������
			
			for (int b = 1 ; b<=line7; b++) {
			System.out.println(" ");
			}
			
			//�����
			for ( int s=1;  s<=i*2-1; s++ ) {
					System.out.println(" ");{
					}
			}
			
		}
	}
	


			}
		}
	}

		
