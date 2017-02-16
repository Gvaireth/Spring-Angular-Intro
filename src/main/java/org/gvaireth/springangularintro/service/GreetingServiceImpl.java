package org.gvaireth.springangularintro.service;

import org.gvaireth.springangularintro.Greeting;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

	public Greeting getGreeting(String name) {
		return new Greeting("Hello " + name + "!");
	}

}
