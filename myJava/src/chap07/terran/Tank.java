package chap07.terran;

public class Tank extends GroundUnit implements Repairable{

	Tank(){
		super(150);
		this.hitPoint = this.MAX_HP;
	}
	
	// ������̼� : �������� ��� �� �����Ϸ����� ��Ʈ��
	@Override
	public String toString() {
		return "Tank";
	}
	
}
