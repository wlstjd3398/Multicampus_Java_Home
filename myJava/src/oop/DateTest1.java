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
		
		System.out.print("년, 월, 일을 입력하세요: ");
		year = sc.nextInt();
		month = sc.nextInt();
		day = sc.nextInt();
		sc.close();
		
        Date1 date1 = new Date1();
        String dayOfWeek = date1.getDayOfWeek(year, month, day);

        System.out.printf("%d년 %d월 %d일은 %s요일입니다.\n", year, month, day, dayOfWeek);
    }

	
}