package oop;

import java.util.Scanner;

public class DateTest1 {
	
//	����ڿ��� ��,��,���� �Է� �޾� �Է��� ������ ������ ��ȯ�ϴ� ���α׷��� �ۼ��ϼ���
//	��, �ݵ�� ��ü�������� �ڵ带 �ۼ��Ͽ����մϴ�
//
//	<���� ��>
//	��, ��, ���� �Է��ϼ���: 2023 06 12
//	�Է��Ͻ� 2023�� 6�� 12���� ������ �Դϴ�

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int year, month, day;
		int count = 0;
		int [] monthLastDays = {-1, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] days = {"��", "��", "ȭ", "��", "��", "��", "��"};
		
		System.out.print("��, ��, ���� �Է��ϼ���: ");
		year = sc.nextInt();
		month = sc.nextInt();
		day = sc.nextInt();
		sc.close();
		
		Date1 date1 = new Date1();
		date1.AllDays(year, count);
		date1.LeapDays(year, monthLastDays);
		date1.monthDays(month, count, monthLastDays);
		
		//�ϼ� ���ϱ�
		count += day;
				
		//���� ���ϱ�
		count %= 7;
		
		System.out.printf("%d�� %d�� %d���� %s�����Դϴ�.\n", year, month, day, days[count]);
		

	}
	
}