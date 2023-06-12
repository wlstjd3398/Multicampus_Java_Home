package oop;

public class Child4 extends Parent3{

	int num2;
	
	Child4(int num1, int num2){
		super(num1);
		this.num2 = num2;
		System.out.println("Child3 클래스의 인스턴스 생성");
	}
}