package chap03;

import java.util.Scanner;

//사용자에게 하나의 실수를 입력받아 다음의 결과를 출력하는 코드를 작성하세요(버림, 반올림 문제)

//실행결과1]
//하나의 실수를 입력하세요 : 3.64 -> 버림 : 3 반올림 : 4

//실행결과2]
//하나의 실수를 입력하세요 : 6.2364 -> 버림 : 6 반올림 : 6


public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner sc = new Scanner(System.in);
//		System.out.println("하나의 실수를 입력하세요 >> ");
//		double sil = sc.nextDouble();
//		
//		System.out.println("버림 : " + (int)sil);
//		System.out.printf("반올림 : %.0f", sil);
//		
//		sc.close();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n\t하나의 실수를 입력하세요");
		
		double num = sc.nextDouble();
		sc.close();

		
		System.out.println("\n\t버림 : "+ (int)num);
		System.out.println("\t반올림 : "+ (int)(num + 0.5));
		
	}

}