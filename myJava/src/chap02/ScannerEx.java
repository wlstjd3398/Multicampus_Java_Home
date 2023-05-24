package chap02;

import java.util.Scanner;    // Scanner를 사용하기 위해 추가

class ScannerEx { 
	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in);

		int math, eng;
		
		System.out.print("두자리 정수를 하나 입력해주세요.-> ");

		math = scanner.nextInt();
		eng = scanner.nextInt();
		
//		String input = scanner.nextLine(); nextline 단일값들을 읽을때 사용하는 것이 아님
//		int num = Integer.parseInt(input); // Integer 정수를 객체화, parseInt 입력받은 문자열을 숫자로 변환
//		System.out.printf("입력내용 : %s \n"+input);
		
		System.out.printf("수학점수 : %d, 영어점수 : %d", math, eng);
		
		scanner.close();
	} 
}
