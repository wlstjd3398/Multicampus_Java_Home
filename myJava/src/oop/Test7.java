package oop;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class4 class4 = new Class4();
		
		System.out.println(class4.add(10, 20));
		System.out.println(class4.add(10.5, 20.5));
		
		//new int[]{}안에서 한번만 사용되고 버려짐 = 일회용 배열만들어서 사용하고 싶을때
		System.out.println(class4.add(new int [] {10, 20, 30, 40, 50}));
		
	}

}