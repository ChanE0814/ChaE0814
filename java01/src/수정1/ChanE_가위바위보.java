package ����1;

import java.util.Random;
import java.util.Scanner;

public class ChanE_���������� {// c s
	/*
	 * ��������������
		1. ����ڿ��� ����[0]����[1]��[2] ����[3] �߿�  �Է¹ޱ�
		2. ��ǻ�� �����߻�[0~2] 
		3. ����ڿ� ��ǻ���� �¸��� �Ǵ� [ ����Ǽ� ]
		4. 3�� �����ϱ� ������ ���� ���� 
		5. 3�� ���ý� �������� 
			1. �� ���Ӽ� ���	��) 3��
			2. ���� �¸� ���	��) ��ǻ�� 2  ����� 1
	 */
	
	public static void main(String[] args) { // m s 
		
		 	
				int �÷��̾�; 
				int ��ǻ��;
				int ���Ӽ�=0;
				int �÷��̾�¸���=0; int ��ǻ�ͽ¸���=0; 
				Scanner scanner = new Scanner (System.in);
				
				while ( true ) { 
					System.out.println("--------��������������-----------");
					System.out.print("����(0) ����(1) ��(2)     ����(3) ���� : ");
					�÷��̾� = scanner.nextInt();
					
					Random random =new Random();
					
					// random.nextInt() :  int�� ǥ���Ҽ� �ִ� ������ ���� �߻� 
					// random.nextInt(��) + ���۹�ȣ :  0 ~ �� ������ ������ ���� �߻� 
						// random.nextInt(10) : 0~9 �� ���� �߻�
						// random.nextInt(11)+10 : 10~20 �� ���� �߻�
					��ǻ�� = random.nextInt(3);
					
					
				if (�÷��̾� ==3) {
					System.out.println("�˸�) ��������");
					System.out.println("�� ���� Ƚ�� :"+���Ӽ�);
					if ( �÷��̾�¸��� > ��ǻ�ͽ¸��� ) { System.out.println(" ���� �¸��� : �÷��̾� ("+�÷��̾�¸���+")");
					}
					else if (�÷��̾�¸��� < ��ǻ�ͽ¸���) {System.out.println("���� �¸��� : ��ǻ��("+��ǻ�ͽ¸���+")");}
					else { System.out.println("���� �¸� : ���º�");}
					
					break;
					
				}else if (�÷��̾� >=0 && �÷��̾� <=2) {
					
					if( ( �÷��̾� ==0 && ��ǻ��==2)|| (�÷��̾�==1&&��ǻ��==0)||(�÷��̾�==2&&��ǻ��==1)) {
						
						System.out.println("�˸�)) �÷��̾� �¸�");
						�÷��̾�¸���++; //�¸�������
					}else if((�÷��̾�==0 &&��ǻ��==0)|| (�÷��̾�==1&&��ǻ��==1)||(�÷��̾�==2&&��ǻ��==2)) {
						System.out.println("�˸�)) ���º�");
					}
					else {//�׿� ��ǻ�� �¸�
						System.out.println("�˸�)) ��ǻ�� �¸�");
						��ǻ�ͽ¸���++;
					}
					//���Ӽ� ����
					���Ӽ�++;
					
				}else {
						System.out.println("�˸�)) �˼����� �ൿ�Դϴ�.");
					
					
						
					
					
					}
					
				}//while end
	
	
		
		
		
		
		
		
	}//  m e
		
}// c e
