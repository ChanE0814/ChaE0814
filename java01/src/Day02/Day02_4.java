package Day02;

import java.util.Scanner;

public class Day02_4 {
	
	 public static void main(String[] args) {
		 
		 
		 //*�Է� -> ���� -> ��� 
		 //1.�Է� ��ü�� �����.
		 
		 //2.�Է¹��� ���� ������ �����Ѵ�. [ �Է°�ü�� �Է¹��������� ���� �����Ͱ� ����� ]
		 
		 //3.������ ����(���)�Ѵ�
		 
		 //4.����Ѵ�.
		 
		 Scanner scanner = new Scanner(System.in);
				 
				 
				 //2.�Է¹��� ���� ������ �����Ѵ�. [ �Է°�ü��  �Է¹��������� ���� �����Ͱ� ����� ] 
				 
				 
		System.out.println("�⺻�� �Է� : "); int  �⺻�� = scanner.nextInt();
													//�Է°�ü��.nextInt() int�� ������ �������� 
													//�Է°�ü��.next() : ���ڿ� ������ ��������
		
		System.out.println("���� �Է� :"); int ���� = scanner.nextInt();
		
		//3.������ ����(���)�Ѵ�
		
		int ���� = (int)(�⺻�� *0.1); //int*double �Ŀ� int������ ������ȯ (ĳ����)
		int �Ǽ��ɱݾ� = �⺻�� + ���� - ����;	//100% : 1 	 10% : 0.1
		
		//4.����Ѵ�.
		System.out.println();
		

	}
	

}
