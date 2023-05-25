package chap03;

import java.util.Scanner;

//동전 교환 프로그램
//사용자에게 다음의 실행 결과와 같은 프로그램을 작성하세요
//실행 결과
//계산하실 금액을 입력하세요 : 10000
//구매하신 금액을 입력하세요 : 6234

//거스름돈 : 3766원
//500원짜리 동전 : 7개
//100원짜리 동전 : 2개
//50원짜리 동전 : 1개
//10원짜리 동전 : 1개
//나머지 거스름돈 : 6원

//[코드 작성 조건]
//1. 여러개의 변수를 이용하여 문제를 해결합니다
//2. 하나의 변수만 사용하여 문제를 해결합니다

public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		System.out.print("계산하실 금액을 입력하세요 >> ");
		int pay = sc1.nextInt();
		
		System.out.println("구매하실 금액을 입력하세요 >> ");
		int buy = sc2.nextInt();
		
		int charge = pay - buy;
		System.out.println("거스름돈 : " + charge);
		
		int obeak = charge / 500;
		int beak = charge % 500 / 100;
		int osib = charge % 500 % 100 / 50;
		int sib = charge % 500 % 100 % 50 / 10;
		int rest = charge % 500 % 100 % 10 % 10 % 10;
		
		System.out.println("500원짜리 동전 : " + obeak+"개");
		System.out.println("100원짜리 동전 : " + beak+"개");
		System.out.println("50원짜리 동전 : " + osib+"개");
		System.out.println("10원짜리 동전 : " + sib+"개");
		System.out.println("나머지 거스름돈 : " + rest+"원");
		
		System.out.println("--------------------------");
		
		System.out.println("500원짜리 동전 : " + charge / 500+"개");
		System.out.println("100원짜리 동전 : " + charge % 500 / 100+"개");
		System.out.println("50원짜리 동전 : " + charge % 500 % 100 / 50+"개");
		System.out.println("10원짜리 동전 : " + charge % 500 % 100 % 50 / 10+"개");
		System.out.println("나머지 거스름돈 : " + charge % 500 % 100 % 10 % 10 % 10+"원");

		
		sc1.close();
		sc2.close();
		
		
	}

}