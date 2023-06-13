package chap07;

public class Circle {

	static final double PI = 3.141592;
//	static final double PI; // static final 변수는 반드시 선언과 동시에 초기화 해주어야한다
	final int radius;
	
	static {
//		Circle.PI = 3.141592;
	}
	
	Circle(int radius){
		this.radius = radius;
	}
	
	double getArea() {
		final double result;
		result = this.radius * this.radius * Circle.PI;
		
		return result;
	}
	
}