package chap07;

public class Child2 extends Parent2{

	String gender;
	
	Child2(String name, String gender){
		super(name);
		this.gender = gender;
		System.out.println("Child2 Ŭ����");
	}
	
	void methodA() {
		super.methodA();
		System.out.println("Child Ŭ���� methodA()");
	}
}