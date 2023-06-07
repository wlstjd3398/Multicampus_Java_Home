package chap06;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int [] lotto = new int[6];
//		
//		lotto[0] = 7;
//		lotto[1] = 12;
//		lotto[2] = 19;
//		lotto[3] = 25;
//		lotto[4] = 33;
//		lotto[5] = 40;
//		
//		for(int num : lotto) {
//			System.out.print(num + " ");
//		}
		
//		for(int i=0; i<lotto.length; i++) {
//			System.out.print(lotto[i] + " ");
//		}
		
		// 향상된 for 문을 사용하여 모든 과일을 출력하는 코드를 작성하세요
		String [] fruits = {"사과" ,"딸기", "바나나", "복숭아", "포도"};
		
		for(String market : fruits) {
			System.out.print(market + " ");
		}
		
		
		
	}

}
