package chap02;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name;
		int math_score;
		
		Scanner sc = new Scanner(System.in);
		// system.in Ű����κ��� �Է¹޴´�
		// system.out ����ͷ� �����
		System.out.println("�̸��� �Է��ϼ���. ");
		name = sc.next();
		
		System.out.println("���� ������ �Է��ϼ���. ");
		math_score = sc.nextInt();
		
		System.out.println("�̸� = "+name+", ���� ���� = "+math_score);
		
		sc.close();
		// sc�� ��������� ���������
		
	}

}
