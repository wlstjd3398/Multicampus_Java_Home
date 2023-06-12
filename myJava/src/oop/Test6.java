package oop;

public class Test6 {

	void callByValue(int num) {
		num *= 2;
		System.out.println("callByValue() num: " + num);
	}
	
	void callByReference(Time[] time2) {
		// Time Ŭ���� �迭�� �Է����� �޾� ��� Ÿ�� ��ü�� ���� 0�� 0�� 0�ʷ� �ʱ�ȭ�ϴ� �ڵ带 �ۼ��ϼ���
		System.out.println("callByReference[] time2: ");
		for(int i=0; i<time2.length; i++) {
			time2[i].hour = 0; time2[i].minute = 0; time2[i].second = 0;
			System.out.println(time2[i].getCurrentTime());
		}
		
		// enhanced for�� �迭�� ������ �ִ� ������ �ּҰ��� �ٲ����ʴ´�
		for(Time t1 : time2) {
			t1.hour = 0; t1.minute = 0; t1.second = 0;
			System.out.println(t1.getCurrentTime());
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 4;
		
		// callByValue(num) �� ȣ���ϴ� ������ �ۼ��ϼ���
		Test6 test6 = new Test6();
		
		System.out.println("callByValue() �޼��� ȣ�� ��] num: " + num);
		test6.callByValue(num);
		System.out.println("callByValue() �޼��� ȣ�� ��] num: " + num);
		
		// Time Ŭ���� �迭�� �Է����� callByReference() �޼��带 ȣ���ϴ� ������ �ۼ��غ�����
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
		
		System.out.println("callByReference() �޼��� ȣ�� ��] arr:");
		for(Time t1 : time2) {
			System.out.println(t1.getCurrentTime());
		}
		
		test6.callByReference(time2);
		
		System.out.println("callByReference() �޼��� ȣ�� ��] arr:");
		for(Time t1 : time2) {
			System.out.println(t1.getCurrentTime());
		}
	}

}