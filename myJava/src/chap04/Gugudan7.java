package chap04;

/*
 * 2단 ~ 9단 전체 구구단 결과를 그림과 같이 출력하는 코드를 작성하세요
 * 단, 중첩 for 반복문을 사용합니다
 * 그림은 레이블있는 수평구구단
 * 2단 3단 4단 ...
 * 
 * 레이블은 반복문 사용하면 안됨
 * 
 */

public class Gugudan7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dan, col;
		
		for(col = 0; col <= 9; col++) {
			for(dan = 2; dan <= 9; dan++) {
				if(col == 0) {
					System.out.printf(" [ %d 단 ]\t", dan);
				}else {
					System.out.printf("%d * %d = %2d\t",dan, col, dan*col);
				}
				
			}
			System.out.println("");
		}
		
	}

}