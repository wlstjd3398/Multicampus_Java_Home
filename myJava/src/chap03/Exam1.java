package chap03;

import java.util.Scanner;

//����ڿ��� �ϳ��� �Ǽ��� �Է¹޾� ������ ����� ����ϴ� �ڵ带 �ۼ��ϼ���(����, �ݿø� ����)

//������1]
//�ϳ��� �Ǽ��� �Է��ϼ��� : 3.64 -> ���� : 3 �ݿø� : 4

//������2]
//�ϳ��� �Ǽ��� �Է��ϼ��� : 6.2364 -> ���� : 6 �ݿø� : 6


public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner sc = new Scanner(System.in);
//		System.out.println("�ϳ��� �Ǽ��� �Է��ϼ��� >> ");
//		double sil = sc.nextDouble();
//		
//		System.out.println("���� : " + (int)sil);
//		System.out.printf("�ݿø� : %.0f", sil);
//		
//		sc.close();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n\t�ϳ��� �Ǽ��� �Է��ϼ���");
		
		double num = sc.nextDouble();
		sc.close();

		
		System.out.println("\n\t���� : "+ (int)num);
		System.out.println("\t�ݿø� : "+ (int)(num + 0.5));
		
	}

}