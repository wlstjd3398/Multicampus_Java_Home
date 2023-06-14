package chap07;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car [] cars = new Car[3];
		cars[0] = new Car();
		cars[1] = new FireEngine();
		cars[2] = new Ambulance();

		for(Car myCar : cars) {
			myCar.drive();
		}
	}
}