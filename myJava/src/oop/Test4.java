package oop;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("classVar: " + Class2.classVar);
		Class2.classVar = 1000;
		System.out.println("classVar: " + Class2.classVar);	
		
		System.out.println("-------------------------------------");
		
		Class2 c1,c2;
		c1 = new Class2();
		c2 = new Class2();
		System.out.println("c1.instanceVar: " + c1.instanceVar);
		System.out.println("c2.instanceVar: " + c2.instanceVar);
		
		c1.instanceVar = 1234;
		c2.instanceVar = 5678;
		System.out.println("c1.instanceVar: " + c1.instanceVar);
		System.out.println("c2.instanceVar: " + c2.instanceVar);
		
		System.out.println("-------------------------------------");
		
		System.out.println("c1.classVar: " + c1.classVar);	
		System.out.println("c2.classVar: " + c2.classVar);	
		
		c1.methodA();
		
		
		
	}

}