package chap04;

import java.util.Scanner;

/*
 * [가위바위보 게임]
 * 아래의 가위바위보 코드를 이용하여 사용자가 입력을 계속해서 사용자가 원할때까지 가위바위보 게임을 구현하는 코드를 작성하세요 
 * 
 */

public class Exam7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int user, com;
		String userStr = "", comStr = "", result = "", input = "";
		String intro = "\n\t[가위바위보 게임] \n"
				+ " \n"
				+ " \t 1. 가위 \n"
				+ " \t 2. 바위 \n"
				+ " \t 3. 보 \n"
				+ " \t >>>";
		
		
		while(true) {
			com = (int)(Math.random() * 3);
			
			System.out.print(intro);
			user = sc.nextInt() - 1;
			
			
			switch(user) {
				case 0: userStr = "가위"; break;
				case 1: userStr = "바위"; break;
				case 2: userStr = "보"; break;
			}
			
			switch(com) {
			case 0: comStr = "가위"; break;
			case 1: comStr = "바위"; break;
			case 2: comStr = "보"; break;
			}
			
			switch(user - com) {
			case 0: result = "비겼습니다 ㅡㅡ"; break;
			case 1: case -2: result = "이겼습니다 ^^"; break;
			case 2: case -1: result = "졌습니다 ㅜㅜ"; break;
			}
			
			System.out.printf("\n\t사용자 : %s, 컴퓨터 : %s \n", userStr, comStr);
			System.out.printf("\t 가위바위보 결과 ==> %s\n", result);
			
			sc.nextLine();
			System.out.print("\n\t 종료하시려면 'q'를 입력하세요 : ");
			input = sc.nextLine();
			
			if(input.length() == 1 && (input.charAt(0) == 'q' ||input.charAt(0) == 'Q')) {
				break;
			}
		}
		sc.close();
		System.out.printf("\n\t 이용해주셔서 감사합니다 ... 다음에 다시 만나요~ \n");
		
		
	}

}