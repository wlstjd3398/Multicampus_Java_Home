package chap06;

public class Tv {

	String color;
	boolean isPower;
	int channel;
	
	void power() {
		isPower = !isPower;
	}

	void channelUp() {
		channel++;
	}
	
	void channelDown() {
		channel--;
	}
	
}
