package chap06;

public class Ex5 {

	public static void main(String[] args) {
		// noReturn() �޼��带 ȣ���Ͽ� �����ϴ� �ڵ带 �ۼ��ϼ���
		
		ReturnTest test = new ReturnTest();
		
		test.noReturn();
		test.return1();
		String returnValue = test.return2();
		
		System.out.println(returnValue);
		
		System.out.println();
		
		System.out.println("returnValue: " + test.return2());
	}

}
