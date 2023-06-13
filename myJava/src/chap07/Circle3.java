package chap07;

public class Circle3 {

	static final double PI = 3.141592;
	int radius;
	
	Circle3(int radius){
		this.setRadius(radius);
	}
	
	void setRadius(int radius) {
		if(radius > 0) {
			this.radius = radius;
		}else {
			this.radius = 1;
		}
	}

	int getRadius() {
		return this.radius;
	}
	
	double getCircumference() {
		return this.radius * 2 * Circle2.PI;
	}
	
	double getArea() {
		return this.radius * this.radius * Circle2.PI;
	}
}