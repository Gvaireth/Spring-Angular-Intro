package org.gvaireth.springangularintro.testing;

import org.hamcrest.Matchers;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WordCounterTest {

	private WordCounter wordCouter;

	@Test
	public void testWordCounting() {
		Assert.assertThat(wordCouter.countWords("Hello world!"), Matchers.equalTo(2));
	}

	@Before
	public void setup() {
		wordCouter = new WordCounter();
	}

	@After
	public void teardown() {
		wordCouter = new WordCounter();
	}

}
