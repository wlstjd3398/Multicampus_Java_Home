package chap07;

public class ClassB {

	int num2;
	ClassA classA;
	
	ClassB(){
		this.num2 = 20;
		classA = new ClassA();
	}

	String method2() {
		return "ClassB method2() ";
	}
	
}