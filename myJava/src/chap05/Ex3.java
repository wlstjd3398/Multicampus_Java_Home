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
		
		System.out.print("학생 수를 입력하세요 : ");
		stuCount = sc.nextInt();
		
		stuScores = new int[stuCount];
		
		System.out.printf("%d명의 학생들의 점수를 입력하세요\n",stuScores.length);
		for(int i=0; i<stuScores.length; i++) {
			stuScores[i] = sc.nextInt();
			total += stuScores[i];
		}
		
		System.out.println("\n[입력한 학생의 점수]");
		
		for(int i=0; i<stuScores.length; i++) {
			System.out.print(stuScores[i] + " ");
			
		}
		
		System.out.printf("\n총점: %d, 평균 : %.2f \n", total, (double)total / stuScores.length);
		
		
		
		
		for(int i=0; i<stuScores.length; i++) {
			if(stuScores[i] > stuScores[i+1]) {
				maxScore = stuScores[i];
			}else {
				maxScore = stuScores[i+1];
			}
		}
		System.out.printf("\n최고점수 : %d", maxScore);
		
		for(int i=0; i<stuScores.length; i++) {
			if(stuScores[i] < stuScores[i+1]) {
				minScore = stuScores[i];
			}else {
				minScore = stuScores[i+1];
			}
		}
		System.out.printf("\n최저점수 : %d", minScore);
		
		
//		System.out.printf("\n최고점수 : %d, 최저점수 : %d \n", min(), max());
	
		
		
	}

}
