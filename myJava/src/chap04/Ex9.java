package chap04;

public class Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1���� 100 ������ �� �� Ȧ���� �հ� ¦���� ���� ���ÿ� ���Ͽ� �� ����� ����ϴ� �ڵ带 �ۼ��ϼ���
		
		int evenTotal = 0, oddTotal = 0;
		
		for(int even = 2, odd = 1; even<=100 && odd<=100; even += 2,odd += 2) {
			evenTotal += even;
			oddTotal += odd;
		}
		
		
		System.out.println("1���� 100 ������ �� �� Ȧ���� �� = " + evenTotal);
		System.out.println("1���� 100 ������ �� �� ¦���� �� = " + oddTotal );
		
	}

}