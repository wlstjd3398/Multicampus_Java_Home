package chap04;

/*
 * 2단 ~ 9단 전체 구구단 결과를 그림과 같이 출력하는 코드를 작성하세요
 * 단, 중첩 for 반복문을 사용합니다
 * 그림은 수평구구단
 * 2단 3단 4단 ...
 * 
 */

public class Gugudan6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dan, num;
		for(num=1; num<=9; num++) {
			for(dan=2; dan<=9; dan++) {
				System.out.printf("%d * %d = %2d\t", dan, num, dan*num);
			}
			System.out.printf("\n");
		}
		
		
	}

}