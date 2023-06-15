package chap07.terran;

public class SCV extends GroundUnit implements Repairable{

	SCV(){
		super(60);
		this.hitPoint = this.MAX_HP;
	}
	
	// 수리 가능한 유닛을 매개변수로 가져옴 
	void repair(Repairable r) {
		if(r instanceof Unit) {
			Unit u = (Unit) r;
			
			while(u.hitPoint != u.MAX_HP) {
				u.hitPoint++;
			}
		}
	}
}
