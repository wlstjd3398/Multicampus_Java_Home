package chap02;

class SpecialCharEx {
	public static void main(String[] args) {
		System.out.println('\'');		     //  '''ó�� �� �� ����. -> \����Ͽ� '�� ��Ÿ�����ִ�
		System.out.println("abc\t123\b456"); // \b�� ���� 3�� ��������. -> eclipse���� ����,���â���� ���۵���
		System.out.println('\n');		     //  ����(new line)���� ����ϰ� ����
		System.out.println("\"Hello\"");	 //  ū����ǥ�� ����Ϸ��� �̷��� �Ѵ�.
		System.out.println("c:\\");          // \�� ����ϱ����� \\ ���
	}
}
