package chap04;

/*
 * 1���� 100 ������ ��� �Ҽ��� �Ʒ��� ���� ����ϴ� �ڵ带 �ۼ��ϼ���
 * 
 * [ ���� �� ]
 * 
 * ���ٿ� 5����
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
			isPrime = true; // ������ i���� �Ҽ���� ����!
			
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
//			isPrime = true; // ������ i���� �Ҽ���� ����!
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