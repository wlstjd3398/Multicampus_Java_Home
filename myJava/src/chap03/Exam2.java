package chap03;

import java.util.Scanner;

//���� ��ȯ ���α׷�
//����ڿ��� ������ ���� ����� ���� ���α׷��� �ۼ��ϼ���
//���� ���
//����Ͻ� �ݾ��� �Է��ϼ��� : 10000
//�����Ͻ� �ݾ��� �Է��ϼ��� : 6234

//�Ž����� : 3766��
//500��¥�� ���� : 7��
//100��¥�� ���� : 2��
//50��¥�� ���� : 1��
//10��¥�� ���� : 1��
//������ �Ž����� : 6��

//[�ڵ� �ۼ� ����]
//1. �������� ������ �̿��Ͽ� ������ �ذ��մϴ�
//2. �ϳ��� ������ ����Ͽ� ������ �ذ��մϴ�

public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner sc1 = new Scanner(System.in);
//		Scanner sc2 = new Scanner(System.in);
//		
//		System.out.print("����Ͻ� �ݾ��� �Է��ϼ��� >> ");
//		int pay = sc1.nextInt();
//		
//		System.out.println("�����Ͻ� �ݾ��� �Է��ϼ��� >> ");
//		int buy = sc2.nextInt();
//		
//		int charge = pay - buy;
//		System.out.println("�Ž����� : " + charge);
//		
//		int obeak = charge / 500;
//		int beak = charge % 500 / 100;
//		int osib = charge % 500 % 100 / 50;
//		int sib = charge % 500 % 100 % 50 / 10;
//		int rest = charge % 500 % 100 % 10 % 10 % 10;
//		
//		System.out.println("500��¥�� ���� : " + obeak+"��");
//		System.out.println("100��¥�� ���� : " + beak+"��");
//		System.out.println("50��¥�� ���� : " + osib+"��");
//		System.out.println("10��¥�� ���� : " + sib+"��");
//		System.out.println("������ �Ž����� : " + rest+"��");
//		
//		System.out.println("--------------------------");
//		
//		System.out.println("500��¥�� ���� : " + charge / 500+"��");
//		System.out.println("100��¥�� ���� : " + charge % 500 / 100+"��");
//		System.out.println("50��¥�� ���� : " + charge % 500 % 100 / 50+"��");
//		System.out.println("10��¥�� ���� : " + charge % 500 % 100 % 50 / 10+"��");
//		System.out.println("������ �Ž����� : " + charge % 500 % 100 % 10 % 10 % 10+"��");
//
//		
//		sc1.close();
//		sc2.close();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\t��� �Ͻ� �ݾ��� �Է��ϼ��� : ");
		int money = sc.nextInt();
		System.out.println("\t�����Ͻ� �ݾ��� �Է��ϼ��� : ");
		money -= sc.nextInt();
		
		sc.close();
		
		System.out.printf("\n\t�Ž��� �� : %d��\n", money);
		
		System.out.printf("\t500��¥�� ���� : %d��\n", money / 500);
		
		money %= 500;
		System.out.printf("\t100��¥�� ���� : %d��\n", money / 100);

		money %= 100;
		System.out.printf("\t50��¥�� ���� : %d��\n", money / 50);
		
		money %= 50;
		System.out.printf("\t10��¥�� ���� : %d��\n", money / 10);
		
		money %= 10;
		System.out.printf("\t������ �Ž����� : %��\n", money % 10);
		
		
	}

}