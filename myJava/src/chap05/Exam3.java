package chap05;

import java.util.Scanner;

/*
 * [ 요일 계산 프로그램 ]
 * 사용자에게 년, 월, 일을 입력으로 받아 해당 일자의 요일을 출력하는 코드를 작성하세요
 * --------------------------------------------------------------
 * < 실행 예 > 
 * 년, 월, 일을 입력하세요 : 2023 6 2
 * 2023년 6월 2일은 금요일입니다
 * --------------------------------------------------------------
 * < 요일 계산 알고리즘 >
 * 서기 1년 1월 1일은 월요일 입니다.
 */

public class Exam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
		Scanner sc = new Scanner(System.in);
		int year, month, day, count=0;
		int [] monthLastDays = {-1, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] days = {"일", "월", "화", "수", "목", "금", "토"};
		
		System.out.print("년, 월, 일을 입력하세요: ");
		year = sc.nextInt();
		month = sc.nextInt();
		day = sc.nextInt();
		sc.close();
		
		//년도 일수 구하기
		for(int i=1; i<year; i++) {
	
			//윤년,평년 계산 알고리즘
			if((i % 4 == 0 && i % 100 != 0)||(i % 400 == 0)) {
				//윤년
				count += 366;
			}else {
				//평년
				count += 365;
			}
		}
		
		// 
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			monthLastDays[2] = 29;
		}
		
		//월 일수 구하기 전
		for(int i=1; i<month; i++) {
			count += monthLastDays[i];
		}
	
		
		//일수 구하기
		count += day;
		
		
		//요일 구하기
		count %= 7;
		System.out.printf("%d년 %d월 %d일은 %s요일입니다.\n", year, month, day, days[count]);
				
		
		
		
//		Scanner sc = new Scanner(System.in);
//		int year = sc.nextInt();
//		int month = sc.nextInt();
//		int day = sc.nextInt();
//		
//		char[] week = {'일','월', '화', '수', '목', '금', '토'};
//		int [] monthLastDays = {-1, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//		
//		// 전년도기준으로 해당년도 해당일까지의 일수를 구한다(윤년이면 하루가 추가되는식을 더하고, 평년일경우 빼는 식을 추가)
//		int days = (year - 1) * 365 + (year % 4)-(year % 100)+(year % 400); 
//		
//
//		for(int i=0; i<=month; i++) {
//			if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
//				monthLastDays[2] = 29;
//			}
//			
//		}
//		
//		
//		
//		
//		// 해당년도의 일수를 구한다
//		
//		System.out.printf("%d년 %d월 %d일은  %c요일입니다", year, month, day, week);
		
		
		
//		int totalDay = 365;
//		
//		System.out.printf("%d년 %d월 %d일은 %c요일 입니다", year, month, day, mon);
//		
//		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
//			totalDay += 1;
//			
//			if(totalDay % 7 == 0) {
//				
//			}
//		}else {
//			
//		}
//		
//		for(int i=1; i<=totalDay; i++) {
//			
//		}
		
		
		// 변수를 배열로 년, 월, 일, 요일
		
		// 초기값	1년 1월 1일 월요일
		
		// if조건문으로 윤년에 해당되면  365 + 1일 -> 요일 추가
		// 년에 이어서 요일이 따라와야함 중첩if조건문으로 (365 or 366) % 7  = 0~6
		// 윤년 2월에만 28, 29
		
		// 월 -> 1 ~ 12
		// 일 -> 31, 30, 28, 29
		// 요일 -> 월, 화, 수, 목, 금, 토, 일
		
		// 전년 일수(윤년이 있다면 추가)를 기준으로  +0 +1
		
	}

}