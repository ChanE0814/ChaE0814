package Day02;

import java.util.Scanner;

public class Day02_6 {
	
	private static final int Ű = 0;

	public static void main(String[] args) {
		
		// ����2 : ���� ���� 
		/*
		 * [ �Է����� ] 
		 * 		�ݾ� 
		 * [ ���� ] 
		 * 		�ʸ��� ���� ��� ������ ���� ���� 
		 * [ ������� ]
		 * 		��) 356789 �Է½� 
		 * 		�ʸ��� 3�� 
		 * 		���� 5��
		 * 		õ�� 6�� 
		 * 		��� 7��
		 */
		// 1. �Է°�ü 
		Scanner scanner = new Scanner(System.in);
		// 2. �Է¹��� ������ -> ������ �̵� 
		System.out.println("�ݾ� : ");	int �ݾ� = scanner.nextInt();
		// 3. ���� 
		System.out.println(" �Է��� �ݾ� : " + �ݾ� );
		System.out.println(" �ʸ���  : " + (�ݾ�/100000) + "��" );
			
		//�ݾ� = �ݾ� - ( �ݾ�/100000 )*100000 ; // �ݾ׿��� �ʸ��� ���� ����
		�ݾ� -= ( �ݾ�/100000 )*100000 ;
		System.out.println(" �ʸ��� ���� : " + �ݾ� );
		System.out.println(" ���� : " + (�ݾ�/10000) + "��");
		
		�ݾ� -= (�ݾ�/10000) * 10000; // �ݾ׿��� ���� ���� ���� 
		System.out.println(" õ�� : " + (�ݾ�/1000) + "��");
		
		�ݾ� -= (�ݾ�/1000) * 1000; // �ݾ׿��� õ�� ���� ���� 
		System.out.println(" ��� : " + (�ݾ�/100) + "��");
		
		//����3 : �ϳ��� ������ �Է¹޾� 7�� ������� ���[ true , false ]
			// ���ã�� 
				// �� % �� ������ �������� 0 �̸� ���� �� ���� ��� 
		System.out.println(" ����3) ���� �Է�:"); 	int ����3 = scanner.nextInt(); // �ϳ��� ������ �Է¹ޱ� 
		System.out.println(" �Է��� ������ 7�� ��� �Ǵ� : " + ( ����3%7 == 0 ) );
		
		//����4 : �ϳ��� ������ �Է¹޾� Ȧ�� ���� Ȯ�� [ true , false ]
			// Ȧ¦ ã�� 
				// Ȧ�� : �� % 2 ������ �������� 1 �̸� ���� Ȧ�� 
				// ¦�� : �� % 2 ������ �������� 0 �̸� ���� ¦�� 
		
		//����5 : �ϳ��� ������ �Է¹޾� 7�� ��� �̸鼭 ¦�� ���� Ȯ�� [ true , false ]
		
		System.out.println("����5) ���� �Է� :");	int ����5 = scanner.nextInt();
		System.out.println("�Է��� ������ 7�ǹ�� �̸鼭 ¦�� �Ǵ� : "							+(����5%7 == 0 && ����5%2 == 0 ) );
		
	    //����6 : �ΰ��� ������ �Է¹޾� �� ū�� ���  [ true , false ]
		
		
		
		//����7 : �������� �Է¹޾� �� ���� ����ϱ� 
				// �� ���� ���� => ������ * ������ * ������[3.14]
		
		
		
		
		
		//����8 : �� �Ǽ��� �Է¹޾� �սǼ��� ���� ���� ���� ��% ���� ����ϱ�
		
				// ��) 54.5   84.3 �̸�    64.285714%
		
		System.out.println("����8)�Ǽ�1 �Է� :"); double ����8_1 = scanner.nextDouble();
		System.out.println("����8)�Ǽ�2 �Է� :"); double ����8_2 = scanner.nextDouble();
		
		
		double ���� = (����8_1/����8_2)*100;
		System.out.println("�Ǽ�1�� �Ǽ�2 ����� :"+����+ "%");
		System.out.printf("�Ǽ�1�� �Ǽ�2 ����� : %.1 %%",����);
				//%f :  �Ǽ� ǥ��
					//%����f 	//%.2f : �Ҽ� 2�ڸ� ���� ǥ�� 
								//%.5f : �Ҽ� 5�ڸ� ���� ǥ��
		

		
		
		//����9 : ��ٸ��� ���� ���ϱ�[������ �غ� ���̸� �Է¹޾� ����ϱ�]
		
				//��ٸ��� ���� = > (���� * �غ�) * ���� / 2
		
		System.out.println("����9)���� :"); double ���� = scanner.nextDouble();
		System.out.println("����9)�غ� :"); double �غ� = scanner.nextDouble();
		System.out.println("����9)���� :"); double ���� = scanner.nextDouble();
		System.out.println(" ��ٸ��� ���� :"+ ( ���� * �غ� )*���� / 2);
		
		
		
		
		//����10: Ű�� ������ �Է¹޾� ǥ��ü�� ����ϱ�
				//ǥ��ü�� ���� = > (Ű - 100) * 0.9
				Scanner scanner2 = new Scanner(System.in);
				System.out.print("����10) Ű  :"); 	int Ű = scanner.nextInt();
				System.out.println("ǥ��ü�� :"+ (Ű-100) * 0.9);
		
		
		//����11: Ű�� �����Ը� �Է¹޾� BMI ����ϱ�
				//BMI ���� = > ������ / ((Ű / 100) * (Ű / 100))
		System.out.println("����11) Ű :"); int Ű2 = scanner.nextInt();
		System.out.println("����11) ������ :"); int ������ = scanner.nextInt();
		System.out.println("BMI :"+(������/ ((Ű2/100.0)*(Ű2/100.0))));
		
		
		
		//����12: inch �� �Է¹޾� cm �� ��ȯ�ϱ� [ 1 inch -> 2.54cm ] 
		System.out.println("����12)inch :"); int ��ġ = scanner.nextInt();
		System.out.println("inch -> cm :"+ (��ġ*2.54)  );
		
		
		
		
		//����13:  �߰����, �⸻���, �����򰡸� �Է¹޾� �ݿ������� ����ϱ�
				//�Ҽ� ��° �ڸ� ���� ���� ����ϱ�
				//�߰���� �ݿ����� => 30 %
				//�⸻��� �ݿ����� => 30 %
				//������ �ݿ����� => 40 %
		System.out.println("����13) �߰���� :"); double �߰���� = scanner.nextDouble();
		System.out.println("����13) �⸻��� :"); double �⸻��� = scanner.nextDouble();
		System.out.println("����13) ������ :"); double ������ = scanner.nextDouble();
		�߰���� = �߰���� * 0.3; �⸻��� *= 0.4;  ������ *= 0.4;
		
		System.out.printf(" �ݿ������� ���� : %.2f \n", (�߰����+�⸻���+������) );
		
		
		//����14 :  ���� ���� ���� �ϰ� x�� y�� �����ϱ�
		 	//int x = 10;
			//int y = x-- + 5 + --x;
			//printf(" x�� �� : %d , y�ǰ� :  %d ", x, y)
		
		
		
		
		
			
		
		// p. 102 Ȯ�ι���
			//1.:3
			//2.: ++10 + 20-- => 11 + 20 -> 31 
				//++10 :���ϱ� ���� ����
				//20-- :���ϱ� �Ŀ� ���� 
			//3.:85>90 ? "��" : "��"
			//	80>90 -> false -> (!) -> true -> �� 
		
			//4.(1) : ���ʼ�/�л��� -> ��  pencils / students
			//  (2)  : ���ʼ�%�л��� -> ������ pencils % students
		
			//5.10�ڸ� ������ 
		 		//�� 356�϶� 56(������)���� [-] 356 - 56 => 300
				//value - (value % 100)
		
			//6.���� * �غ� *���� / 2 
				//lenthTop * lengthBottom * height /2 
			//7
				//10 > 7 && 5 <=5 true => ��� true 
				//10%3 ==2 || 5%2 != 1	false || false => ��� false 
		
		
		
		
	}
}


