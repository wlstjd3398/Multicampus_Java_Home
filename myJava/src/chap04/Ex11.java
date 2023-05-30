package chap04;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int total = 0;
		
//		for(int i = 1; i <= 100; i++) {
//			total += i;
//		}
		
		int i = 1;
		
		while(i<=100) {
			total += i;
			i++;
		}
		
		
		System.out.println("1부터 100까지 합" + total);
		
	}

}