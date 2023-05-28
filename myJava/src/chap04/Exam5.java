package chap04;

import java.util.Scanner;

/*
 * [가위바위보 게임]
 * 
 * 1. 가위
 * 2. 바위
 * 3. 보
 * >>> 3
 * 
 * 사용자 보, 컴퓨터 가위
 * 가위바위보 결과 -> 졌습니다
 * 
 * 바위 보 
 * -> 졌습니다
 * =================================
 * [코드 작성 조건]
 * 1. switch 문을 이용하여 문제를 해결하세요
 * 2. if 문을 이용하여 문제를 해결하세요
 * 
 */

public class Exam5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("1.가위, 2.바위, 3.보 중 하나의 숫자를 입력하세요");
		Scanner sc1 = new Scanner(System.in);
		
		int game = sc1.nextInt();
		
		sc1.close();
	
		int com = (int)(Math.random() * 3 + 1);
			
		
//		switch(game) {
//		case 3:
//			System.out.println("사용자 : 보");
//			break;
//		case 2:
//			System.out.println("사용자 : 바위");
//			break;
//		case 1:
//			System.out.println("사용자 : 가위");
//			break;
//		}
//		switch(com) {
//		case 3:
//			System.out.println("컴퓨터 : 보");
//			break;
//		case 2:
//			System.out.println("컴퓨터 : 바위");
//			break;
//		case 1:
//			System.out.println("컴퓨터 : 가위");
//			break;
//		}
//		
//		
//		switch(game - com) {
//		case 1: 
//			
//			System.out.println("당신이 이겼습니다");
//			break;
//		case -2:
//			
//			System.out.println("당신이 이겼습니다");
//			break;
//		case 2: 
//			
//			System.out.println("당신이 졌습니다");
//			break;
//		case -1:
//			
//			System.out.println("당신이 졌습니다");
//			break;
//		case 0:
//			System.out.println("비겼습니다");
//			break;
//		}
		
		
			
		if(game  == 3) {
			System.out.println("사용자 : 보");
		}else if(game == 2) {
			System.out.println("사용자 : 바위");
		}else if(game == 1) {
			System.out.println("사용자 : 가위");
		}
		
		if(com  == 3) {
			System.out.println("컴퓨터 : 보");
		}else if(com == 2) {
			System.out.println("컴퓨터 : 바위");
		}else if(com == 1) {
			System.out.println("컴퓨터 : 가위");
		}
			
		if(game - com == 1 || game - com == -2) {
			System.out.println("당신이 이겼습니다");
		}else if(game - com == 2 || game - com == -1) {
			System.out.println("당신이 졌습니다");
		}else {
			System.out.println("비겼습니다");
		}
		
	}

}