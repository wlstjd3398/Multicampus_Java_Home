package chap06;

public class ReturnTest {

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
}
