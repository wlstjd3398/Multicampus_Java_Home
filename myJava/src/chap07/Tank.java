package chap07;

public class Tank extends Unit{

	Tank(int x, int y){
		super(x, y);
	}
	
	void move(int x, int y) {
		System.out.println("��ũ�� " + x + ", " + y + " ��ġ�� �̵��մϴ�");
		this.x = x;
		this.y = y;
	}
	
	void changeMode() {
		System.out.println("��ũ�� �������� �����մϴ�");
	}
	
}