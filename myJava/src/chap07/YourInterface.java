package chap07;

public interface YourInterface {

	// static final »ó¼ö
	int num = 1234;
	
	// staticMethod
	static void staticMethod() {
		System.out.println("staticMethod()");
	}
	
	// defaultMethod
	default void defaultMethod() {
		System.out.println("defaultMethod()");
	}
	
	// abstractMethod
	void abstractMethod();
}