package chap03;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 6, num2 = 4, result1, result2; // num1 = 6 = 0110, num2 = 4 = 0100
		boolean bool1 = false, bool2 = true, bresult1, bresult2;
		
		
		result1 = num1 & num2; // & : Bit And Operator, result1 = 0100 => 4
		System.out.println("result1 = " + result1);
		
		bresult1 = bool1 & bool2; // & : logical And Operator = bresult1
		System.out.println("bresult1 = " + bresult1);
		
		result2 = num1 | num2; // & : Bit Or Operator, result2 = 0100 => 4
		System.out.println("result2 = " + result2);
		
		bresult2 = bool1 | bool2; // & : logical Or Operator = bresult2
		System.out.println("bresult2 = " + bresult2);
		
	}

}