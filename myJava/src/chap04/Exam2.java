package chap04;

import java.util.Scanner;

/*
 * ����ڿ��� �ϳ��� �Ǽ��� �Է� �޾� ������ ����� ����ϴ� �ڵ带 �ۼ��ϼ���
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


public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\t�ϳ��� �Ǽ��� �Է��ϼ���");
		
		double num = sc.nextDouble();
		sc.close();
		
		System.out.println("\n\t���� : "+ (int)num);
		System.out.println("\t�ݿø� : "+ (int)(num + 0.5));
		
//		System.out.println("\t�ø� : "+ (int)(num + 0.9999));
		
		if(num == (int)num) {
			System.out.println("\t�ø� : " + (int)num);
		}else {
			System.out.println("\t�ø� : " + (int)(num + 1));
		}
		
	}

}
