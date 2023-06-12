package oop;

public class Class5 {

	String name; // 필수
	String gender; // 필수
	int age; // 필수 
	String hobby; // 선택 
	
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