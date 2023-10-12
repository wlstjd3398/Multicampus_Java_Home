package exam1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Exam1Main {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppContext.class);
		
		Greeter g = context.getBean("greeter", Greeter.class); // (이름, 타입)
		
		String msg = g.greet("손흥민");
		System.out.println(msg);
		
		context.close(); // 사용이 끝났다면 container를 닫아주는게 좋음
		
	}

}
