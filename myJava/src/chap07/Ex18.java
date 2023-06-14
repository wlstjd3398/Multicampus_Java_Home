package chap07;

public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car [] cars = new Car[3];
		cars[0] = new Car();
		cars[1] = new FireEngine();
		cars[2] = new Ambulance();

		for(Car myCar : cars) {
			myCar.drive();
			
			// 소방차이면 물을 뿌리고 구급차이면 사이렌을 울리는 코드를 작성하세요
			if(myCar instanceof FireEngine) {
				FireEngine fire = (FireEngine)myCar;
				fire.water();
				
			}else if(myCar instanceof Ambulance) {
				Ambulance ambulance = (Ambulance)myCar;
				ambulance.siren();
			}
			
			myCar.stop();
			System.out.println();
		}
		
	}

}