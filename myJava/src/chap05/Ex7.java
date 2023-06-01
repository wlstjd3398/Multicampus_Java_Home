package chap05;

import java.util.Scanner;

/*
 * 사용자에게 3명의 학생에 대한 국어, 영어, 수학, 과학 점수를 입력 받아 1등인 학생의 성적과 총점, 평균을 출력하는 코드를 작성하세요
 * 단, 2차원 배열을 사용
 * 
 * 실행 예]
 * 1번째 학생 점수를 입력하세요 : ? ? ? ?
 * 2번째 학생 점수를 입력하세요 : ? ? ? ?
 * 3번째 학생 점수를 입력하세요 : ? ? ? ?
 * 
 * 1등 학생의 성적 : ? ? ? ?
 * 총점 : ?, 평균 : ?
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
//				// 더한 값을 1차원배열에 따라 구분
//				if() {
//					
//				}
//				// 1차원 배열에 따라 구분해서 더한 값을 비교
//				
//				// 그중에 총점이 가장 큰값이면 성적과 총점 출력, 평균 출력
//			}
//				
//				
//		}
//		
//		System.out.printf("총점 : %2d \n",  sum);
//		System.out.printf("평균 : %2d \n",  (double) sum / scores);
		
		
		Scanner sc = new Scanner(System.in);
		int [][] scores = new int[3][4];
		int total =0, firstIdx = 0, temp;
		
		for(int i=0; i<scores.length; i++) {
			System.out.printf("%d번째 학생의 국어, 영어, 수학, 과학 점수를 입력하세요 : ", i+1);
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
		System.out.print("\n 1등 학생의 성적 : ");
		for(int i=0; i< scores[firstIdx].length; i++) {
			System.out.printf("%2d ", scores[firstIdx][i]);
		}
		System.out.printf("\n 총점 : %d, 평균 : %.2f \n", total, (double)total / scores[firstIdx].length);
		
		
		
	}

}