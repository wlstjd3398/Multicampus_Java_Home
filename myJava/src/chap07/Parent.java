package chap07;

public class Parent {

	String name;
	
	Parent(String name){
		this.name = name;
		System.out.println("Parent 인스턴스 생성");
	}
	
	void methodA() {
		System.out.println("Parent 클래스의 methodA()");
	}
}