package chap07;

public class Circle2 {

	static final double PI = 3.141592;
	int radius;
	
	Circle2(int radius){
		if(radius > 0) {
			this.radius = radius;
		}else {
			this.radius = 1;
		}
	}

	double getCircumference() {
		return this.radius * 2 * Circle2.PI;
	}
	
	double getArea() {
		return this.radius * this.radius * Circle2.PI;
	}
}