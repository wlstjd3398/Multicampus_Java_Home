package chap05;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int stuCount;
		int [] stuScores;
		int total=0;
		int maxScore=0;
		int minScore=0;
		
		System.out.print("�л� ���� �Է��ϼ��� : ");
		stuCount = sc.nextInt();
		
		stuScores = new int[stuCount];
		
		System.out.printf("%d���� �л����� ������ �Է��ϼ���\n",stuScores.length);
		for(int i=0; i<stuScores.length; i++) {
			stuScores[i] = sc.nextInt();
			total += stuScores[i];
		}
		
		System.out.println("\n[�Է��� �л��� ����]");
		
		for(int i=0; i<stuScores.length; i++) {
			System.out.print(stuScores[i] + " ");
			
		}
		
		System.out.printf("\n����: %d, ��� : %.2f \n", total, (double)total / stuScores.length);
		
		
		
		
		for(int i=0; i<stuScores.length; i++) {
			if(stuScores[i] > stuScores[i+1]) {
				maxScore = stuScores[i];
			}else {
				maxScore = stuScores[i+1];
			}
		}
		System.out.printf("\n�ְ����� : %d", maxScore);
		
		for(int i=0; i<stuScores.length; i++) {
			if(stuScores[i] < stuScores[i+1]) {
				minScore = stuScores[i];
			}else {
				minScore = stuScores[i+1];
			}
		}
		System.out.printf("\n�������� : %d", minScore);
		
		
//		System.out.printf("\n�ְ����� : %d, �������� : %d \n", min(), max());
	
		
		
	}

}
