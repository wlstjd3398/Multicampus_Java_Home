package chap06;

public class Ex7 {

	// 프로그램의 제목을 출력하는 메서드
	void printTitle() {
		System.out.println("\n\t 원의 넓이 계산 프로그램");
	}
	
	// 입력으로 주어진 문자를 count 만큼 출력하는 메서드
	void printCharacter(char ch, int count) {
		for(int i=0; i<count; i++) {
			System.out.print(ch);
		}
	}
	
	// pi 값을 반환하는 메서드
	double getPi() {
		double pi = 3.141592;
		
		return pi;
	}
	
	// 반지름을 입력으로 받아 원의 넓이를 계산하여 반환하는 메서드
	double getCircleArea(int radius) {
		
		double result;
		
		result = radius * radius * getPi();
		
		return result;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ex7 ex7 = new Ex7();
		
		int radius = 7;
		
		ex7.printCharacter('*', 40);
		ex7.printTitle();
		ex7.printCharacter('*', 40);
		
		System.out.printf("\n반지름이 %d인 원의 넓이는 %f입니다. \n", radius, ex7.getCircleArea(radius));
		
		
	}
}
