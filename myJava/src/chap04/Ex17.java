package chap04;

public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int total = 0, i =1;
		
//		while(true) {
//			total += i;
//			
//			if(total>1000) {
//				break;
//			}
//			i++;
//		}

		
		for(;;i++) {
			total += i;
			
			if(total>1000) {
				break;
			}
		}
		
		
		System.out.printf("1���� %d������ ���� %d�Դϴ�", i, total);
	}

}