package chap07;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle3 circle = new Circle3(-5);
		System.out.println("area: " + circle.getArea());
		System.out.println("area: " + circle.getCircumference());
		
//		circle.radius = -5;
		circle.setRadius(-5);
		System.out.println("area: " + circle.getArea());
		System.out.println("area: " + circle.getCircumference());
		
	}

}