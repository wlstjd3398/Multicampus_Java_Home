package chap04;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �Ʒ��� ��ø for �ݺ����� ��ø do-while �ݺ������� ��ȯ�ϴ� �ڵ带 �ۼ��ϼ���
	 	
		int dan = 2, col = 0;
		
		do{
			do {
			if(col == 0) {
				System.out.printf(" [ %d �� ]\t", dan);
				}else {
					System.out.printf("%d * %d = %2d\t",dan, col, dan*col);
				}
			}while(dan<=9);
			dan++;
			System.out.println();
		} while(col<=9);
		col++;
		
//		int dan, col;
//		
//		for(col = 0; col <= 9; col++) {
//			for(dan = 2; dan <= 9; dan++) {
//				if(col == 0) {
//					System.out.printf(" [ %d �� ]\t", dan);
//				}else {
//					System.out.printf("%d * %d = %2d\t",dan, col, dan*col);
//				}
//				
//			}
//			System.out.println("");
//		}
		
	}

}