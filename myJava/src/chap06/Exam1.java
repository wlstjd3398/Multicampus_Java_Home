package chap06;

import java.util.Scanner;

/*
 * 사용자에게 하나의 실수를 입력 받아 다음의 결과를 출력하는 코드를 작성하세요
 * 단, 객체지향적으로 코드를 작성합니다
 * 
 * 실행결과1]
 * 하나의 실수를 입력하세요 : 3.64
 * 버림: 3
 * 반올림: 4
 * 올림: 4
 * 
 * 실행결과2]
 * 하나의 실수를 입력하세요 : 6.2364
 * 버림: 6
 * 반올림: 6
 * 올림: 7
 * 
 * 실행결과3]
 * 하나의 실수를 입력하세요 : 4.0
 * 버림: 4
 * 반올림: 4
 * 올림: 4
 */

public class Exam1 {
	
	void printExam(char ch, int count) {
		for(int i=0; i<count; i++) {
			System.out.print(ch);
		}
		System.out.print("\n\t하나의 실수를 입력하세요: ");
	}
	
	int printUnder(double num) {
		return (int)num;
	}
	
	int printMiddle(double num) {
		return (int)(num + 0.5);
	}
	
	int printUpper(double num) {
		if(num == (int)num) {
			return (int)num;
		}else {
			return (int)(num + 1);
		}
	}

}
