package chap04;

import java.util.Scanner;

/*
 * ����ڿ��� �������� ���� �Է� �޾� ������ ����� ����ϴ� �ڵ带 �ۼ��ϼ���
 * 
 * ���� ��]
 * �������� ���� �Է��ϼ��� : 4
 * [ 4 �� ]
 * 4 * 1 = 4
 * 4 * 2 = 8
 * 4 * 3 = 12
 * . . .
 * 4 * 9 = 36
 */

public class Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.printf("�������� ���� �Է��ϼ��� : ");
		
		int i = sc.nextInt();
		sc.close();
		
		System.out.println(" [ " + i + " �� ]");
		
		int j;
		 for(j=1; j<=9; j++) {
			 System.out.println(i + " * " + j + " = " + i*j);
		 }
		
		 
//		 int j;
//		 for(j=1; j<=9; j++) {
//			 System.out.printf("%d * %d = %2d\n", i, j, i*j);
//		 }
		
		 
		 
	}

}