package chap04;

/*
 * 2�ܺ��� 9���� ��ü ������ ����� ���� ���� ���� ����ϴ� �ڵ带 �ۼ��ϼ���
 * ��, ��ø for �ݺ����� ����մϴ�
 * 
 * ���� ��]
 * 2 * 1 = 2
 * 2 * 2 = 4
 * . . .
 * 3 * 1 = 3
 * 3 * 2 = 6
 * 3 * 3 = 9
 * . . .
 * 4 * 9 = 36
 * . . .
 * 9 * 9 = 81
 */

public class Gugudan4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, j;
		
		for(i=2; i<=9; i++) {
			System.out.println("");
			for(j=1; j<=9; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
		}
		
//		for(int dan = 2; dan <= 9; dan++) {
//			System.out.println("dan : " + dan);
//			for(int num = 1; num <= 9; num++) {
//				System.out.printf("%d * %d = %2d\n", dan, num, dan*num);
//			}
//		}
		
		
		
	}

}