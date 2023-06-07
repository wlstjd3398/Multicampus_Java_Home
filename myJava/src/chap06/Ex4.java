package chap06;

public class Ex4 {// 클래스 블록

	public static void main(String[] args) {// main 메서드 블록
		// TODO Auto-generated method stub

		{// 익명의 블록
			int num = 1234;
			System.out.println("num: " + num);
			
		}// 밖의 빨간줄 블록 scope에 벗어남
		
//		System.out.println("num: " + num);
	}

}
