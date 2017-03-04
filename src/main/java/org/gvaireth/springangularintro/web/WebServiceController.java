package org.gvaireth.springangularintro.web;

import org.gvaireth.springangularintro.Greeting;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WebServiceController {

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
		return new Greeting("Hello " + model.getTitle() + " " + model.getName() + " " + model.getSurname() + "!");
	}

	@RequestMapping("/greetingwithpath/{title}/{name}/{surname}")
	public Greeting getGreetingWithPath(@PathVariable String title, @PathVariable String name,
			@PathVariable String surname) {
		return new Greeting("Hello " + title + " " + name + " " + surname + "!");
	}
}
