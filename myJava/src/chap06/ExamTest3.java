package chap06;

import java.util.Scanner;

// �տ��� �ۼ��� ���������� ��ü�� �̿��Ͽ� ����ڰ� ���Ҷ����� ������������ �Ҽ� �ִ� �ڵ带 �ۼ��ϼ���

public class ExamTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		rockScissorPaper rsp = new rockScissorPaper();
		String input = "";
		String intro = "\n\t[���������� ����] \n"
				+ " \n"
				+ " \t 1. ���� \n"
				+ " \t 2. ���� \n"
				+ " \t 3. �� \n"
				+ " \t >>>";
		
		
		while(true) {
			rsp.setCom();
			
			System.out.print(intro);
			rsp.setUser(sc.nextInt());
			
			System.out.printf("\n\t����� : %s, ��ǻ�� : %s \n", rsp.getUser(), rsp.getCom());
			System.out.printf("\t ���������� ��� ==> %s\n", rsp.judge());
			
			sc.nextLine();
			System.out.print("\n\t �����Ͻ÷��� 'q'�� �Է��ϼ��� : ");
			input = sc.nextLine();
			
			if(input.length() == 1 && (input.charAt(0) == 'q' ||input.charAt(0) == 'Q')) {
				break;
			}
		}
		sc.close();
		System.out.printf("\n\t �̿����ּż� �����մϴ� ... ������ �ٽ� ������~ \n");
	}
}