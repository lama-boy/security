package test.prj.securityPrj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
	
	
	@GetMapping("/")
	public String home() {
		System.out.println("asdfasfdasdf");
		return "home";
	}

	@PostMapping("/join")
	public String joinProcess(){
		return "ok";
	}
}
