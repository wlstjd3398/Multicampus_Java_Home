package chap06;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle circle = new Circle();
		
		circle.pi = 3.141592;
		
		circle.setRadius(5);
		System.out.printf("�������� 5�� ���� ���̴� %.2f �Դϴ� \n", circle.getArea());
		
		circle.setRadius(7);
		System.out.printf("�������� 5�� ���� ���̴� %.2f �Դϴ� \n", circle.getArea());	
		
	}

}
