package chap07.packageA;

public class Parent {

	private int num1;
	int num2;
	protected int num3;
	public int num4;
	
	public Parent(int num1, int num2, int num3, int num4){
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		this.num4 = num4;
	}
	
	
	protected int getNum1() {
		return this.num1;
	}
	
	public int getNum2() {
		return this.num2;
	}
	
	
	
}