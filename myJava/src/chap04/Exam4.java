package chap04;

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
 */

public class Exam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		System.out.printf("�⵵�� ���� �Է��ϼ��� : ");
		int year = sc1.nextInt();
		int month = sc2.nextInt();
		
		
		if(year) {
			
		}
			
		switch() {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
			System.out.println("31��");
			break;
		case 4 : case 6 : case 9 : case 11 :
			System.out.println("30��");
			break;
		case 2 :
			if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				System.out.println("29��");
			}else {
				System.out.println("28��");
			}
		}
		
		
		
	}

}