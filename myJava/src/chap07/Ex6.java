package chap07;

import chap07.packageB.Child;

public class Ex6 {

	public static void main(String[] args) {
		// chap07.packageB.Child Ŭ������ �ν��Ͻ��� �����ϰ� result ���� ����ϴ� �ڵ带 �ۼ��ϼ���
		// ���� �ȵȴٸ� ������ �������� ã�� ���� �������� ������� �� ������ �ذ��ϼ���
		
		Child child = new Child(1, 2, 3, 4);
		
		System.out.println("result: " + child.getResult());
		
		
		
		
	}

}