package chap07;

public class Tank extends Unit{

	Tank(int x, int y){
		super(x, y);
	}
	
	void move(int x, int y) {
		System.out.println("탱크가 " + x + ", " + y + " 위치로 이동합니다");
		this.x = x;
		this.y = y;
	}
	
	void changeMode() {
		System.out.println("탱크가 공성모드로 변경합니다");
	}
	
}