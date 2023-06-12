package oop;

public class Test6 {

	void callByValue(int num) {
		num *= 2;
		System.out.println("callByValue() num: " + num);
	}
	
	void callByReference(Time[] time2) {
		// Time 클래스 배열을 입력으로 받아 모든 타임 객체의 값을 0시 0분 0초로 초기화하는 코드를 작성하세요
		System.out.println("callByReference[] time2: ");
		for(int i=0; i<time2.length; i++) {
			time2[i].hour = 0; time2[i].minute = 0; time2[i].second = 0;
			System.out.println(time2[i].getCurrentTime());
		}
		
		// enhanced for문 배열이 가지고 있는 원래의 주소값은 바뀌지않는다
		for(Time t1 : time2) {
			t1.hour = 0; t1.minute = 0; t1.second = 0;
			System.out.println(t1.getCurrentTime());
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 4;
		
		// callByValue(num) 을 호출하는 문장을 작성하세요
		Test6 test6 = new Test6();
		
		System.out.println("callByValue() 메서드 호출 전] num: " + num);
		test6.callByValue(num);
		System.out.println("callByValue() 메서드 호출 후] num: " + num);
		
		// Time 클래스 배열을 입력으로 callByReference() 메서드를 호출하는 문장을 작성해보세요
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
		
		System.out.println("callByReference() 메서드 호출 전] arr:");
		for(Time t1 : time2) {
			System.out.println(t1.getCurrentTime());
		}
		
		test6.callByReference(time2);
		
		System.out.println("callByReference() 메서드 호출 후] arr:");
		for(Time t1 : time2) {
			System.out.println(t1.getCurrentTime());
		}
	}

}