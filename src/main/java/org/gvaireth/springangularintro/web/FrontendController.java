package org.gvaireth.springangularintro.web;

import org.gvaireth.springangularintro.Greeting;
import org.gvaireth.springangularintro.Info;
import org.gvaireth.springangularintro.service.GreetingService;
import org.gvaireth.springangularintro.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FrontendController {

	@Autowired
	private GreetingService greetingService;

	@Autowired
	// @Qualifier("prod")
	private InfoService infoService;

	// @Autowired
	// @Qualifier("dev")
	public void setInfoService(InfoService infoService) {
		this.infoService = infoService;
	}

	// @Autowired
	// public MainController(InfoService infoService) {
	// this.infoService = infoService;
	// }

	@RequestMapping("/start")
	public ModelAndView helloWorld(Model model) {
		return new ModelAndView("/View.html");
	}

	@RequestMapping("/admin")
	public ModelAndView admin(Model model) {
		return new ModelAndView("/Admin.html");
	}

	@RequestMapping("/user")
	public ModelAndView user(Model model) {
		return new ModelAndView("/User.html");
	}

	@RequestMapping("/login")
	public ModelAndView login(Model model) {
		return new ModelAndView("/Login.html");
	}

	@RequestMapping(value = "/getInfo/")
	public ResponseEntity<Info> getInfo() {
		Info info = infoService.getInfo();
		return new ResponseEntity<>(info, HttpStatus.OK);
	}

	@RequestMapping(value = "/getGreetings/{name}")
	public ResponseEntity<Greeting> getGreetings(@PathVariable String name) {
		Greeting greetings = greetingService.getGreeting(name);
		serverTiredAndWillSleepNow();
		return new ResponseEntity<>(greetings, HttpStatus.OK);
	}

	private void serverTiredAndWillSleepNow() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}
}
