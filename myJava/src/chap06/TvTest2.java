package chap06;

public class TvTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t1, t2;
		t1 = new Tv();
		t2 = new Tv();
		
		System.out.println("[Tv1] color : " + t1.color);
		System.out.println("[Tv1] isPower : " + t1.isPower);
		System.out.println("[Tv1] channel : " + t1.channel);
		System.out.println();
		
		System.out.println("[Tv2] color : " + t2.color);
		System.out.println("[Tv2] isPower : " + t2.isPower);
		System.out.println("[Tv2] channel : " + t2.channel);
		System.out.println();
		
		System.out.println("t1 : "+ t1 + ", t2 : " + t2);
		System.out.println("===============================");
		
		t2 = t1;
		
		t1.power();
		t2.color = "검은색";
		t1.channelUp();
		t2.channelUp();
		t1.channelUp();
		
		System.out.println("[Tv1] color : " + t1.color);
		System.out.println("[Tv1] isPower : " + t1.isPower);
		System.out.println("[Tv1] channel : " + t1.channel);
		System.out.println();
		
		System.out.println("[Tv2] color : " + t2.color);
		System.out.println("[Tv2] isPower : " + t2.isPower);
		System.out.println("[Tv2] channel : " + t2.channel);
		System.out.println();
		
		System.out.println("t1 : "+ t1 + ", t2 : " + t2);
	}

}
