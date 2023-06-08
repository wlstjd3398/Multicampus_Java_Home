package chap06;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car1, car2, car3, car4;
		
		car1 = new Car();
		car2 = new Car("white");
		car3 = new Car("white", "manual");
		car4 = new Car("white", "manual", 3);
		
		
		System.out.println("[car1] " + car1.color + " : " + car1.gearType + " : " + car1.door);
		System.out.println("[car2] " + car2.color + " : " + car2.gearType + " : " + car2.door);
		System.out.println("[car3] " + car3.color + " : " + car3.gearType + " : " + car3.door);
		System.out.println("[car4] " + car4.color + " : " + car4.gearType + " : " + car4.door);

	
	}

}