package oop;

public class Date1 {

	int year, month, day, count;
	int [] monthLastDays;
	String [] days;
	
	int AllDays(int year, int count){
		for(int i=1; i<year; i++) {
			
			//윤년,평년 계산 알고리즘
			if((i % 4 == 0 && i % 100 != 0)||(i % 400 == 0)) {
				//윤년
				count += 366;
			}else {
				//평년
				count += 365;
			}
		}
		return count;
	}
	
	// 윤년 2월경우 +1일
	int [] LeapDays(int year, int [] monthLastDays) {
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			monthLastDays[2] = 29;
		}
		return monthLastDays;
	}
	
	// 월 일수 구하기 전
	int monthDays(int month, int count, int [] monthLastDays) {
		for(int i=1; i<month; i++) {
			count += monthLastDays[i];
		}
		return count;
	}
	
	
}