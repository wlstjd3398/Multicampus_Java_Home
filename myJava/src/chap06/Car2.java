package chap06;

public class Car2 {

	String color;
	String gearType;
	int door;
	
	Car2(){
		this("black", "auto", 4);
		System.out.println("첫 번째 생성자");
	}
	
	Car2(String color){
		this(color, "auto", 4);
		System.out.println("두 번째 생성자");
	}
	
	Car2(String color, String gearType){
		this(color, gearType, 4);
		System.out.println("세 번째 생성자");
	}
	
	Car2(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		System.out.println("네 번째 생성자");
	}
	
	Car2(Car2 car2){
		this.color = car2.color;
		this.gearType = car2.gearType;
		this.door = car2.door;
		System.out.println("다섯 번째 생성자");
	}
	
}