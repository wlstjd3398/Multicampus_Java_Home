package chap04;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�л��� ���� ������ �Է��ϼ��� : ");
		int score = sc.nextInt();
		sc.close();
		
		if(score >= 70) {
			System.out.println("\t�հ��Դϴ�");
			System.out.println("\t�����մϴ�~!");
		}else {
			System.out.println("\t���հ��Դϴ�");
			System.out.println("\t������ �ٽ� �������ּ���");
		}
		System.out.println("\n���α׷� ����!");
		
	}

}
