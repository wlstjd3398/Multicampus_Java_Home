package chap04;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1���� 100 ������ ��� Ȧ���� ���� ���Ͽ� �� ����� ����ϴ� �ڵ带 �ۼ��ϼ���
		
		
		int i, total = 0;
		
		for(i = 1; i<=100; i++) {
			if(i % 2 != 0) {
				total += i;
			}
		}
		System.out.println("1���� 100 ������ Ȧ���� ���� " + total + "�Դϴ�");
		
		
//		int total = 0;
//		for(int i = 1; i <= 100; i += 2) {
//			total += i;
//		}
//		
//		System.out.println("1���� 100 ������ Ȧ���� ���� " + total + "�Դϴ�");
		
	}

}