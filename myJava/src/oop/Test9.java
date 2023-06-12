package oop;

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Class6.classVar);
		
		Class6 c1, c2;
		c1 = new Class6(5678);
		c2 = new Class6(3579);
		System.out.println(c1.instanceVar);
		System.out.println(c2.instanceVar);
	}

}