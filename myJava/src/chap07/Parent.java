package chap07;

public class Parent {

	String name;
	
	Parent(String name){
		this.name = name;
		System.out.println("Parent �ν��Ͻ� ����");
	}
	
	void methodA() {
		System.out.println("Parent Ŭ������ methodA()");
	}
}