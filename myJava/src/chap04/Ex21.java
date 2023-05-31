package chap04;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int age;
		String addr;
		
		System.out.print("나이를 입력하세요 : ");
		age = sc.nextInt();
		
		sc.nextLine();
		System.out.print("주소를 입력하세요 : ");
		
		addr = sc.nextLine();
		System.out.println("나이 : " + age + ", 주소 : "+ addr);
		
		
	}

}