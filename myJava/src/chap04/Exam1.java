package chap04;

/*
 * ���� ������ 0�� ���� 100�� ������ ���̾�� �մϴ�
 * �ùٸ� ���� �ԷµǴ� ��쿡�� �л��� ������ ���ϴ� �ڵ带 �ۼ��ϼ��� 
 * 
 */

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("�л��� ���� ������ �Է��ϼ��� : ");
		int score = sc.nextInt();
		sc.close();
		
		if(score >= 0 && score <= 100) {
			if(score >= 90) {
				System.out.println("\t�� ���߽��ϴ�");
			}else if(score >= 80) {
				System.out.println("\t���߽��ϴ�");
			}else if(score >= 70) {
				System.out.println("\t�����Դϴ�");
			}else if(score >= 60) {
				System.out.println("\t�� �� ����ϼ���");
			}else {
				System.out.println("\t����� ����Դϴ�");
			}
			System.out.println("\n���α׷� ����!");
			
		}else {
			System.out.println("�ùٸ� ���� �ƴմϴ�. �ùٸ� ���� ������ 0 ~ 100 �Դϴ�");
		}
	
	}

}