package chap02;

import java.util.Scanner;    // Scanner�� ����ϱ� ���� �߰�

class ScannerEx { 
	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in);

		int math, eng;
		
		System.out.print("���ڸ� ������ �ϳ� �Է����ּ���.-> ");

		math = scanner.nextInt();
		eng = scanner.nextInt();
		
//		String input = scanner.nextLine(); nextline ���ϰ����� ������ ����ϴ� ���� �ƴ�
//		int num = Integer.parseInt(input); // Integer ������ ��üȭ, parseInt �Է¹��� ���ڿ��� ���ڷ� ��ȯ
//		System.out.printf("�Է³��� : %s \n"+input);
		
		System.out.printf("�������� : %d, �������� : %d", math, eng);
		
		scanner.close();
	} 
}
