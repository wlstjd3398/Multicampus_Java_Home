package oop;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class4 class4 = new Class4();
		
		System.out.println(class4.add(10, 20));
		System.out.println(class4.add(10.5, 20.5));
		
		//new int[]{}�ȿ��� �ѹ��� ���ǰ� ������ = ��ȸ�� �迭���� ����ϰ� ������
		System.out.println(class4.add(new int [] {10, 20, 30, 40, 50}));
		
	}

}