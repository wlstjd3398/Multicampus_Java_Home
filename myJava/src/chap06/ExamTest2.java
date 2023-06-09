package chap06;

import java.util.Scanner;

public class ExamTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		rockScissorPaper rsp;
		
		String intro = "\n\t[가위바위보 게임] \n"
				+ " \n"
				+ " \t 1. 가위 \n"
				+ " \t 2. 바위 \n"
				+ " \t 3. 보 \n"
				+ " \t >>>";
		
		System.out.print(intro);
		rsp = new rockScissorPaper(sc.nextInt());
		sc.close();
				
		System.out.printf("\n\t사용자 : %s, 컴퓨터 : %s \n", rsp.getUser(), rsp.getCom());
		System.out.printf("\t 가위바위보 결과 ==> %s\n", rsp.judge());
	}
}