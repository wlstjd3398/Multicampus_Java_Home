package oop;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child child = new Child();
		System.out.println("num1: " + child.num1);
		child.methodA();
		System.out.println("num2: " + child.num2);
		child.methodB();
		System.out.println("num3: " + child.other.num3);
		child.other.methodC();
	}

}