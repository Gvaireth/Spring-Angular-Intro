package org.gvaireth.springangularintro.web;

import org.gvaireth.springangularintro.Greeting;
import org.gvaireth.springangularintro.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@Autowired
	private GreetingService greetingService;

	@RequestMapping("/start")
	public ModelAndView helloWorld(Model model) {
		return new ModelAndView("/View.html");
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
