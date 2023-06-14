package chap07;

public class Ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent3 p1, p2;
		
		p1 = new Parent3();
		p2 = new Child3();
		
		System.out.println("p1.num: " + p1.num);
		p1.methodA();
		
		System.out.println("p2.num: " + p2.num);
		p2.methodA();
		
		
	}

}