package chap07;

public class Dropship extends Unit{

	Dropship(int x, int y){
		super(x, y);
	}
	
	void move(int x, int y) {
		System.out.println("수송선이 " + x + ", " + y + " 위치로 이동합니다");
		this.x = x;
		this.y = y;
	}
	
	void load() {
		System.out.println("수송선이 병력을 태워요");
	}

	void unload() {
		System.out.println("수송선이 병력을 내려요");
	}
	
}