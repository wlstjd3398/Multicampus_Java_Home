package chap07;


// 다음의 배열을 이용하여 중복되지 않는 로또번호 6개를 생성하여 크기 순서대로 출력하는 코드를 작성하세요
// 단, 객체지향적으로 코드를 작성하여야합니다
// int [] lotto = new int[6];
// 바로 하기는 어려우니 코드를 먼저 짜고 객체지향적으로 봐라

public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyLotto lotto = new MyLotto();
		
		System.out.println("로또번호: " + lotto);
		
	}

}