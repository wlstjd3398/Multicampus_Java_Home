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
		
		System.out.print("��, ��, ���� �Է��ϼ���: ");
		year = sc.nextInt();
		month = sc.nextInt();
		day = sc.nextInt();
		sc.close();
		
        Date1 date1 = new Date1();
        String dayOfWeek = date1.getDayOfWeek(year, month, day);

        System.out.printf("%d�� %d�� %d���� %s�����Դϴ�.\n", year, month, day, dayOfWeek);
    }

	
}