package Day03;

import java.util.Scanner;

public class Day03_��հ� {
	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		
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
		     
	}// m e 

}//c s 
