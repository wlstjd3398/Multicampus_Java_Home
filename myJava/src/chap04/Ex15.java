package chap04;

//1부터 100 까지의 합은 5050입니다
// 그렇다면 1부터 몇까지의 합이 최초로 1000을 초과하는 값일까요?
// 그 결과를 계산하여 출력하는 코드를 작성하세요

public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i = 1, total = 0;
		
		
		while(total <= 1000) {
			i++;
			total += i;
		}
		System.out.printf("1부터 %d까지의 합은 %d입니다", i, total);
		
		
//		for(i = 0; i <= 45; i++) {
//			total += i;
//		}
//		
//		System.out.printf("1부터 %d까지의 합은 %d입니다", i, total);
//		 System.out.printf("total : %d", total);
		
	}

}
