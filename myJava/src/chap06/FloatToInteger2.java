package chap06;

public class FloatToInteger2 {

	double num;
	
	FloatToInteger2(){
		
	}
	
	FloatToInteger2(double num){
		this.num = num;
	}
	
	 
	
	
	
	
	void setNum(double a) {
		num = a;
	}
	
	int floor() {
		return (int)num;
	}
	
	int round() {
		return (int)(num + 0.5);
	}
	
	int ceil() {
		int result = 0;
		if((int)num == num) {
			result = (int)num;
		}else {
			result = (int)(num + 1);
		}
		return result;
	}
	
}