package oop;

public class Date1 {

    private int[] monthLastDays = {-1, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private String[] days = {"일", "월", "화", "수", "목", "금", "토"};

    private int getAllDays(int year) {
        int count = 0;
        for (int i = 1; i < year; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
                count += 366; // 윤년일 경우 366일 추가
            } else {
                count += 365; // 평년일 경우 365일 추가
            }
        }
        return count;
    }

    private int[] getLeapDays(int year, int[] monthLastDays) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            monthLastDays[2] = 29; // 윤년일 경우 2월의 일 수를 29로 변경
        }
        return monthLastDays;
    }

    private int getMonthDays(int month, int[] monthLastDays) {
        int count = 0;
        for (int i = 1; i < month; i++) {
            count += monthLastDays[i]; // 입력된 월 이전의 월들의 일 수를 더함
        }
        return count;
    }

    public String getDayOfWeek(int year, int month, int day) {
        int count = getAllDays(year); // 년도에 해당하는 일 수를 계산하여 count에 저장
        monthLastDays = getLeapDays(year, monthLastDays); // 윤년 여부에 따라 월별 일 수를 업데이트
        count += getMonthDays(month, monthLastDays); // 입력된 월 이전의 일 수를 계산하여 count에 더함
        count += day; // 입력된 일 수를 count에 더함
        int dayOfWeekIndex = count % 7; // 요일을 나타내는 인덱스를 계산
        return days[dayOfWeekIndex]; // 요일을 반환
    }
}