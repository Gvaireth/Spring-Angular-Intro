package org.gvaireth.angularintro;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/start")
	public String helloWorld2(Model model) {
		model.addAttribute("status", "ok");
		System.out.println("front controller up");
		return "/index.html";
	}

}
