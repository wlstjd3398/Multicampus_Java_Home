package chap06;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FloatToInteger2 fti1, fti2;
		double num1 = 3.6, num2 = 3.4;
		
		fti1 = new FloatToInteger2();
		fti1.setNum(num1);
		
		fti2 = new FloatToInteger2(num2);
		
		System.out.println("내림: "+ fti1.floor());
		System.out.println("반올림: "+ fti1.round());
		System.out.println("올림: "+ fti1.ceil());
		System.out.println("====================================");
		System.out.println("내림: "+ fti2.floor());
		System.out.println("반올림: "+ fti2.round());
		System.out.println("올림: "+ fti2.ceil());
	}

}