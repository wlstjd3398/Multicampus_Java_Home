package chap06;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FloatToInteger2 fti1, fti2;
		double num1 = 3.6, num2 = 3.4;
		
		fti1 = new FloatToInteger2();
		fti1.setNum(num1);
		
		fti2 = new FloatToInteger2(num2);
		
		System.out.println("����: "+ fti1.floor());
		System.out.println("�ݿø�: "+ fti1.round());
		System.out.println("�ø�: "+ fti1.ceil());
		System.out.println("====================================");
		System.out.println("����: "+ fti2.floor());
		System.out.println("�ݿø�: "+ fti2.round());
		System.out.println("�ø�: "+ fti2.ceil());
	}

}