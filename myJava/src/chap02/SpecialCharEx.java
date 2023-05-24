package chap02;

class SpecialCharEx {
	public static void main(String[] args) {
		System.out.println('\'');		     //  '''처럼 할 수 없다. -> \사용하여 '를 나타낼수있다
		System.out.println("abc\t123\b456"); // \b에 의해 3이 지워진다. -> eclipse에서 오류,명령창에서 잘작동됨
		System.out.println('\n');		     //  개행(new line)문자 출력하고 개행
		System.out.println("\"Hello\"");	 //  큰따옴표를 출력하려면 이렇게 한다.
		System.out.println("c:\\");          // \를 출력하기위해 \\ 사용
	}
}
