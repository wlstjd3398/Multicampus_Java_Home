package chap04;

/*
 * 2�� ~ 9�� ��ü ������ ����� �׸��� ���� ����ϴ� �ڵ带 �ۼ��ϼ���
 * ��, ��ø for �ݺ����� ����մϴ�
 * �׸��� ���̺��ִ� ���򱸱���
 * 2�� 3�� 4�� ...
 * 
 * ���̺��� �ݺ��� ����ϸ� �ȵ�
 * 
 */

public class Gugudan7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dan, col;
		
		for(col = 0; col <= 9; col++) {
			for(dan = 2; dan <= 9; dan++) {
				if(col == 0) {
					System.out.printf(" [ %d �� ]\t", dan);
				}else {
					System.out.printf("%d * %d = %2d\t",dan, col, dan*col);
				}
				
			}
			System.out.println("");
		}
		
	}

}