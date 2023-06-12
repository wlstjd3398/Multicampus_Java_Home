package oop;

import java.util.Scanner;

public class DateTest1 {
	
//	사용자에게 년,월,일을 입력 받아 입력한 일자의 요일을 반환하는 프로그램을 작성하세요
//	단, 반드시 객체지향적인 코드를 작성하여야합니다
//
//	<실행 예>
//	년, 월, 일을 입력하세요: 2023 06 12
//	입력하신 2023년 6월 12일은 월요일 입니다

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int year, month, day;
		int count = 0;
		int [] monthLastDays = {-1, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] days = {"일", "월", "화", "수", "목", "금", "토"};
		
		System.out.print("년, 월, 일을 입력하세요: ");
		year = sc.nextInt();
		month = sc.nextInt();
		day = sc.nextInt();
		sc.close();
		
		Date1 date1 = new Date1();
		date1.AllDays(year, count);
		date1.LeapDays(year, monthLastDays);
		date1.monthDays(month, count, monthLastDays);
		
		//일수 구하기
		count += day;
				
		//요일 구하기
		count %= 7;
		
		System.out.printf("%d년 %d월 %d일은 %s요일입니다.\n", year, month, day, days[count]);
		

	}
	
}