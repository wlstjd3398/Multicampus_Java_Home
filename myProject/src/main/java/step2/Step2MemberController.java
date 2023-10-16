package step2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import model.MemberDAO;
import model.MemberDO;

/*
step1Controller처럼
요청방식과 요청경로를 결정해야함(분석/설계에서 각화면의 기능도 포함)
command를 사용해서 == null || equals("list")을 사용했었음

1) list는 get방식으로 들어오는게 맞음 경로는 /step2/list
(서버니까 /myProject를 사용할 필요가 없다)
-> memberList.jsp 이동함

command파라미터를 사용하지 않는 이유는 각각 사용하는 요청주소가 달라서

2) post방식 /step2/insert -> insert 작업 후에 memberList.jsp보여줌

3) get방식 /step2/modify -> 선택한 사용자 정보와 함께 memberModify.jsp
post지정한것과 ajax방식이 아니라면 get이라고 보면 된다

4) post방식 /step2/changePasswd -> 비밀번호 변경 후 memberList.jsp
5) post방식 /step2/changeGrade -> 등급 변경 후 memberList.jsp

6) post방식 /step2/deleteMember -> 회원 삭제 후 memberList.jsp
 */

@Controller
public class Step2MemberController {

	private MemberDAO memberDAO;
	
	public Step2MemberController() {
		
	}
	
	public Step2MemberController(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}
	
	// String 타입은 view이름을 뜻함, request storage로 사용할 Model을 사용
	@GetMapping("/step2/list")
	public String list(Model model) {
		model.addAttribute("memberList", memberDAO.getAllMembers());
		
		return "memberList";
	}
	
	// 사용자 입력값을 가진 파라미터를 전처럼 @RequestParam을 사용하기에는 번거로움
	// memberDO객체를 한번에 지정해서 사용자 입력값을 memberDO로 합침 -> @ModelAttribute 사용
	// spring에서 관습적으로 command객체로 사용
	
	// step1Controller에서 request.setAttribute("msg", e.getMessage());했던것처럼 사용하기위해서
	// Model model를 매개변수로 사용
	@PostMapping("/step2/insert")
	public String insert(@ModelAttribute MemberDO command, Model model) {
		String viewName = "";
		
		try {
			// int rowCount = memberDAO.insertMember(command);는 사용안할 거라 뺌
			memberDAO.insertMember(command);
			viewName = "redirect:/step2/list";
			
		}catch(Exception e) {
			model.addAttribute("msg", e.getMessage());
			model.addAttribute("memberList", memberDAO.getAllMembers());
			
			viewName = "memberList";
		}
		
		// model.addAttribute("memberList", memberDAO.getAllMembers());
		// return "memberList"; 여기서는 서버 내부적인 페이지 이동인 forward로 사용됨
		
		// 브라우저에서 페이지이동인 redirect방식으로 코드를 줄이는게 가능하지만
		// 기존의 요청이 사라지기에 viewName으로 redirect 먼저 실행 후 msg를 추가하고 forward로 진행
		return viewName;
	}
	
	// id파라미터를 가져오기위해서 @RequestParam을 사용
	@GetMapping("/step2/modify")
	public String modify(@RequestParam("id") String id, Model model) {
		model.addAttribute("member", memberDAO.getMember(id));
		
		return "memberModify";
	}
	
	
	// changePasswd, changeGrade, deleteMember는 memberModify에서 발생한 방식
	@PostMapping("/step2/changePasswd")
	public String changePasswd(@ModelAttribute MemberDO command) {
		memberDAO.changePasswd(command);
			
		return "redirect:/step2/list";
	}
	
	@PostMapping("/step2/changeGrade")
	public String changeGrade(@ModelAttribute MemberDO command) {
		memberDAO.changeGrade(command);
			
		return "redirect:/step2/list";
	}
	
	// deleteMember를 사용하는데 id만 받아오면 가능
	@PostMapping("/step2/deleteMember")
	public String deleteMember(@RequestParam("id") String id) {
		memberDAO.deleteMember(id);
		
		return "redirect:/step2/list";
	}
	
}