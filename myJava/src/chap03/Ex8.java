package chap03;

import java.util.Scanner;

//exam1. ����ڿ��� ����� ���� ������ �Է����� �޾� �� ���� ��� 80�� �̻��̸� true, �ƴϸ� false ���� ����ϴ� �ڵ带 �ۼ��ϼ���(if ���x)
//exam2. ����ڿ��� ����� ���� ������ �Է����� �޾� �� ���� �� �� �����̶� 80�� �̸��� ������ ������ true, �ƴϸ� false ���� ����ϴ� �ڵ带 �ۼ��ϼ���
//exam3. ����ڿ��� ����� ���� ������ �Է����� �޾� �� ���� ��� 80�� �̻��̸� true, �ƴϸ� false ���� ����ϴ� �ڵ带 �ۼ��ϼ���(if ���x)
//��, AND �����ڴ� ����� �� �����ϴ�.

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int math1, eng1;
		System.out.printf("����� ���� ������ �Է��ϼ��� >>");
		
		math1 = sc.nextInt();
		eng1 =sc.nextInt();
		
		boolean result1 = math1 >= 80 && eng1 >= 80;
		System.out.println("exam1 = " + result1);
		
		boolean result2 = math1 < 80 || eng1 < 80;
		System.out.println("exam2 = " + result2);
		
		boolean result3 = !(math1 < 80 || eng1 < 80);
		System.out.println("exam3 = " + result3);

		sc.close();
		
	}

}