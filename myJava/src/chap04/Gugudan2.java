package chap04;

/*
 * 2단부터 9단의 전체 구구단 결과를 실행 예와 같이 출력하는 코드를 작성하세요
 * 단, 하나의 for 반복문을 사용합니다
 * 
 * 실행 예]
 * 2 * 1 = 2
 * 2 * 2 = 4
 * . . .
 * 3 * 1 = 3
 * 3 * 2 = 6
 * 3 * 3 = 9
 * . . .
 * 4 * 9 = 36
 * . . .
 * 9 * 9 = 81
 */

public class Gugudan2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int dan = 2, num =1;
//		
//		for(int i = 0; i < 72; i++) {
//			System.out.printf("%d * %d = %2d\n", dan, num, dan*num);
//			num++;
//			if(num == 10) {
//				dan++;
//				num = 1;
//			}
//		}
		
		
		//전체 반복횟수와 중첩for 사용하지않고 해보기
		int dan = 2, num;
		
		for(num = 1; num <= 9; num++) {
			System.out.printf("%d * %d = %2d\n", dan, num, dan*num);
			if(num == 9) {
				dan++;
				num = 1;
			}
			if(dan == 10) {
				break;
			}
		}
		
	}

}