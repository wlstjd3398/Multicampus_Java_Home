package chap04;

import java.util.Scanner;

/*
 * 사용자에게 구구단의 단을 입력 받아 구구단 결과를 출력하는 코드를 작성하세요
 * 
 * 실행 예]
 * 구구단의 단을 입력하세요 : 4
 * [ 4 단 ]
 * 4 * 1 = 4
 * 4 * 2 = 8
 * 4 * 3 = 12
 * . . .
 * 4 * 9 = 36
 */

public class Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.printf("구구단의 단을 입력하세요 : ");
		
		int i = sc.nextInt();
		sc.close();
		
		System.out.println(" [ " + i + " 단 ]");
		
		int j;
		 for(j=1; j<=9; j++) {
			 System.out.println(i + " * " + j + " = " + i*j);
		 }
		
		 
//		 int j;
//		 for(j=1; j<=9; j++) {
//			 System.out.printf("%d * %d = %2d\n", i, j, i*j);
//		 }
		
		 
		 
	}

}