package chap07;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle5 c1, c2, c3, c4;
		
		c1 = Circle5.getCircle5(3);
		System.out.println("area: " + c1.getArea());
		System.out.println("circumference: " + c1.getCircumference());
		
		c2 = Circle5.getCircle5(4);
		System.out.println("area: " + c2.getArea());
		System.out.println("circumference: " + c2.getCircumference());
		
		c3 = Circle5.getCircle5(5);
		System.out.println("area: " + c3.getArea());
		System.out.println("circumference: " + c3.getCircumference());
		
		c4 = Circle5.getCircle5(6);
		System.out.println("area: " + c4.getArea());
		System.out.println("circumference: " + c4.getCircumference());
		
		System.out.println("================================================");
		System.out.println("c1 == c2:" + (c1 == c2));
		System.out.println("c2 == c3:" + (c2 == c3));
		System.out.println("c3 == c4:" + (c3 == c4));
	}
}