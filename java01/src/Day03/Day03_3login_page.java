package Day03;

import java.util.Scanner;

public class Day03_3login_page {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("==============login page==========");
		 System.out.print(" ���̵� :");  String id = scanner.next();
		 				// char �ڷ��� [ ���� 1�� ���� ]
							// �ڷ������� ���ڿ��� �����Ҽ� ����.
								// 1. String Ŭ���� ����ϸ� ���ڿ� ���尡�� 
								// 2. char �迭/����Ʈ ����ϸ� ���� 
		 System.out.print("��й�ȣ :"); int pw = scanner.nextInt();
							// ��ü�� ����Ұ�
								// �ڷ��� ����ϴ� ������ ������ ��� ���� 
								// Ŭ���� ����ϴ� ��ü�� ������ ��� �Ұ� -> �޼ҵ�
									// ���ڿ� �񱳽� .equals
									// ���ڿ�1.equals( ���ڿ�2 ) 
		 boolean �α��μ��� = false; 
		 	//boolean : 1bit true or false saves 
		 
		 if (id.equals("admin") ) {	//id�� Ŭ���� ��ü�̱� ������ == �Ҥ����� // ��ü�񱳽ÿ��� .equals() ���}
			 //�Է��� id�� admin �̸� 
			 if (pw ==1234 ) { //pw �� �ڷ��� �����̱� ������ == ���� 
				 //�Է��� pw 1234 �̸� 
				 System.err.println("�˸�)) �α��� ����");
				 �α��μ��� = true; //id , pw �� ��� �����ϸ� �α��μ��� ������ true ���� 
			 	}//pw if end 
	
		 else {// �Է��� pw�� 1234 ��  �ƴϸ� 
			 System.out.println("�˸�)��й�ȣ ����ġ.");
		 }
		 }	else {// �Է��� id�� admin �� �ƴϸ� 
			 System.out.println("�˸�)���̵� ����ġ.");
		 }
		     if(�α��μ��� == false ) System.out.println("�˸�)�α��� ����");{}
		     		     		//login ���� ������ false �̸� ��� 
		     
		     
		     
	
	}//me

}// c e 
