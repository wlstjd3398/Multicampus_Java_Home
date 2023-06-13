package chap07;

//public final class Parent2 {
public class Parent2 {
	
	String name;
	
	Parent2(String name){
		this.name = name;
		System.out.println("Parent 클래스");
	}
	
//	final void methodA() {
	void methodA() {
		System.out.println("Parent 클래스 methodA()");
	}
}