package chap05;

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
 * 	=================================
 * [코드 작성 조건]
 * 배열을 이용하여 보다 효율적인 코드를 작성하세요
 */

public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		// 기본 값을 31로 지정해준다
		int year, month, monthLastDay = 31;
		
		System.out.printf("년도와 월을 입력하세요 : ");
		year = sc.nextInt();
		month = sc.nextInt();
		sc.close();
		
		switch(month) {
		case 4: case 6: case 9: case 11:
			monthLastDay = 30;
			break;
		case 2:
			if((year % 4 == 0 && year % 100 != 0) ||(year % 400 == 0)) {
				monthLastDay = 29;
			}else {
				monthLastDay = 28;
			}
			break;
		}
			System.out.printf("%d년 %d월의 마지막 일자는 %d일입니다.", year, month, monthLastDay);
	}
		
	
//		int [] arr1 = {28, 29, 30};
//		
//		if((year % 4 == 0 && year % 100 != 0) ||(year % 400 == 0)) {
//			arr1[1];
//		}else {
//			arr1[0];
//		}
//		break;
		
		
	
	
	

}