package exam2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import exam1.Greeter;

@Controller
public class GreeterController {
	private Greeter greeter;
	
	public GreeterController() {
	}
	
	public GreeterController(Greeter greeter) {
		this.greeter = greeter;
	}
	
	// get방식으로 요청이 들어왔을때 hello메서드가 자동으로 호출됨
	@GetMapping("/exam2/hello") // http://localhost:8080/myProject/exam2/hello?guest=손흥민
	public String hello(Model model, @RequestParam(value="guest", required=false) String guest) {
		
		String msg = greeter.greet(guest);
		model.addAttribute("msg", msg);
		
		
		return "hello";
	}
}