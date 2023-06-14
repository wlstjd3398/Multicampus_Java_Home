package chap07;

 public abstract class Unit {

	int x, y;
	
	Unit(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	abstract void move(int x, int y);
	
	void stop() {
		System.out.println("ÇöÀç À¯´ÖÀÌ ¸ØÃä´Ï´Ù");
	}
	
}