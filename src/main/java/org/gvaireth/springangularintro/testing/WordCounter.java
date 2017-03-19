package org.gvaireth.springangularintro.testing;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class WordCounter {

	public int countWords(String sentence) {
		return sentence != null ? sentence.split(" ").length : 0;
	}

	public List<Integer> countLetters(String sentence) {
		List<Integer> result = new ArrayList<>();
		if (sentence != null) {
			String[] words = sentence.split(" ");
			for (String word : words) {
				result.add(word.length());
			}
		}
		return result;
	}

}
