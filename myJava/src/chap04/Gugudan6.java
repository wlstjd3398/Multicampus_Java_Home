package chap04;

/*
 * 2�� ~ 9�� ��ü ������ ����� �׸��� ���� ����ϴ� �ڵ带 �ۼ��ϼ���
 * ��, ��ø for �ݺ����� ����մϴ�
 * �׸��� ���򱸱���
 * 2�� 3�� 4�� ...
 * 
 */

public class Gugudan6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dan, num;
		for(num=1; num<=9; num++) {
			for(dan=2; dan<=9; dan++) {
				System.out.printf("%d * %d = %2d\t", dan, num, dan*num);
			}
			System.out.printf("\n");
		}
		
		
	}

}