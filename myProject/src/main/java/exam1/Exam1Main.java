package exam1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Exam1Main {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppContext.class);
		
		Greeter g = context.getBean("greeter", Greeter.class); // (이름, 타입)
		// getBean을 사용할때마다 Bean을 새로 만드는 것은 아니다
		
		Greeter g1 = context.getBean("greeter", Greeter.class);
		Greeter g2 = context.getBean("greeter", Greeter.class);
		
		if(g1 == g2) {
			System.out.println("싱글톤 객체입니다.");
		}else {
			System.out.println("두 객체는 서로 다른 객체입니다.");
		}
		
//		String msg = g1.greet("손흥민");
//		System.out.println(msg);
		
		context.close(); // 사용이 끝났다면 container를 닫아주는게 좋음
		
	}

}