package chap04;

/*
 * 2�ܺ��� 9���� ��ü ������ ����� ���� ���� ���� ����ϴ� �ڵ带 �ۼ��ϼ���
 * ��, �ϳ��� for �ݺ����� ����մϴ�
 * 
 * ���� ��]
 * 2 * 1 = 2
 * 2 * 2 = 4
 * . . .
 * 3 * 1 = 3
 * 3 * 2 = 6
 * 3 * 3 = 9
 * . . .
 * 4 * 9 = 36
 * . . .
 * 9 * 9 = 81
 */

public class Gugudan2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int dan = 2, num =1;
//		
//		for(int i = 0; i < 72; i++) {
//			System.out.printf("%d * %d = %2d\n", dan, num, dan*num);
//			num++;
//			if(num == 10) {
//				dan++;
//				num = 1;
//			}
//		}
		
		
		//��ü �ݺ�Ƚ���� ��øfor ��������ʰ� �غ���
		int dan = 2, num;
		
		for(num = 1; num <= 9; num++) {
			System.out.printf("%d * %d = %2d\n", dan, num, dan*num);
			if(num == 9) {
				dan++;
				num = 1;
			}
			if(dan == 10) {
				break;
			}
		}
		
	}

}