package chap05;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][][] arr64 = {{{}, {}, {}, {}}, {{}, {}, {}, {}}, {{}, {}, {}, {}},
				{{}, {}, {}, {}}, {{}, {}, {}, {}}, {{}, {}, {}, {}}};
	
	int [][] arr = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
	
	System.out.println("arr �迭�� ũ�� : " + arr.length);
	System.out.println("arr[0] �迭�� ũ�� : " + arr[0].length);
	System.out.println("arr[1] �迭�� ũ�� : " + arr[1].length);
	System.out.println("arr[2] �迭�� ũ�� : " + arr[2].length);
	
	for(int i=0; i<arr.length; i++) {
		for(int j=0; j<arr[i].length; j++) {
			System.out.printf("%2d ", arr[i][j]);
		}
		
		System.out.println();
	}
	}

}
