package chap06;

public class Circle4 {

//	static double pi = 3.14;
	static double pi;
	int radius;
	
	// static블록, 초기화블록이라고부름
	static {
		Circle4.pi = 3.141592;
	}
	
	Circle4(){
//		Circle4.pi = 3.141592;
	}
	
	static void setPi(double pi) {
		Circle4.pi = pi;
	}
	
	void setRadius(int rad) {
		radius = rad;
	}
	
	double getArea() {
		double area;
		area = radius * radius * Circle4.pi;
		
		return area;
	}
	
}