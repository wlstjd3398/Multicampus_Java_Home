package chap02;

class PrintfEx1 {
	public static void main(String[] args) {
		byte  b = 1;
		short s = 2;
		char  c = 'A';

		int  finger = 10; 
		long big = 100_000_000_000L;       
		long hex = 0xFFFF_FFFF_FFFF_FFFFL ;  // long hex = 0xFFFFFFFFFFFFFFFFL;

		int octNum = 010;       // 8진수 10, 10진수로는 8
		int hexNum = 0x10;      // 16진수 10, 10진수로는 16
		int binNum = 0b10;      // 2진수 10, 10진수로는 2

		System.out.printf("b=%d%n", b); // 10진정수, 개행
		System.out.printf("s=%d%n", s); 
		System.out.printf("c=%c, %d %n", c, (int)c); // 단일문자, 10진정수, 개행
		
		System.out.printf("finger=[%5d]%n",  finger); // 자리수다섯자리10정수 [___10]
		System.out.printf("finger=[%-5d]%n", finger); // 자리수다섯자리10정수 [10___]
		System.out.printf("finger=[%05d]%n", finger); // 자리수다섯자리10정수 [___10] -> 부족한 자리를 0으로 채움 -> [00010]
		System.out.printf("big=%d%n", big); 
		
		System.out.printf("hex=%#x%n", hex); // '#'은 접두사(16진수 0x, 8진수 0) %x 16진수, %#x 16진수앞 0x사용, 
		System.out.printf("octNum=%#o, %d%n", octNum, octNum);   // 8진정수, 10진수
		System.out.printf("hexNum=%x, %d%n", hexNum, hexNum);  // 16진정수, 10진수
		System.out.printf("binNum=0b%s, %d%n", Integer.toBinaryString(binNum), binNum); // %s 문자열, 10진수
		
		
		
		
		
	}
}