package chap06;

import java.util.Scanner;

public class ExamTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FloatToInteger fti = new FloatToInteger();
		
		Scanner sc = new Scanner(System.in);
		
		double num;
		
		System.out.print("�ϳ��� �Ǽ��� �Է��ϼ���: ");
		num = sc.nextDouble();
		sc.close();
		
		fti.setNum(num);
		System.out.println("����: "+ fti.floor());
		System.out.println("�ݿø�: "+ fti.round());
		System.out.println("�ø�: "+ fti.ceil());
		
		
		
		
		
//		Exam1 ex1 = new Exam1();
//		ex1.printExam('=', 40);
//		
//		Scanner sc = new Scanner(System.in);
//		
//		double num = sc.nextDouble();
//		sc.close();
//		
//		System.out.println("����: " + ex1.printUnder(num));
//		System.out.println("�ݿø�: " + ex1.printMiddle(num));
//		System.out.println("�ø�: " + ex1.printUpper(num));
		
		
	}

}