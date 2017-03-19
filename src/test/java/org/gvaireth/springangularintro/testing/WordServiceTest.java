package org.gvaireth.springangularintro.testing;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class WordServiceTest {

	@InjectMocks
	private WordService service;

	@Mock
	private WordCounter wordCounter;

	@Test
	public void testCountWords() {
		assertThat(service.countWords("hello there"), equalTo(2));
	}

	@Before
	public void setup() {
		service = new WordService();

		MockitoAnnotations.initMocks(this);
		when(wordCounter.countWords("hello there")).thenReturn(2);
	}

}
