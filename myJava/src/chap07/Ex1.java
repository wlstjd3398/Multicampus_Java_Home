package chap07;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassB classB = new ClassB();
		
		// num1, num2, method1(),. method2() 모두의 값과 결과를 확인하세요
		System.out.println("num1: " + classB.classA.num1);
		System.out.println("num2: " + classB.num2);
		System.out.println("method1(): " + classB.classA.method1());
		System.out.println("method2(): " + classB.method2());
		
	}

}