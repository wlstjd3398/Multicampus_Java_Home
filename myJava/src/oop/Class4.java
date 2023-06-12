package oop;

public class Class4 {

	int add(int a, int b) {
		return a + b;
	}
	
	double add(double a, double b) {
		return a + b;
	}
	
	int add(int [] arr) {
		int result = 0;
		
		for(int num : arr) {
			result += num;
		}
		return result;
	}
	
}