package chap06;

import java.util.Scanner;

public class ExamTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		rockScissorPaper rsp;
		
		String intro = "\n\t[���������� ����] \n"
				+ " \n"
				+ " \t 1. ���� \n"
				+ " \t 2. ���� \n"
				+ " \t 3. �� \n"
				+ " \t >>>";
		
		System.out.print(intro);
		rsp = new rockScissorPaper(sc.nextInt());
		sc.close();
				
		System.out.printf("\n\t����� : %s, ��ǻ�� : %s \n", rsp.getUser(), rsp.getCom());
		System.out.printf("\t ���������� ��� ==> %s\n", rsp.judge());
	}
}