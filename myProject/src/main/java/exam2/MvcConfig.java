package exam2;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class MvcConfig implements WebMvcConfigurer {

	// 메서드는 DefaultServletHandlerConfigurer 객체를 인자로 받아 기본 서블릿 핸들링을 구성합니다. 
	// 이 메서드를 호출하여 정적 리소스(예: CSS, JavaScript, 이미지)를 처리할 때 기본 서블릿을 활용하도록 설정
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
	
	//  메서드를 사용하여 뷰 리졸버(View Resolver)를 구성하는 부분입니다. 
	// 뷰 리졸버는 컨트롤러가 생성한 모델 데이터를 실제 화면으로 변환하는 역할을 합니다.
	// 주로 JSP 파일과 같은 뷰 템플릿을 해석하고 렌더링하는 데 사용
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		registry.jsp("/WEB-INF/views/exam2/", ".jsp");
	}
}
