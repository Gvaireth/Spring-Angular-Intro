package org.gvaireth.springangularintro.testing;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;

@RunWith(DataProviderRunner.class)
public class WordCounterTest {

	private WordCounter wordCounter;

	@Test
	public void testWordCounting() {
		assertEquals(2, wordCounter.countWords("Hello world!"));
	}

	@Test
	public void testLetterCounting() {
		List<Integer> result = wordCounter.countLetters("Counting letters in words");
		assertThat(result, hasSize(4));
		assertThat(result, contains(8, 7, 2, 5));
		assertThat(result, hasItem(7));
		assertThat(result.get(0), equalTo(8));
	}

	@Test
	@DataProvider({ "2,Hello world!", "1,hi" })
	public void testWordCountingWithData(int words, String sentence) {
		assertEquals(words, wordCounter.countWords(sentence));
	}

	@Test
	@DataProvider(value = { "3; one, two, three" }, splitBy = ";")
	public void testLetterCountingWithComas(int words, String sentence) {
		assertEquals(words, wordCounter.countWords(sentence));
	}

	@Before
	public void setup() {
		wordCounter = new WordCounter();
	}

	@After
	public void teardown() {
		System.out.println("thats it");
	}

}
