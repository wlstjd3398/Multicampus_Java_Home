package chap07;

public class Ex22 implements YourInterface{

	public void abstractMethod() {
		System.out.println("abstractMethod()");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Ex22 ex22 = new Ex22();
		
		// ���۷����� ���ٰ��������� ������������
//		System.out.println("num: " + ex22.num);
//		System.out.println("num: " + YourInterface.num);
		
		// staticMethod�� ���۷����� ���� �Ұ���
//		ex22.staticMethod();

		
		// defaultMethod�� ���۷����� ���ٰ���
//		ex22.defaultMethod();
		
		// abstractMethod�� ���۷����� ���ٰ���
//		ex22.abstractMethod();
		
		
		
		// ���۷����� staticMethod�� ��Ƶ� �����ϴ�
		YourInterface your = new Ex22();
		
		// �������� ����
		System.out.println("num: " + your.num);
		
		
		System.out.println("num: " + YourInterface.num);
		YourInterface.staticMethod();
		
		your.defaultMethod();
		your.abstractMethod();
		
	}

}