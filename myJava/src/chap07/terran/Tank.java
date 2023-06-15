package chap07.terran;

public class Tank extends GroundUnit implements Repairable{

	Tank(){
		super(150);
		this.hitPoint = this.MAX_HP;
	}
	
	// 어노테이션 : 여러가지 기능 중 컴파일러에게 힌트줌
	@Override
	public String toString() {
		return "Tank";
	}
	
}
