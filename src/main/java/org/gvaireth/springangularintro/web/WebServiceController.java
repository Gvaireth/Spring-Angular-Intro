package org.gvaireth.springangularintro.web;

import org.gvaireth.springangularintro.Greeting;
import org.gvaireth.springangularintro.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WebServiceController {

	@Autowired
	GreetingService service;

	@RequestMapping("/greeting")
	public Greeting getGreeting() {
		return new Greeting("Hello!");
	}

	@RequestMapping("/greetingwithparam")
	public Greeting getGreetingWithParam(
			@RequestParam(name = "name", required = false, defaultValue = "stranger") String someone) {
		return new Greeting("Hello " + someone + "!");
	}

	@RequestMapping("/greetingwithmodel")
	public Greeting getGreetingWithModel(@Validated GreetingParams model) {
		return service.getGreeting(model.getTitle(), model.getName(), model.getSurname());
	}

	@RequestMapping("/greetingwithpath/{title}/{name}/{surname}")
	public Greeting getGreetingWithPath(@PathVariable String title, @PathVariable String name,
			@PathVariable String surname) {
		return service.getGreeting(title, name, surname);
	}

	@RequestMapping(value = "/greetingwithpost", method = RequestMethod.POST)
	public Greeting getGreetingWithPost(@RequestBody GreetingParams body) {
		return service.getGreeting(body.getTitle(), body.getName(), body.getSurname());
	}
}
