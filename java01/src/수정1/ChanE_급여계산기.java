package ����1;

import java.util.Scanner;

public class ChanE_�޿����� {
	

	// ����1 : �޿� ���
	/*
	 * 	[�Է�����]
	 * 		�⺻�� , ����
	 * 	[ ���� ] 
	 * 		�Ǽ��ɾ� = �⺻�� + ���� - ����[�⺻��10%] 
	 * 	[�������] 
	 * 		�Ǽ��ɾ� ��� 
	 */
	
	// * �Է� -> ���� -> ��� -> ���
	// 1. �Է� ��ü �����. [ �ڷ��� �ҹ��� , Ŭ������ �빮�� ]
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);// ������ �Է� ��ü !
		
		//2. �Է¹��� ���� ������ �����Ѵ� . [�Է°�ü�� �Է¹��������� ���� �����Ͱ� ������� ]
		System.out.print("�⺻�� �Է� :");
		int �⺻�� = scanner.nextInt();
		
		
		System.out.println("���� �Է� :");
		int ���� = scanner.nextInt();
		
		//3.���� ����[���]��
		
		int ���� =(int)(�⺻��*0.1); //int*double �Ŀ� int������ ������ȯ(ĳ����)
		int �Ǽ��ɾ� = �⺻�� + ���� - ���� ; 
		
		//4. print
		System.out.println("ȸ������ �Ǽ��ɾ� :"+�Ǽ��ɾ�);
						// 		���ڿ�	+	������( ������ ������ ȣ�� )
								//  + : 1. ���Ῥ���� ��� 2.���ϱ� ���

		
		
		
		
		
	}

}
