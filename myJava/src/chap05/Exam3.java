package chap05;

import java.util.Scanner;

/*
 * [ ���� ��� ���α׷� ]
 * ����ڿ��� ��, ��, ���� �Է����� �޾� �ش� ������ ������ ����ϴ� �ڵ带 �ۼ��ϼ���
 * --------------------------------------------------------------
 * < ���� �� > 
 * ��, ��, ���� �Է��ϼ��� : 2023 6 2
 * 2023�� 6�� 2���� �ݿ����Դϴ�
 * --------------------------------------------------------------
 * < ���� ��� �˰��� >
 * ���� 1�� 1�� 1���� ������ �Դϴ�.
 */

public class Exam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
		Scanner sc = new Scanner(System.in);
		int year, month, day, count=0;
		int [] monthLastDays = {-1, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] days = {"��", "��", "ȭ", "��", "��", "��", "��"};
		
		System.out.print("��, ��, ���� �Է��ϼ���: ");
		year = sc.nextInt();
		month = sc.nextInt();
		day = sc.nextInt();
		sc.close();
		
		//�⵵ �ϼ� ���ϱ�
		for(int i=1; i<year; i++) {
	
			//����,��� ��� �˰���
			if((i % 4 == 0 && i % 100 != 0)||(i % 400 == 0)) {
				//����
				count += 366;
			}else {
				//���
				count += 365;
			}
		}
		
		// 
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			monthLastDays[2] = 29;
		}
		
		//�� �ϼ� ���ϱ� ��
		for(int i=1; i<month; i++) {
			count += monthLastDays[i];
		}
	
		
		//�ϼ� ���ϱ�
		count += day;
		
		
		//���� ���ϱ�
		count %= 7;
		System.out.printf("%d�� %d�� %d���� %s�����Դϴ�.\n", year, month, day, days[count]);
				
		
		
		
//		Scanner sc = new Scanner(System.in);
//		int year = sc.nextInt();
//		int month = sc.nextInt();
//		int day = sc.nextInt();
//		
//		char[] week = {'��','��', 'ȭ', '��', '��', '��', '��'};
//		int [] monthLastDays = {-1, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//		
//		// ���⵵�������� �ش�⵵ �ش��ϱ����� �ϼ��� ���Ѵ�(�����̸� �Ϸ簡 �߰��Ǵ½��� ���ϰ�, ����ϰ�� ���� ���� �߰�)
//		int days = (year - 1) * 365 + (year % 4)-(year % 100)+(year % 400); 
//		
//
//		for(int i=0; i<=month; i++) {
//			if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
//				monthLastDays[2] = 29;
//			}
//			
//		}
//		
//		
//		
//		
//		// �ش�⵵�� �ϼ��� ���Ѵ�
//		
//		System.out.printf("%d�� %d�� %d����  %c�����Դϴ�", year, month, day, week);
		
		
		
//		int totalDay = 365;
//		
//		System.out.printf("%d�� %d�� %d���� %c���� �Դϴ�", year, month, day, mon);
//		
//		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
//			totalDay += 1;
//			
//			if(totalDay % 7 == 0) {
//				
//			}
//		}else {
//			
//		}
//		
//		for(int i=1; i<=totalDay; i++) {
//			
//		}
		
		
		// ������ �迭�� ��, ��, ��, ����
		
		// �ʱⰪ	1�� 1�� 1�� ������
		
		// if���ǹ����� ���⿡ �ش�Ǹ�  365 + 1�� -> ���� �߰�
		// �⿡ �̾ ������ ����;��� ��øif���ǹ����� (365 or 366) % 7  = 0~6
		// ���� 2������ 28, 29
		
		// �� -> 1 ~ 12
		// �� -> 31, 30, 28, 29
		// ���� -> ��, ȭ, ��, ��, ��, ��, ��
		
		// ���� �ϼ�(������ �ִٸ� �߰�)�� ��������  +0 +1
		
	}

}