package chap06;

import java.util.Scanner;

/*
 * ����ڿ��� �ϳ��� �Ǽ��� �Է� �޾� ������ ����� ����ϴ� �ڵ带 �ۼ��ϼ���
 * ��, ��ü���������� �ڵ带 �ۼ��մϴ�
 * 
 * ������1]
 * �ϳ��� �Ǽ��� �Է��ϼ��� : 3.64
 * ����: 3
 * �ݿø�: 4
 * �ø�: 4
 * 
 * ������2]
 * �ϳ��� �Ǽ��� �Է��ϼ��� : 6.2364
 * ����: 6
 * �ݿø�: 6
 * �ø�: 7
 * 
 * ������3]
 * �ϳ��� �Ǽ��� �Է��ϼ��� : 4.0
 * ����: 4
 * �ݿø�: 4
 * �ø�: 4
 */

public class Exam1 {
	
	void printExam(char ch, int count) {
		for(int i=0; i<count; i++) {
			System.out.print(ch);
		}
		System.out.print("\n\t�ϳ��� �Ǽ��� �Է��ϼ���: ");
	}
	
	int printUnder(double num) {
		return (int)num;
	}
	
	int printMiddle(double num) {
		return (int)(num + 0.5);
	}
	
	int printUpper(double num) {
		if(num == (int)num) {
			return (int)num;
		}else {
			return (int)(num + 1);
		}
	}

}
