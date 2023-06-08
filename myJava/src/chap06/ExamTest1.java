package chap06;

import java.util.Scanner;

public class ExamTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FloatToInteger fti = new FloatToInteger();
		
		Scanner sc = new Scanner(System.in);
		
		double num;
		
		System.out.print("하나의 실수를 입력하세요: ");
		num = sc.nextDouble();
		sc.close();
		
		fti.setNum(num);
		System.out.println("버림: "+ fti.floor());
		System.out.println("반올림: "+ fti.round());
		System.out.println("올림: "+ fti.ceil());
		
		
		
		
		
//		Exam1 ex1 = new Exam1();
//		ex1.printExam('=', 40);
//		
//		Scanner sc = new Scanner(System.in);
//		
//		double num = sc.nextDouble();
//		sc.close();
//		
//		System.out.println("버림: " + ex1.printUnder(num));
//		System.out.println("반올림: " + ex1.printMiddle(num));
//		System.out.println("올림: " + ex1.printUpper(num));
		
		
	}

}