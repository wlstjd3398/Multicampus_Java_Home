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

public class Exam5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int user, com;
		String userStr = "", comStr = "", result = "�����ϴ�";
		String intro = "\n\t[���������� ����] \n"
				+ " \n"
				+ " \t 1. ���� \n"
				+ " \t 2. ���� \n"
				+ " \t 3. �� \n"
				+ " \t >>>";
		
		com = (int)(Math.random() * 3);
		
		System.out.print(intro);
		user = sc.nextInt() - 1;
		sc.close();
		
		switch(user) {
			case 0: userStr = "����"; break;
			case 1: userStr = "����"; break;
			case 2: userStr = "��"; break;
		}
		
		switch(com) {
		case 0: comStr = "����"; break;
		case 1: comStr = "����"; break;
		case 2: comStr = "��"; break;
		}
		
		switch(user - com) {
		case 0: result = "�����ϴ� �Ѥ�"; break;
		case 1: case -2: result ="�̰���ϴ� ^^"; break;
		case 2: case -1: result = "�����ϴ� �̤�"; break;
		}
		
		System.out.printf("\n\t����� : %s, ��ǻ�� : %s \n", userStr, comStr);
		System.out.printf("\t ���������� ��� ==> %s\n", result);
		
	}

}