package oop;

public class Date1 {

    private int[] monthLastDays = {-1, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private String[] days = {"��", "��", "ȭ", "��", "��", "��", "��"};

    private int getAllDays(int year) {
        int count = 0;
        for (int i = 1; i < year; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
                count += 366; // ������ ��� 366�� �߰�
            } else {
                count += 365; // ����� ��� 365�� �߰�
            }
        }
        return count;
    }

    private int[] getLeapDays(int year, int[] monthLastDays) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            monthLastDays[2] = 29; // ������ ��� 2���� �� ���� 29�� ����
        }
        return monthLastDays;
    }

    private int getMonthDays(int month, int[] monthLastDays) {
        int count = 0;
        for (int i = 1; i < month; i++) {
            count += monthLastDays[i]; // �Էµ� �� ������ ������ �� ���� ����
        }
        return count;
    }

    public String getDayOfWeek(int year, int month, int day) {
        int count = getAllDays(year); // �⵵�� �ش��ϴ� �� ���� ����Ͽ� count�� ����
        monthLastDays = getLeapDays(year, monthLastDays); // ���� ���ο� ���� ���� �� ���� ������Ʈ
        count += getMonthDays(month, monthLastDays); // �Էµ� �� ������ �� ���� ����Ͽ� count�� ����
        count += day; // �Էµ� �� ���� count�� ����
        int dayOfWeekIndex = count % 7; // ������ ��Ÿ���� �ε����� ���
        return days[dayOfWeekIndex]; // ������ ��ȯ
    }
}