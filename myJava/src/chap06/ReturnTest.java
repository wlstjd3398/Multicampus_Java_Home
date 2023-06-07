package chap06;

public class ReturnTest {

	void noReturn() {
		System.out.println("첫 번째 문장");
		System.out.println("두 번째 문장");
		System.out.println("세 번째 문장");
	}
	
	void return1() {
		System.out.println("return1() 메서드 호출");
		
		return;
		
//		System.out.println("세 번째 문장");
	}
	
	String return2() {
		System.out.println("return2() 메서드 호출");
		
		return "호출결과";
//		System.out.println("세 번째 문장");
	}
}
