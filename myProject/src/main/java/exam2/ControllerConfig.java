package exam2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import exam1.Greeter;

@Configuration
public class ControllerConfig {
	
	@Bean
	public Greeter greeter() {
		Greeter g = new Greeter();
		g.setFomat("%s님의 방문을 환영합니다.");
		
		return g;
	}
	
	@Bean
	// 컨트롤러 만들면서 greeter Bean을 반환하는 메서드로 greeter를 반환
	public GreeterController greeterController() {
		return new GreeterController(this.greeter());
	}
}