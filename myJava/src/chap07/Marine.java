package chap07;

public class Marine extends Unit{

	Marine(int x, int y){
		super(x, y);
	}
	
	void move(int x, int y) {
		System.out.println("������ " + x + ", " + y + " ��ġ�� �̵��մϴ�");
		this.x = x;
		this.y = y;
	}
	
	void stimpack() {
		System.out.println("������ ���� ���ݴϴ�");
	}
	
}