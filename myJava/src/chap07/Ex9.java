package chap07;

public class Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle4 circle = null;
		
		try {
			circle = new Circle4(5);
			System.out.println("area: " + circle.getArea());
			System.out.println("circumference: " + circle.getCircumference());
			
			circle.setRadius(-7);
			System.out.println("area: " + circle.getArea());
			System.out.println("circumference: " + circle.getCircumference());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}