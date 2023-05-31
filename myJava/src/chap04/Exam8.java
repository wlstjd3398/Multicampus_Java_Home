package chap04;

/*
 * 1부터 100 사이의 모든 소수를 아래와 같이 출력하는 코드를 작성하세요
 * 
 * [ 실행 예 ]
 * 
 * 한줄에 5개씩
 * 2  3  5  7  11
 * 13 17 19 23 29
 * 31 37 41 43 47
 * 53 59 61 67 71
 * 73 79 83 89 97
 * 
 */

public class Exam8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean isPrime;
		int count = 0;
		
		for(int i=2; i<=100; i++) {
			isPrime = true; // 각각의 i값은 소수라고 가정!
			
			for(int j=2; j<= i/2; j++) {
				if(i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				count++;
				System.out.printf("%3d ", i);
				
				if(count % 5 == 0) {
					System.out.println();
				}
			}
		}	
		
		
//		boolean isPrime;
//		
//		for(int i=2; i<=100; i++) {
//			isPrime = true; // 각각의 i값은 소수라고 가정!
//			
//			for(int j=2; j<= i/2; j++) {
//				if(i % j == 0) {
//					isPrime = false;
//					break;
//				}
//			}
//			if(isPrime) {
//				System.out.print(i + "  ");
//			}
//			
//			System.out.println();
//		}
		
		
	}

}