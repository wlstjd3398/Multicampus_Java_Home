package chap05;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [] arr1 = {'0', '1', '2', '3','4'};
		char [] arr2 = {'A', 'B', 'C', 'D','E'};
		
		System.arraycopy(arr1, 1, arr2, 2, 2);
		
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}

}
