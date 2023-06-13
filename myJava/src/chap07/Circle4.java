package chap07;

public class Circle4 {

	static final double PI = 3.141592;
	int radius;
	
	Circle4(int radius) throws Exception{
		this.setRadius(radius);
	}
	
	void setRadius(int radius) throws Exception{
		if(radius > 0) {
			this.radius = radius;
		}else {
			throw new Exception("잘못된 원의 반지름입니다");
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