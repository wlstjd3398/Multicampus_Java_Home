package chap07;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car myCar = new Car();
		
		try {
			FireEngine fire = (FireEngine)myCar;
			fire.drive();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}