package org.gvaireth.angularintro;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

	@RequestMapping(value = "/getGreetings/{name}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Greeting> getGreetings(@PathVariable String name) {
		System.out.println("/getGreetings name=" + name);

		Greeting greetings = new Greeting("Hello " + name + "!");
		return new ResponseEntity<>(greetings, HttpStatus.OK);
	}

}
