package chap03;

import java.util.Scanner;

//exam1. 사용자에게 영어와 수학 점수를 입력으로 받아 두 과목 모두 80점 이상이면 true, 아니면 false 값을 출력하는 코드를 작성하세요(if 사용x)
//exam2. 사용자에게 영어와 수학 점수를 입력으로 받아 두 과목 중 한 과목이라도 80점 미만인 점수가 있으면 true, 아니면 false 값을 출력하는 코드를 작성하세요
//exam3. 사용자에게 영어와 수학 점수를 입력으로 받아 두 과목 모두 80점 이상이면 true, 아니면 false 값을 출력하는 코드를 작성하세요(if 사용x)
//단, AND 연산자는 사용할 수 없습니다.

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int math1, eng1;
		System.out.printf("영어와 수학 점수를 입력하세요 >>");
		
		math1 = sc.nextInt();
		eng1 =sc.nextInt();
		
		boolean result1 = math1 >= 80 && eng1 >= 80;
		System.out.println("exam1 = " + result1);
		
		boolean result2 = math1 < 80 || eng1 < 80;
		System.out.println("exam2 = " + result2);
		
		boolean result3 = !(math1 < 80 || eng1 < 80);
		System.out.println("exam3 = " + result3);

		sc.close();
		
	}

}