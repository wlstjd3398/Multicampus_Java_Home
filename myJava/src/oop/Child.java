package oop;

public class Child extends Parent{

	int num2;
	Other other;
	
	Child(){
		num2 = 200;
		other = new Other();
	}
	
	void methodB() {
		System.out.println("methodB()");
	}
	
}