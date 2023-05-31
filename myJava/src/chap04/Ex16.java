package chap04;

public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0; i<100; i++) {
			System.out.println("i : " + i);
			
			if(i == 3) {
				break;
			}
			
			for(int j = 0; i < 100; j++) {
				System.out.println("\t j: " + j);
				
				if(j==2) {
					break;
				}
			
			}
			
			
		}
		
		
		
	}

}