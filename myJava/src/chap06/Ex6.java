package chap06;

public class Ex6 {
	
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
	
	public static void main(String[] args) {
		// Ex5 실행 결과와 동일한 결과를 출력하는 코드를 작성
		
		Ex6 ex6 = new Ex6();
		ex6.noReturn();
		ex6.return1();
		
		System.out.print("return2: " + ex6.return2());

		
		
	}
}
