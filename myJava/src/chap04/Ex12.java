package chap04;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �Ʒ��� ��ø for �ݺ����� ��ø while �ݺ������� ��ȯ�ϴ� �ڵ带 �ۼ��ϼ���
	 	
		int col = 0;
		
		while(col<=9) {
			int dan = 2;
			
			while(dan<=9) {
				if(col == 0) {
					System.out.printf(" [ %d �� ] \t", dan);
				}else {
					System.out.printf("%d * %d = %2d\t", dan, col, dan*col);
				}
				dan++;
			}
			System.out.println();
			col++;
		}
		
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