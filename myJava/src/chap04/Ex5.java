package chap04;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("학생의 시험점수를 입력하세요 : ");
		int score = sc.nextInt();
		sc.close();
		
		if (score >= 98) {
			System.out.println("\tA+");
		}else if(score >= 94) {
			System.out.println("\tA");
		}else if(score >= 90) {
			System.out.println("\tA-");
		}else if(score >= 88) {
			System.out.println("\tB+");
		}else if(score >= 84) {
			System.out.println("\tB");
		}else if(score >= 80) {
			System.out.println("\tB-");
		}else {
			System.out.println("\tC");
		}
		
		
	}

}
