package chap06;

import java.util.Scanner;

/*
 * 사용자에게 하나의 실수를 입력 받아 다음의 결과를 출력하는 코드를 작성하세요
 * 단, 객체지향적으로 코드를 작성합니다
 * 
 * 실행결과1]
 * 하나의 실수를 입력하세요 : 3.64
 * 버림: 3
 * 반올림: 4
 * 올림: 4
 * 
 * 실행결과2]
 * 하나의 실수를 입력하세요 : 6.2364
 * 버림: 6
 * 반올림: 6
 * 올림: 7
 * 
 * 실행결과3]
 * 하나의 실수를 입력하세요 : 4.0
 * 버림: 4
 * 반올림: 4
 * 올림: 4
 */

public class Exam1 {
	
	
	void printExam(char ch, int count) {
		for(int i=0; i<count; i++) {
			System.out.print(ch);
		}
		
		System.out.println("\n\t하나의 실수를 입력하세요");
		
		for(int i=0; i<count; i++) {
			System.out.print(ch);
		}
	}
	
	
	int printUpper(int num) {
		if(num == (int)num) {
			System.out.println("\t올림 : " + (int)num);
		}else {
			System.out.println("\t올림 : " + (int)(num + 1));
		}
	}
	
	
	int printMiddle(int num) {
		System.out.println("\t반올림 : "+ (int)(num + 0.5));
	}
	
	
	int printUnder(int num) {
		System.out.println("\n\t버림 : "+ (int)num);
	}
	


	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Exam1 ex1 = new Exam1();
		ex1.printExam('=', 40);
		
		ex1.printUnder(0);
		ex1.printMiddle(0);
		ex1.printUpper(0);
		
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("\t하나의 실수를 입력하세요");
//		
//		double num = sc.nextDouble();
//		sc.close();
//		
//		System.out.println("\n\t버림 : "+ (int)num);
//		System.out.println("\t반올림 : "+ (int)(num + 0.5));
//		
//		if(num == (int)num) {
//			System.out.println("\t올림 : " + (int)num);
//		}else {
//			System.out.println("\t올림 : " + (int)(num + 1));
//		}
		
		
		
		
	}

}
