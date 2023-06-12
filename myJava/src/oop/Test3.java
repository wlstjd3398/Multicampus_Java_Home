package oop;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = new int[5];
//		Time [] time = new Time[5];
//		time[0] = new Time();
//		time[1] = new Time();
//		time[2] = new Time();
//		time[3] = new Time();
//		time[4] = new Time();
		
		
		Time [] time2 = {new Time(), new Time(), new Time(), new Time(), new Time()}; 
		
		time2[0].hour = 1;
		time2[0].minute = 2;
		time2[0].second = 3;

		time2[1].hour = 4;
		time2[1].minute = 5;
		time2[1].second = 6;
		
		time2[2].hour = 7;
		time2[2].minute = 8;
		time2[2].second = 9;
		
		time2[3].hour = 10;
		time2[3].minute = 11;
		time2[3].second = 12;
		
		time2[4].hour = 13;
		time2[4].minute = 14;
		time2[4].second = 15;
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
//		for(int i=0; i<time.length; i++) {
//			System.out.println(time[i]);
//		}
//		
		for(Time t1 : time2) {
			System.out.println(t1);
		}
		
		for(Time t1 : time2) {
			System.out.println(t1.getCurrentTime());
		}
		
	
		
	}

}