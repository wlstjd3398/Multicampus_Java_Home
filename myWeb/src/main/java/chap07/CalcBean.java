package chap07;

public class CalcBean {

	private int num1;
	private String operation;
	private int num2;
	
	public CalcBean() {
		this.operation = "";
	}
	
	public void setNum1(int num1){
		this.num1 = num1;
	}
	
	public int getNum1() {
		return this.num1;
	}
	
	public void setOperation(String operation){
		this.operation = operation;
	}
	
	public String getOperation() {
		return this.operation;
	}
	
	public void setNum2(int num2){
		this.num2 = num2;
	}
	
	public int getNum2() {
		return this.num2;
	}
	
	public int calculate() {
		int result = 0;
		
		if(operation.equals("+")){
			result = this.num1 + this.num2;
		}else if(operation.equals("-")){
			result = this.num1 - this.num2;
		}else if(operation.equals("*")){
			result = this.num1 * this.num2;
		}else if(operation.equals("/")){
			result = this.num1 / this.num2;
		}
		
		return result;
	}
	
}
