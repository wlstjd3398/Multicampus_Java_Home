package chap04;

public class Ex18 {

	public static void main(String[] args) {
		// 1���� 100 ������ ¦���� ���� ���ϴ� �ڵ带 �ۼ��ϼ���
		// ��, continue�� ����մϴ�

		int total = 0;
		
//		for(int i = 1; i<=100; i++) {
//			if(i % 2 != 0) {
//				continue;
//			}
//			total += i;
//		}
//		System.out.println("total = " + total);
		
		int i = 1;
		while(i<=100) {
			if(i % 2 != 0) {
				i++;
				continue;
			}
			total += i;
			i++;
		}
		System.out.println("total = " + total);
		
	}

}