package chap04;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int age;
		String addr;
		
		System.out.print("���̸� �Է��ϼ��� : ");
		age = sc.nextInt();
		
		sc.nextLine();
		System.out.print("�ּҸ� �Է��ϼ��� : ");
		
		addr = sc.nextLine();
		System.out.println("���� : " + age + ", �ּ� : "+ addr);
		
		
	}

}