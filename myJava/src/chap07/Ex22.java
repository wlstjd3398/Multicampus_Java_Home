package chap07;

public class Ex22 implements YourInterface{

	public void abstractMethod() {
		System.out.println("abstractMethod()");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Ex22 ex22 = new Ex22();
		
		// 레퍼런스로 접근가능하지만 권장하지않음
//		System.out.println("num: " + ex22.num);
//		System.out.println("num: " + YourInterface.num);
		
		// staticMethod는 레퍼런스로 접근 불가능
//		ex22.staticMethod();

		
		// defaultMethod는 레퍼런스로 접근가능
//		ex22.defaultMethod();
		
		// abstractMethod는 레퍼런스로 접근가능
//		ex22.abstractMethod();
		
		
		
		// 레퍼런스를 staticMethod에 담아도 가능하다
		YourInterface your = new Ex22();
		
		// 권장하지 않음
		System.out.println("num: " + your.num);
		
		
		System.out.println("num: " + YourInterface.num);
		YourInterface.staticMethod();
		
		your.defaultMethod();
		your.abstractMethod();
		
	}

}