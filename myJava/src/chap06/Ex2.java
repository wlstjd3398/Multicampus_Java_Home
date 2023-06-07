package chap06;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Time[] timeArr;
		timeArr = new Time[3];
		
		for(int i=0; i<timeArr.length; i++) {
			timeArr[i] = new Time();
		}
		
		// 향상된 for문으로 수정
//		for(Time time: timeArr) {
//			time = new Time();
//		}
		
		
		timeArr[0].setHour(14);
		timeArr[0].setMinute(30);
		timeArr[0].setSecond(25);

		timeArr[1].setHour(15);
		timeArr[1].setMinute(40);
		timeArr[1].setSecond(35);
		
		timeArr[2].setHour(16);
		timeArr[2].setMinute(50);
		timeArr[2].setSecond(45);
		
//		for(int i=0; i<timeArr.length; i++) {
//			System.out.printf("time%d %s \n", i+1, timeArr[i].CurrentTime());
//		}
		
		int i=0;
		for(Time time: timeArr) {
			System.out.printf("time%d %s \n", i+1, timeArr[i].CurrentTime());
			i++;
		}
		
	}

}
