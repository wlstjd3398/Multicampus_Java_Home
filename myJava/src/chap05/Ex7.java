package chap05;

import java.util.Scanner;

/*
 * ����ڿ��� 3���� �л��� ���� ����, ����, ����, ���� ������ �Է� �޾� 1���� �л��� ������ ����, ����� ����ϴ� �ڵ带 �ۼ��ϼ���
 * ��, 2���� �迭�� ���
 * 
 * ���� ��]
 * 1��° �л� ������ �Է��ϼ��� : ? ? ? ?
 * 2��° �л� ������ �Է��ϼ��� : ? ? ? ?
 * 3��° �л� ������ �Է��ϼ��� : ? ? ? ?
 * 
 * 1�� �л��� ���� : ? ? ? ?
 * ���� : ?, ��� : ?
 */

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int [][] scores = {{70, 80, 90, 100}, {70, 70, 70, 70}, {80, 80, 80, 80}};
//		
//		int sum=0;
//		
//		for(int i=0; i<scores.length; i++) {
//			for(int j=0; j<scores.length; j++) {
//					
//				sum += scores[i][j];
//				
//				// ���� ���� 1�����迭�� ���� ����
//				if() {
//					
//				}
//				// 1���� �迭�� ���� �����ؼ� ���� ���� ��
//				
//				// ���߿� ������ ���� ū���̸� ������ ���� ���, ��� ���
//			}
//				
//				
//		}
//		
//		System.out.printf("���� : %2d \n",  sum);
//		System.out.printf("��� : %2d \n",  (double) sum / scores);
		
		
		Scanner sc = new Scanner(System.in);
		int [][] scores = new int[3][4];
		int total =0, firstIdx = 0, temp;
		
		for(int i=0; i<scores.length; i++) {
			System.out.printf("%d��° �л��� ����, ����, ����, ���� ������ �Է��ϼ��� : ", i+1);
			temp=0;
			for(int j=0; j<scores[i].length; j++) {
				scores[i][j] = sc.nextInt();
				temp += scores[i][j];
			}
			
			if(temp > total) {
				total = temp;
				firstIdx = i;
			}
		}
		sc.close();
		System.out.print("\n 1�� �л��� ���� : ");
		for(int i=0; i< scores[firstIdx].length; i++) {
			System.out.printf("%2d ", scores[firstIdx][i]);
		}
		System.out.printf("\n ���� : %d, ��� : %.2f \n", total, (double)total / scores[firstIdx].length);
		
		
		
	}

}