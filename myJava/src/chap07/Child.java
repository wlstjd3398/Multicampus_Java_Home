package chap07;

public class Child extends Parent{

	String gender;
	
	
	Child(String name, String gender){
		super(name);
		this.gender = gender;
		System.out.println("Child �ν��Ͻ� ����");
	}
	
	void methodA() {
		super.methodA();
		System.out.println("Child Ŭ������ methodA()");
	}
}