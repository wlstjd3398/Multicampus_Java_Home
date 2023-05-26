package chap04;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생의 시험 점수를 입력하세요 : ");
		int score = sc.nextInt();
		sc.close();
		
		// (score >= 40)
		
		if(score >= 90) {
			System.out.println("\t참 잘했습니다");
		}else if(score >= 80) {
			System.out.println("\t잘했습니다");
		}else if(score >= 70) {
			System.out.println("\t보통입니다");
		}else if(score >= 60) {
			System.out.println("\t좀 더 노력하세요");
		}else {
			System.out.println("\t재수강 대상입니다");
		}
		System.out.println("\n프로그램 종료!");
		
		
	}

}
