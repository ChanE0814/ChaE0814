package Day03;

import java.util.Scanner;

public class Day03_3 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		//����6
				// ������ �Է¹޾� ������ 90�� �̻��̸� �հ� �ƴϸ� ���հ� ��� 
//				System.out.print(" ���� : "); int ���� = scanner.nextInt();
//				if( ���� >= 90 ) System.out.println(" �հ�. ");
//				else System.out.println(" ���հ�. ");
				
				//����7
				// ������ �Է¹޾� ������ 90�� �̻��̸� A���
				//				������ 80�� �̻��̸� B���
				//				������ 70�� �̻��̸� C���
				//				�׿� �����
//				System.out.print(" ���� : "); int ����2 = scanner.nextInt();
//				if( ����2 >= 90 )System.out.println("A���");
//				else if( ����2 >=80 )System.out.println("B���");
//				else if( ����2 >=70 )System.out.println("C���");
//				else System.out.println("�����");
				
				//����8 �α���������
				// [ �Է� ] : ���̵�� ��й�ȣ�� �Է¹ޱ�
				// [ ���� ] : ȸ�����̵� admin �̰� 
				//           ��й�ȣ�� 1234 �� ��쿡�� 
				//          �α��� ���� �ƴϸ� �α��� ���� ���
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
	
						     
				/*����9 
						      *�Է� ]  : ��,��,�� �Է¹ޱ� 
						     * [ ���� ] 
						     *  	����� 90�� �̻��̸鼭	
						     *  		�������� 100�� �̸� '������' ���
						     * 			�������� 100�� �̸� '������' ���
						     * 			�������� 100�� �̸� '���п��' ���
						     * 		����� 80�� �̻��̸鼭
						     * 			�������� 90�� �̸� '�������' ���
						     * 			�������� 90�� �̸� '�������' ���
						     * 			�������� 90�� �̸� '�������' ���
						     * 		ELSE �׿� ����� 
						     */
		     
		     System.out.print("��Ʈ���� :"); int ��Ʈ = scanner.nextInt();
		     System.out.print("�ø����� :"); int �ø� = scanner.nextInt();
		     System.out.print("��Ű���� :"); int ��Ű = scanner.nextInt();
		     int ��� = (��Ʈ+�ø�+��Ű)/3; //��� �� 
		     
		     if(��� >= 90 ) {
		    	 
		    	 //if ��ø
		    	 if (��Ʈ ==100) System.out.println("��� : ��Ʈ�ݸ޴�");
		    	 if (�ø� ==100) System.out.println("��� : �ø��ݸ޴�");
		    	 if (��Ű ==100) System.out.println("��� : ��Ű�ݸ޴�");
		    	
		     }//if end 
		     else if (��� >=80) {// ��� 80�� �̻�
		    	 if (��Ʈ >= 90) System.out.println(" ��� : ��Ʈ���޴�");
		    	 if (�ø� >= 90) System.out.println(" ��� : �ø��ݸ޴�");
		    	 if (��Ű >= 90) System.out.println(" ��� : ��Ű�ݸ޴�");
		     }//elsef e 
		     else {// �׿� 
		    	 System.out.println("����");
		     }
		     
}//m e 
	}//c e 
	


	
		
	  	

	  	
	  	
