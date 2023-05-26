package chap04;

/*
 * 시험 점수는 0점 부터 100점 사이의 값이어야 합니다
 * 올바른 값이 입력되는 경우에만 학생의 점수를 평가하는 코드를 작성하세요 
 * 
 */

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생의 시험 점수를 입력하세요 : ");
		int score = sc.nextInt();
		sc.close();
		
		if(score >= 0 && score <= 100) {
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
			
		}else {
			System.out.println("올바른 값이 아닙니다. 올바른 점수 범위는 0 ~ 100 입니다");
		}
	
	}

}