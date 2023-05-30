package chap04;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1부터 100 사이의 모든 홀수의 합을 구하여 그 결과를 출력하는 코드를 작성하세요
		
		
		int i, total = 0;
		
		for(i = 1; i<=100; i++) {
			if(i % 2 != 0) {
				total += i;
			}
		}
		System.out.println("1부터 100 사이의 홀수의 합은 " + total + "입니다");
		
		
//		int total = 0;
//		for(int i = 1; i <= 100; i += 2) {
//			total += i;
//		}
//		
//		System.out.println("1부터 100 사이의 홀수의 합은 " + total + "입니다");
		
	}

}