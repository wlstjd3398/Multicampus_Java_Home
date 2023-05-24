package chap02;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name;
		int math_score;
		
		Scanner sc = new Scanner(System.in);
		// system.in 키보드로부터 입력받는다
		// system.out 모니터로 출력함
		System.out.println("이름을 입력하세요. ");
		name = sc.next();
		
		System.out.println("수학 점수를 입력하세요. ");
		math_score = sc.nextInt();
		
		System.out.println("이름 = "+name+", 수학 점수 = "+math_score);
		
		sc.close();
		// sc를 사용했으면 끝내줘야함
		
	}

}
