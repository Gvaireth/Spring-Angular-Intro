package org.gvaireth.springangularintro.web;

import org.gvaireth.springangularintro.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WebServiceController {

	@RequestMapping("/greeting")
	public Greeting getGreeting() {
		return new Greeting("Hello!");
	}

}
