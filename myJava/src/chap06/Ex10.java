package chap06;

public class Ex10 {
	
	int sum(int num) {
		if(num == 1){
			return 1;
		}
		
		return num + sum(num - 1);
	}

//	long factorial (int n) {
//		long result = 0;
//		
//		if(n==1) {
//			result = 1;
//		}else {
//			result = n * factorial(n-1);
//		}
//		return result;
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ex10 ex10 = new Ex10();
		System.out.println("total: " + ex10.sum(10));
		
//		System.out.println(ex10.factorial(10));
		
		
		
//		int total = 0;
//		
//		for(int i=0; i<=10; i++) {
//			total += i;
//		}
//		System.out.println("total: " + total);
		
		
	}

}