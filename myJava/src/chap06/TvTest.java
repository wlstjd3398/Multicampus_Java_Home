package chap06;

public class TvTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Tv t= new Tv();
		
		System.out.println("color : " + t.color);
		System.out.println("isPower : " + t.isPower);
		System.out.println("channel : " + t.channel);
		System.out.println();
		
		t.power();
		t.color = "°ËÀº»ö";
		t.channelUp();
		t.channelUp();
		t.channelUp();

		System.out.println("color : " + t.color);
		System.out.println("isPower : " + t.isPower);
		System.out.println("channel : " + t.channel);
		
	}

}
