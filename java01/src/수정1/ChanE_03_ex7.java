package ����1;
import java.util.Scanner;
public class ChanE_03_ex7 {
		 // c s 

		// ���� ���� [ �������� ����Ҽ� �ִ� ���� ���� ]
		public static void main(String[] args) { // ms
			
			
			boolean run = true; // ���� ���� ���� / true = ���� false = ����
			int balance = 0; // ���ݾ� [����ȿ� �ִ� �ݾ� ]���� 
			Scanner scanner = new Scanner(System.in); // �Է°�ü 
			
			while(run) { //while ( true ) { }  :���ѷ��� 
				System.out.println("---------------");
				System.out.println("1.���� 2.��� 3.�ܰ� 4.����");
				System.out.println("---------------");
				System.out.print("����>");
				
				int ���� = scanner.nextInt(); // �Է¹��� ���� �������� 
				
			if (���� == 1) { // ���� �Է°��� 1 �̸�
				System.out.print("���ݾ� :"); int ���ݾ� = scanner.nextInt();
				balance += ���ݾ�; // �Է¹��� ���ݾ��� ���忡 �߰� + 
			}
			 
			else if (���� == 2) {//���� �Է°��� 2 �̸� 
				System.out.print("��ݾ� :"); int ��ݾ� = scanner.nextInt();
				
				//���࿡ ��ݾ��� ���ݾ׺��� �� ũ�� �ܾ׺��� 
				if(��ݾ� > balance) { System.out.println("�˸�) �ܾ� ����."); }
				//�ƴϸ� ��ݽ���
				else { balance -= ��ݾ�; } //�Է¹��� ��ݾ��� ���忡�� - 
				
				}// else if end 
			else if (���� == 3) { //���� �Է°��� 3 �̸� 
				System.out.println("�ܰ� :"+balance);	
			}
			else if(���� == 4) {//���� �Է°��� 4 �̸�
				break; // while Ż�� [ ���ѷ��� ����  ]
				
			}else { //�׿� 
				System.err.println("�˸�)atm�Ⱑ �������� ���߾��.");
			}
	
			}// w e 

			
			
		}// m e 

	}// c e 



