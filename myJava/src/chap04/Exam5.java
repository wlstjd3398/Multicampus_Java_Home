package chap04;

import java.util.Scanner;

/*
 * [���������� ����]
 * 
 * 1. ����
 * 2. ����
 * 3. ��
 * >>> 3
 * 
 * ����� ��, ��ǻ�� ����
 * ���������� ��� -> �����ϴ�
 * 
 * ���� �� 
 * -> �����ϴ�
 * =================================
 * [�ڵ� �ۼ� ����]
 * 1. switch ���� �̿��Ͽ� ������ �ذ��ϼ���
 * 2. if ���� �̿��Ͽ� ������ �ذ��ϼ���
 * 
 */

public class Exam5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("1.����, 2.����, 3.�� �� �ϳ��� ���ڸ� �Է��ϼ���");
		Scanner sc1 = new Scanner(System.in);
		
		int game = sc1.nextInt();
		
		sc1.close();
	
		int com = (int)(Math.random() * 3 + 1);
			
		
//		switch(game) {
//		case 3:
//			System.out.println("����� : ��");
//			break;
//		case 2:
//			System.out.println("����� : ����");
//			break;
//		case 1:
//			System.out.println("����� : ����");
//			break;
//		}
//		switch(com) {
//		case 3:
//			System.out.println("��ǻ�� : ��");
//			break;
//		case 2:
//			System.out.println("��ǻ�� : ����");
//			break;
//		case 1:
//			System.out.println("��ǻ�� : ����");
//			break;
//		}
//		
//		
//		switch(game - com) {
//		case 1: 
//			
//			System.out.println("����� �̰���ϴ�");
//			break;
//		case -2:
//			
//			System.out.println("����� �̰���ϴ�");
//			break;
//		case 2: 
//			
//			System.out.println("����� �����ϴ�");
//			break;
//		case -1:
//			
//			System.out.println("����� �����ϴ�");
//			break;
//		case 0:
//			System.out.println("�����ϴ�");
//			break;
//		}
		
		
			
		if(game  == 3) {
			System.out.println("����� : ��");
		}else if(game == 2) {
			System.out.println("����� : ����");
		}else if(game == 1) {
			System.out.println("����� : ����");
		}
		
		if(com  == 3) {
			System.out.println("��ǻ�� : ��");
		}else if(com == 2) {
			System.out.println("��ǻ�� : ����");
		}else if(com == 1) {
			System.out.println("��ǻ�� : ����");
		}
			
		if(game - com == 1 || game - com == -2) {
			System.out.println("����� �̰���ϴ�");
		}else if(game - com == 2 || game - com == -1) {
			System.out.println("����� �����ϴ�");
		}else {
			System.out.println("�����ϴ�");
		}
		
	}

}