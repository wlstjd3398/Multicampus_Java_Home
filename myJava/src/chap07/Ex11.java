package chap07;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car myCar = new Car();
		FireEngine fire = new FireEngine();
		Ambulance ambulance = new Ambulance();
		
		myCar.drive();
		
		myCar = fire;
		myCar.drive();
	
		myCar = ambulance;
		myCar.drive();
	}
}