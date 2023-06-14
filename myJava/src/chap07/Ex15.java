package chap07;

public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car myCar = new FireEngine();
		myCar.drive();
		myCar.stop();
//		myCar.water();
		
		FireEngine fire = (FireEngine) myCar;
		fire.water();
	}
}