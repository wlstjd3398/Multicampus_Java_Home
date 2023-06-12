package oop;

public class Class6 {

	static int classVar;
	int instanceVar;
	
	static {
		Class6.classVar = 1234;
	}
	
	Class6(int instanceVar){
		this.instanceVar = instanceVar;
	}
	
	
}