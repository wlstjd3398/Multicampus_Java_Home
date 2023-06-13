package chap07.packageB;

import chap07.packageA.Parent;

public class Child extends Parent {

	int result;
	
	public Child(int num1, int num2, int num3, int num4){
		super(num1, num2, num3, num4);
	}
	
	public int getResult() {
		//num1ดย private, num2ดย default
		this.result = this.num3 + this.num4;
		this.result += this.getNum1();
		this.result += this.getNum2();
		
		return this.result;
	}
	
}