package chap04;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�л��� ���� ������ �Է��ϼ��� : ");
		int score = sc.nextInt();
		sc.close();
		
		// (score >= 40)
		
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
		
		
	}

}
