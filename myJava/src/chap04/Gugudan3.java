package chap04;

/*
 * 2�ܺ��� 9���� ��ü ������ ����� ���� ���� ���� ����ϴ� �ڵ带 �ۼ��ϼ���
 * ��, �ϳ��� for �ݺ����� ����մϴ�
 * 
 * ���� ��]
 * [ 2 �� ]
 * 2 * 1 = 2
 * 2 * 2 = 4
 * . . .
 * 2 * 9 = 18
 * 
 * [ 3 �� ]
 * 3 * 1 = 3
 * 3 * 2 = 6
 * 3 * 3 = 9
 * . . .
 * 4 * 9 = 36
 * . . .
 * 9 * 9 = 81
 */

public class Gugudan3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dan = 2, num =1;
		
		for(int i = 0; i < 72; i++) {
			if(i % 9 == 0) {
				System.out.println(" [ " + dan + " �� ]");
			}
			
			
//			if(num == 1) {
//				System.out.printf("\n [ %d �� ]\n", dan);
//			}
			
			System.out.printf("%d * %d = %2d\n", dan, num, dan*num);
			num++;
			if(num == 10) {
				dan++;
				num = 1;
				System.out.println("");
			}
		}
		
		
		
		
		
		
	}

}