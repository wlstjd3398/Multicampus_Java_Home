package chap04;

import java.util.Scanner;

/*
 * [월의 마지막 일자 계산 프로그램 작성하기]
 * 사용자에게 년도와 월을 입력으로 받아 해당 월의 마지막 일자를 출력하는 코드를 작성하세요
 * 
 * [실행 예1]
 * 년도와 월을 입력하세요 :2023 1
 * 2023 1월의 마지막 일자는 31입니다.
 * 
 * [실행 예2]
 * 년도와 월을 입력하세요 : 2020 2
 * 2020년 2월의 마지막 일자는 29일입니다
 * 
 * [각 월의 마지막 일자]
 * 1. 큰달 : 1, 3, 5, 7, 8, 10 ,12 -> 31일
 * 2. 작은달 : 4, 6, 9, 11 -> 30일
 * 3. 2월 -> 윤년 -> 29일, 평년 -> 28일
 */

public class Exam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		System.out.printf("년도와 월을 입력하세요 : ");
		int year = sc1.nextInt();
		int month = sc2.nextInt();
		
		
		if(year) {
			
		}
			
		switch() {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
			System.out.println("31일");
			break;
		case 4 : case 6 : case 9 : case 11 :
			System.out.println("30일");
			break;
		case 2 :
			if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				System.out.println("29일");
			}else {
				System.out.println("28일");
			}
		}
		
		
		
	}

}