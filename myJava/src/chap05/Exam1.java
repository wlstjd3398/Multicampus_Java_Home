package chap05;

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
 * �迭�� �̿��Ͽ� ���� ȿ������ �ڵ带 �ۼ��ϼ���
 * 
 */

public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int user, com;
		String [] kbb = {"����", "����", "��"};
		String result = "";
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
		
		switch(user - com) {
		case 0: result = "�����ϴ� �Ѥ�"; break;
		case 1: case -2: result ="�̰���ϴ� ^^"; break;
		case 2: case -1: result = "�����ϴ� �̤�"; break;
		}
		
		System.out.printf("\n\t����� : %s, ��ǻ�� : %s \n", kbb[user], kbb[com]);
		System.out.printf("\t ���������� ��� ==> %s\n", result);
		
	}
	

}