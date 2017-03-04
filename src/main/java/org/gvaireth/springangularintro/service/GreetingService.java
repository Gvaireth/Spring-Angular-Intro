package org.gvaireth.springangularintro.service;

import org.gvaireth.springangularintro.Greeting;

public interface GreetingService {
	Greeting getGreeting(String name);

	Greeting getGreeting(String title, String name, String surname);
}
