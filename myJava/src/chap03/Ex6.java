package chap03;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 =5, num2 =5;
		boolean result;
		
//		result = num1 > 10 & num2++ > 5;
//		result = num1 > 10 && num2++ > 5;
		
//		result = num1 < 10 | num2++ >5;
		result = num1 < 10 || num2++ >5;
		
		System.out.println("result = " + result + ", num2 = " + num2);
		
		
		
	}

}