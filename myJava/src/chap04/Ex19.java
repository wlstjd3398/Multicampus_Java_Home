package chap04;

public class Ex19 {

	public static void main(String[] args) {
		// 1���� 100 ������ ���� 5050�Դϴ�
		// �׷��ٸ� 1���� ������� ���� ���ʷ� 1000�� �ʰ��ϴ� ���ϱ��?
		// �� ����� ����Ͽ� ����ϴ� �ڵ带 �ۼ��ϼ���
		
		int i = 1, total = 0;
		
		
		while(total <= 1000) {
			total += i;
			
			if(total > 1000) {
				continue;
			}
			i++;
		}
		System.out.printf("1���� %d������ ���� %d�Դϴ�", i, total);
		
		
//		for(i = 0; i <= 45; i++) {
//			total += i;
//		}
//		
//		System.out.printf("1���� %d������ ���� %d�Դϴ�", i, total);
//		 System.out.printf("total : %d", total);
		 
		 
	}

}