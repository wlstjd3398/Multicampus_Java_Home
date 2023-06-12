package oop;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class5 c1, c2, c3;
		c1 = new Class5();
		c2 = new Class5("¼ÕÈï¹Î", "male", 31);
		c3 = new Class5("·ùÇöÁø", "male", 37, "µ¶¼­");
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		
	}

}