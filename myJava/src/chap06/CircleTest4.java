package chap06;

public class CircleTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle3 c1, c2;
		
		Circle3.setPi(3.14);
		
		c1 = new Circle3();
		c2 = new Circle3();
		
		c1.setRadius(5);
		c2.setRadius(7);
		System.out.printf("�������� %d�� ���� ���̴� %f�Դϴ� \n", c1.radius, c1.getArea());
		System.out.printf("�������� %d�� ���� ���̴� %f�Դϴ� \n\n", c2.radius, c2.getArea());
		
		Circle3.setPi(3.141592);
		System.out.printf("�������� %d�� ���� ���̴� %f�Դϴ� \n", c1.radius, c1.getArea());
		System.out.printf("�������� %d�� ���� ���̴� %f�Դϴ� \n", c2.radius, c2.getArea());
		
		
	}

}