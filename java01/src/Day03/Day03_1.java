package Day03;

import java.util.Scanner;

public class Day03_1 {//c s 
	
		public static void main(String[] args) {
			
			//1���� : ��� , �Է�
			//2���� : ����(����), ���(������)
			//���
				//system �Ǵܷ� => ����Ǽ� if 
			
				//����
					//1.IF ( ���ǽ� [true/false ) ���๮; 
					//2.IF ( ���ǽ� ) ���๮ [��];
					//		ELSE ���๮[����];
					//3.{ ���๮�� 2���̻� 
					//4.if (����1) { ���๮ [��1]; }
					// 		else if (����2) { ���๮ [��2]; }
					//		else if (����3) { ���๮ [��3]; }
					//		else if (����3) { ���๮ [��4]; }
					// 		else if (����5) { ���๮ [��5]; }
					//		ELSE { ���๮[����];
					//5.if ��ø
					//		IF (���ǽ�) { ���๮; }
					//  	ELSE { ���๮; }
					//  }ELSE { 
					// 		if (���ǽ�){ ���๮; }
					// 		ELSE{ ���๮; }
			//����1
			
			if( 3>1 )System.out.println("��)3�� 1���� ũ��.");
				//���࿡ 3�� 1���� ũ�� ���o �ƴϸ� ���x
				//true �̸� ����
			
	
		
			
			if( 3>5 ) System.out.println ("��) 3�� 5���� ũ��.");
			
				//���� 3�� 5���� ũ�� ���o �ƴϸ� ���x 
			if (3>1)System.out.println("��) 3�� 1���� ũ��.");
			else System.out.println("��3_1)3�� 1���� �۴�.");
			
				//���࿡ 3�� 1���� ũ�� ��3_1 ��� 
				//���� 3�� 1���� ������ ��3_2 ��� 
			
			//����4
			
			if (3>5) { //ture ���๮ ���� [���๮ (;) 2�� �̻��϶�]
				System.out.println("true");
			System.out.println("3�� 2���� ũ��."); 
			}//true ���๮ ��
			
			else {//false ���๮ ���� 
				System.out.println("false");
				System.out.println("3�� 2���� �۴�.");
			}//false ���๮ ��
			
			//����5 
		
			if (3>5)System.out.println("��5)3�� 5���� ũ��."); //x false
			else if (3>4)System.out.println("��5)3�� 4���� ũ��."); //x false
			else if (3>3)System.out.println("��5)3�� 3���� ũ��."); //x false
			else if (3>2)System.out.println("��5)3�� 2���� ũ��."); //o true
			else System.out.println("true ����"); //x false
			
			if(3>5)System.out.println("ex5) 3�� 5���� ũ��.");{} //x false 
			if(3>4)System.out.println("ex5) 3�� 4���� ũ��.");{} //x false
			if(3>3)System.out.println("ex5) 3�� 3���� ũ��.");{} //x false
			if(3>2)System.out.println("ex5) 3�� 2���� ũ��.");{} //true
			if(3<2)System.out.println("true ����.");{}//���� x 
			
		
	}//m c 

}//c e 
