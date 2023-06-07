package chap06;

public class Ex5 {

	public static void main(String[] args) {
		// noReturn() 메서드를 호출하여 실행하는 코드를 작성하세요
		
		ReturnTest test = new ReturnTest();
		
		test.noReturn();
		test.return1();
		String returnValue = test.return2();
		
		System.out.println(returnValue);
		
		System.out.println();
		
		System.out.println("returnValue: " + test.return2());
	}

}
