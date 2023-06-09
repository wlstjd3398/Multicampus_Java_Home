package chap07;

public class Child extends Parent{

	String gender;
	
	
	Child(String name, String gender){
		super(name);
		this.gender = gender;
		System.out.println("Child 인스턴스 생성");
	}
	
	void methodA() {
		super.methodA();
		System.out.println("Child 클래스의 methodA()");
	}
}