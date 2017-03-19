package org.gvaireth.springangularintro.testing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class WordController {

	@Autowired
	private WordService service;

	@RequestMapping("/wordcount/{sentence}")
	public String countWords(@PathVariable String sentence) {
		return String.format("Sentence has %s words", service.countWords(sentence));
	}

}
