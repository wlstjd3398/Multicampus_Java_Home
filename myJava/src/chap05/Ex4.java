package chap05;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] scores = {80, 75, 60, 85, 100 ,65};
		int minScore, maxScore;
		
		minScore = scores[0];
		maxScore = scores[0];
		
		for(int i=1; i<scores.length; i++) {
			if(minScore > scores[i]) {
				minScore = scores[i];
			}
			if(maxScore < scores[i]) {
				maxScore = scores[i];
			}
		}
		System.out.printf("최대점수 : %d, 최소점수 : %d\n", maxScore, minScore);
		
		
		
	}

}
