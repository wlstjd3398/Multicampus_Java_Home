package chap06;

public class Ex8 {

	void changeParam(int num) {
		num *= 2;
		System.out.println("[changeParam()] num: " + num);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ex8 ex8 = new Ex8();
		
		int num = 1234;
		
		System.out.println("[�޼��� ȣ�� ��] num: " + num);
		
		// changeParam() �޼��� ȣ��
		ex8.changeParam(num);
		
		System.out.println("[�޼��� ȣ�� ��] num: " + num);
		
	}

}