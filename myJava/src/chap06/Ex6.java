package chap06;

public class Ex6 {
	
	void noReturn() {
		System.out.println("ù ��° ����");
		System.out.println("�� ��° ����");
		System.out.println("�� ��° ����");
	}
	
	void return1() {
		System.out.println("return1() �޼��� ȣ��");
		
		return;
		
//		System.out.println("�� ��° ����");
	}
	
	String return2() {
		System.out.println("return2() �޼��� ȣ��");
		
		return "ȣ����";
//		System.out.println("�� ��° ����");
	}
	
	public static void main(String[] args) {
		// Ex5 ���� ����� ������ ����� ����ϴ� �ڵ带 �ۼ�
		
		Ex6 ex6 = new Ex6();
		ex6.noReturn();
		ex6.return1();
		
		System.out.print("return2: " + ex6.return2());

		
		
	}
}
