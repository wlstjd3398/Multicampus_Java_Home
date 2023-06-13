package chap07;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle2 circle = new Circle2(-5);
		System.out.println("area: " + circle.getArea());
		System.out.println("area: " + circle.getCircumference());
		
		circle.radius = -5;
		System.out.println("area: " + circle.getArea());
		System.out.println("area: " + circle.getCircumference());
	}

}