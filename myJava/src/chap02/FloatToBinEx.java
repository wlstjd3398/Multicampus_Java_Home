package chap02;

class FloatToBinEx {
	public static void main(String args[]) {
		float f = -9.1234567f;
		int i = Float.floatToIntBits(f);

		System.out.printf("%f%n", f);
		System.out.printf("%X%n", i); // 16진수로 출력
		
		// 32 -> 01001100(f) -> 64 + 8 + 4 -> 76(i)
	} // main의 끝
}
