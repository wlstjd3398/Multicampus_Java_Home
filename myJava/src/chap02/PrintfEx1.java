package chap02;

class PrintfEx1 {
	public static void main(String[] args) {
		byte  b = 1;
		short s = 2;
		char  c = 'A';

		int  finger = 10; 
		long big = 100_000_000_000L;       
		long hex = 0xFFFF_FFFF_FFFF_FFFFL ;  // long hex = 0xFFFFFFFFFFFFFFFFL;

		int octNum = 010;       // 8���� 10, 10�����δ� 8
		int hexNum = 0x10;      // 16���� 10, 10�����δ� 16
		int binNum = 0b10;      // 2���� 10, 10�����δ� 2

		System.out.printf("b=%d%n", b); // 10������, ����
		System.out.printf("s=%d%n", s); 
		System.out.printf("c=%c, %d %n", c, (int)c); // ���Ϲ���, 10������, ����
		
		System.out.printf("finger=[%5d]%n",  finger); // �ڸ����ټ��ڸ�10���� [___10]
		System.out.printf("finger=[%-5d]%n", finger); // �ڸ����ټ��ڸ�10���� [10___]
		System.out.printf("finger=[%05d]%n", finger); // �ڸ����ټ��ڸ�10���� [___10] -> ������ �ڸ��� 0���� ä�� -> [00010]
		System.out.printf("big=%d%n", big); 
		
		System.out.printf("hex=%#x%n", hex); // '#'�� ���λ�(16���� 0x, 8���� 0) %x 16����, %#x 16������ 0x���, 
		System.out.printf("octNum=%#o, %d%n", octNum, octNum);   // 8������, 10����
		System.out.printf("hexNum=%x, %d%n", hexNum, hexNum);  // 16������, 10����
		System.out.printf("binNum=0b%s, %d%n", Integer.toBinaryString(binNum), binNum); // %s ���ڿ�, 10����
		
		
		
		
		
	}
}