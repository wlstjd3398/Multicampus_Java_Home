package oop;

public class Date1 {

	int year, month, day, count;
	int [] monthLastDays;
	String [] days;
	
	int AllDays(int year, int count){
		for(int i=1; i<year; i++) {
			
			//����,��� ��� �˰���
			if((i % 4 == 0 && i % 100 != 0)||(i % 400 == 0)) {
				//����
				count += 366;
			}else {
				//���
				count += 365;
			}
		}
		return count;
	}
	
	// ���� 2����� +1��
	int [] LeapDays(int year, int [] monthLastDays) {
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			monthLastDays[2] = 29;
		}
		return monthLastDays;
	}
	
	// �� �ϼ� ���ϱ� ��
	int monthDays(int month, int count, int [] monthLastDays) {
		for(int i=1; i<month; i++) {
			count += monthLastDays[i];
		}
		return count;
	}
	
	
}