package chap07.terran;

public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tank tank = new Tank();
		Marine marine = new Marine();
		SCV scv = new SCV();
		
		scv.repair(tank);
		scv.repair(scv);
//		scv.repair(marine);
		
	}

}