package chap04;

public class Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1부터 100 사이의 값 중 홀수의 합과 짝수의 합을 동시에 구하여 그 결과를 출력하는 코드를 작성하세요
		
		int evenTotal = 0, oddTotal = 0;
		
		for(int even = 2, odd = 1; even<=100 && odd<=100; even += 2,odd += 2) {
			evenTotal += even;
			oddTotal += odd;
		}
		
		
		System.out.println("1부터 100 사이의 값 중 홀수의 합 = " + evenTotal);
		System.out.println("1부터 100 사이의 값 중 짝수의 합 = " + oddTotal );
		
	}

}