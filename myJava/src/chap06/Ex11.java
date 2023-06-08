package chap06;

public class Ex11 {

	int add(int num1, int num2) {
		return num1 + num2;
	}
	
	double add(double num1, double num2) {
		return num1 + num2;
	}
	
	int add(int [] arr) {
		int total = 0;
		
		for(int num : arr) {
			total += num;
		}
		return total;
	}
	
//	int add(int a, int b) {
//		return a + b;
//	}
	
//	long add(int num1, int num2) {
//		return(long)a + b;
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ex11 ex11 = new Ex11();
		
		System.out.println("ex11.add(3, 4): " + ex11.add(3, 4));
		System.out.println("ex11.add(3.5, 4.2): " + ex11.add(3.5, 4.2));

		System.out.println("ex11.add(new int[] {1,2,3,4,5}): " + ex11.add(new int[] {1,2,3,4,5}));
		// 재사용 불가
		
	}

}