package chap05;

import java.util.Scanner;

/*
 * [���� ������ ���� ��� ���α׷� �ۼ��ϱ�]
 * ����ڿ��� �⵵�� ���� �Է����� �޾� �ش� ���� ������ ���ڸ� ����ϴ� �ڵ带 �ۼ��ϼ���
 * 
 * [���� ��1]
 * �⵵�� ���� �Է��ϼ��� :2023 1
 * 2023 1���� ������ ���ڴ� 31�Դϴ�.
 * 
 * [���� ��2]
 * �⵵�� ���� �Է��ϼ��� : 2020 2
 * 2020�� 2���� ������ ���ڴ� 29���Դϴ�
 * 
 * [�� ���� ������ ����]
 * 1. ū�� : 1, 3, 5, 7, 8, 10 ,12 -> 31��
 * 2. ������ : 4, 6, 9, 11 -> 30��
 * 3. 2�� -> ���� -> 29��, ��� -> 28��
 * 	=================================
 * [�ڵ� �ۼ� ����]
 * �迭�� �̿��Ͽ� ���� ȿ������ �ڵ带 �ۼ��ϼ���
 */

public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		// �⺻ ���� 31�� �������ش�
		int year, month, monthLastDay = 31;
		
		System.out.printf("�⵵�� ���� �Է��ϼ��� : ");
		year = sc.nextInt();
		month = sc.nextInt();
		sc.close();
		
		switch(month) {
		case 4: case 6: case 9: case 11:
			monthLastDay = 30;
			break;
		case 2:
			if((year % 4 == 0 && year % 100 != 0) ||(year % 400 == 0)) {
				monthLastDay = 29;
			}else {
				monthLastDay = 28;
			}
			break;
		}
			System.out.printf("%d�� %d���� ������ ���ڴ� %d���Դϴ�.", year, month, monthLastDay);
	}
		
	
//		int [] arr1 = {28, 29, 30};
//		
//		if((year % 4 == 0 && year % 100 != 0) ||(year % 400 == 0)) {
//			arr1[1];
//		}else {
//			arr1[0];
//		}
//		break;
		
		
	
	
	

}