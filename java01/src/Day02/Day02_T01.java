package Day02;

import java.util.Scanner;

public class Day02_T01 {
	public static void main(String[] args) {
		
		
		
		try (Scanner scanner = new Scanner (System.in)) {
			System.out.println("�������� :"); int ���� = scanner.nextInt();
			System.out.println("�������� :"); int ���� = scanner.nextInt();
			System.out.println("�������� :"); int ���� = scanner.nextInt();
			int ��� = (����+����+����)/3; //��� ���ϱ� 
				
			if (��� >=90) { //��� 90�� �̻��̸�
				//if ��ø

				 if (���� == 100 ) System.out.println("��� : ������");
				 if (���� == 100 ) System.out.println("��� : ������");
				 if (���� == 100 ) System.out.println("��� : ���п��");

			} //if e 
			else if (��� == 90) System.out.println("A���");
			else if (��� == 80) System.out.println("B���");
			else if (��� == 70) System.out.println("C���");
			else System.out.println("�����");
		}
		
		
			
		
		
	
	
	}

}
