package chap04;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생의 시험 점수를 입력하세요 : ");
		int score = sc.nextInt();
		sc.close();
		
		if(score >= 70) {
			System.out.println("\t합격입니다");
			System.out.println("\t축하합니다~!");
		}
		
		System.out.println("\n프로그램 종료!");
		
	}

}
