package chap07;

public class Ex20 {

	// 유닛의 모든 기능을 수행하는 메서드
	void play(Unit unit, int x, int y) {
		
		unit.move(x, y);
		
		if(unit instanceof Marine) {
			Marine marine = (Marine)unit;
			marine.stimpack();
		}else if(unit instanceof Tank){
			Tank tank = (Tank)unit;
			tank.changeMode();
		}else if(unit instanceof Dropship) {
			Dropship dropship = (Dropship)unit;
			dropship.load();
			dropship.unload();
		}
		
	}
	
	public static void main(String[] args) {
		Unit [] units = new Unit[4];
		
		units[0] = new Marine(10, 20);
		units[1] = new Tank(30, 40);
		units[2] = new Marine(20, 35);
		units[3] = new Dropship(60, 50);
		
		// play() 메서드를 이용해 모든 유닛을 사용하는 코드를 입력하세요
		
		Ex20 ex20 = new Ex20();
		
//		for(Unit unit : units) {
//			ex20.play(unit, 100, 100);
//		}
		
		ex20.play(units[0], 100, 200);
		ex20.play(units[1], 200, 300);
		ex20.play(units[2], 300, 400);
		ex20.play(units[3], 400, 500);
		
	}
}