package chap06;

public class Car2 {

	String color;
	String gearType;
	int door;
	
	Car2(){
		this("black", "auto", 4);
		System.out.println("ù ��° ������");
	}
	
	Car2(String color){
		this(color, "auto", 4);
		System.out.println("�� ��° ������");
	}
	
	Car2(String color, String gearType){
		this(color, gearType, 4);
		System.out.println("�� ��° ������");
	}
	
	Car2(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		System.out.println("�� ��° ������");
	}
	
	Car2(Car2 car2){
		this.color = car2.color;
		this.gearType = car2.gearType;
		this.door = car2.door;
		System.out.println("�ټ� ��° ������");
	}
	
}