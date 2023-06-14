package chap07;

public class Marine extends Unit{

	Marine(int x, int y){
		super(x, y);
	}
	
	void move(int x, int y) {
		System.out.println("마린이 " + x + ", " + y + " 위치로 이동합니다");
		this.x = x;
		this.y = y;
	}
	
	void stimpack() {
		System.out.println("마린이 미쳐 날뜁니다");
	}
	
}