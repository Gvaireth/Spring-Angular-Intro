package org.gvaireth.springangularintro.testing;

import org.springframework.stereotype.Service;

@Service
public class WordCounter {

	public int countWords(String sentence) {
		return sentence.split(" ").length;
	}

}
