package chap06;

public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Time t1, t2, t3;
//		t1 = new Time();
//		t2 = new Time();
//		t3 = new Time();
//		
//		t1.setHour(14);
//		t1.setMinute(30);
//		t1.setSecond(25);
//
//		t2.setHour(15);
//		t2.setMinute(40);
//		t2.setSecond(35);
//		
//		t3.setHour(16);
//		t3.setMinute(50);
//		t3.setSecond(45);
//		
//		System.out.println("time1 = " + t1.CurrentTime());
//		System.out.println("time2 = " + t2.CurrentTime());
//		System.out.println("time3 = " + t3.CurrentTime());
		
		
		Time[] timeArr;
		timeArr = new Time[3];
		
		timeArr[0] = new Time();
		timeArr[1] = new Time();
		timeArr[2] = new Time();
		
		timeArr[0].setHour(14);
		timeArr[0].setMinute(30);
		timeArr[0].setSecond(25);

		timeArr[1].setHour(15);
		timeArr[1].setMinute(40);
		timeArr[1].setSecond(35);
		
		timeArr[2].setHour(16);
		timeArr[2].setMinute(50);
		timeArr[2].setSecond(45);
		
		for(int i=0; i<timeArr.length; i++) {
			System.out.printf("time%d %s \n", i+1, timeArr[i].CurrentTime());
		}
	}

}
