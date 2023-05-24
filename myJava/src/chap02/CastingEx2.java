package chap02;

class CastingEx2 {
	public static void main(String[] args) {
		int  i = 10;
		byte b = (byte)i;
		System.out.printf("[int -> byte] i=%d -> b=%d%n", i, b); 
		
		i = 300;
		b = (byte)i;
		System.out.printf("[int -> byte] i=%d -> b=%d%n", i, b); // 2ÀÇ 8 -> 2ÀÇ 7 = 256 -> 44 

		b = 10;
		i = (int)b;
		System.out.printf("[byte -> int] b=%d -> i=%d%n", b, i); 

		b = -2;
		i = (int)b;
		System.out.printf("[byte -> int] b=%d -> i=%d%n", b, i); // 1111 -> -1, 1110 -> -2

		System.out.println("i="+Integer.toBinaryString(i));
	}
}
