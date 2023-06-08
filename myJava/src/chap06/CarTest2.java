package chap06;

public class CarTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car2 car1, car2, car3, car4, car5;
		
		car1 = new Car2();
		car2 = new Car2("white");
		car3 = new Car2("white", "manual");
		car4 = new Car2("white", "manual", 3);
		car5 = new Car2(car4);
		
		
		System.out.println("[car1] " + car1.color + " : " + car1.gearType + " : " + car1.door);
		System.out.println("[car2] " + car2.color + " : " + car2.gearType + " : " + car2.door);
		System.out.println("[car3] " + car3.color + " : " + car3.gearType + " : " + car3.door);
		System.out.println("[car4] " + car4.color + " : " + car4.gearType + " : " + car4.door);
		System.out.println("[car5] " + car5.color + " : " + car5.gearType + " : " + car5.door);
		
		
	}

}