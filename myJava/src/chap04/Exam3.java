package chap04;

import java.util.Scanner;

/*
 * [윤년 계산 프로그램]
 * ﻿사용자에게 년도를 입력 받아 윤년 여부를 판단하여 출력하는 코드를 작성하세요
 * 
 * [실행결과1]
 * 년도를 입력하세요 : 2023
 * 입력하신 년도는 평년입니다
 * 
 * [실행결과2]
 * 년도를 입력하세요 : 2020
 * 입력하신 년도는 윤년입니다
 * ===============================
 * [윤년 판단 알고리즘]
 * 1. 4의 배수인 해는 윤년입니다
 * 2. 100의 배수인 해는 평년입니다
 * 3. 400의 배수인 해는 윤년입니다
 * 
 * -> 2023년 : 평년, 2020년 : 윤년, 1900년 : 평년, 2000년 : 윤년
 * =================================
 * [코드 작성 조건]
 * 1. if ... else if ... else 구문을 이용하여 문제를 해결하세요
 * 2. if ... else 구문을 이용하여 문제를 해결하세요
 */

public class Exam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("\n년도를 입력하세요");
		int year = sc.nextInt();
		sc.close();
		
		
		if(year % 4 == 0 && year % 100 != 0) {
			System.out.println("입력하신 " + year + "년도는 윤년입니다");
		}else if(year % 400 == 0) {
			System.out.println("입력하신 " + year + "년도는 윤년입니다");
		}else {
			System.out.println("입력하신 " + year + "년도는 평년입니다");
		}
		
		
//		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
//			System.out.println("입력하신 " + year + "년도는 윤년입니다");
//		}else {
//			System.out.println("입력하신 " + year + "년도는 평년입니다");
//		}
		
		
		
	}
}