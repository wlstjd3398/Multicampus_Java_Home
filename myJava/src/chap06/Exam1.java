package chap06;

import java.util.Scanner;

/*
 * ����ڿ��� �ϳ��� �Ǽ��� �Է� �޾� ������ ����� ����ϴ� �ڵ带 �ۼ��ϼ���
 * ��, ��ü���������� �ڵ带 �ۼ��մϴ�
 * 
 * ������1]
 * �ϳ��� �Ǽ��� �Է��ϼ��� : 3.64
 * ����: 3
 * �ݿø�: 4
 * �ø�: 4
 * 
 * ������2]
 * �ϳ��� �Ǽ��� �Է��ϼ��� : 6.2364
 * ����: 6
 * �ݿø�: 6
 * �ø�: 7
 * 
 * ������3]
 * �ϳ��� �Ǽ��� �Է��ϼ��� : 4.0
 * ����: 4
 * �ݿø�: 4
 * �ø�: 4
 */

public class Exam1 {
	
	
	void printExam(char ch, int count) {
		for(int i=0; i<count; i++) {
			System.out.print(ch);
		}
		
		System.out.println("\n\t�ϳ��� �Ǽ��� �Է��ϼ���");
		
		for(int i=0; i<count; i++) {
			System.out.print(ch);
		}
	}
	
	
	int printUpper(int num) {
		if(num == (int)num) {
			System.out.println("\t�ø� : " + (int)num);
		}else {
			System.out.println("\t�ø� : " + (int)(num + 1));
		}
	}
	
	
	int printMiddle(int num) {
		System.out.println("\t�ݿø� : "+ (int)(num + 0.5));
	}
	
	
	int printUnder(int num) {
		System.out.println("\n\t���� : "+ (int)num);
	}
	


	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Exam1 ex1 = new Exam1();
		ex1.printExam('=', 40);
		
		ex1.printUnder(0);
		ex1.printMiddle(0);
		ex1.printUpper(0);
		
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("\t�ϳ��� �Ǽ��� �Է��ϼ���");
//		
//		double num = sc.nextDouble();
//		sc.close();
//		
//		System.out.println("\n\t���� : "+ (int)num);
//		System.out.println("\t�ݿø� : "+ (int)(num + 0.5));
//		
//		if(num == (int)num) {
//			System.out.println("\t�ø� : " + (int)num);
//		}else {
//			System.out.println("\t�ø� : " + (int)(num + 1));
//		}
		
		
		
		
	}

}
