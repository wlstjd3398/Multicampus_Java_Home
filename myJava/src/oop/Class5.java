package oop;

public class Class5 {

	String name; // �ʼ�
	String gender; // �ʼ�
	int age; // �ʼ� 
	String hobby; // ���� 
	
	Class5(){
	}
	
	Class5(String name, String gender, int age){
		this(name, gender, age, null);
	}
	
	Class5(String name, String gender, int age, String hobby){
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.hobby = hobby;
	}
	
	public String toString() {
		return this.name + " / " + this.gender + " / " + this.age + " / " + this.hobby;
	}
	
}