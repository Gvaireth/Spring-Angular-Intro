package org.gvaireth.springangularintro.testing;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;

@RunWith(DataProviderRunner.class)
public class WordCounterTest {

	private WordCounter wordCouter;

	@Test
	public void testWordCounting() {
		assertThat(wordCouter.countWords("Hello world!"), equalTo(2));
	}

	@Test
	@DataProvider({ "2,Hello world!", "1,hi" })
	public void testLetterCounting(int words, String sentence) {
		assertThat(wordCouter.countWords(sentence), equalTo(words));
	}

	@Test
	@DataProvider(value = { "3; one, two, three" }, splitBy = ";")
	public void testLetterCountingWithComas(int words, String sentence) {
		assertThat(wordCouter.countWords(sentence), equalTo(words));
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
