package org.gvaireth.springangularintro.testing;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
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

	@Test
	public void testArgumentCapture() {
		service.countWords("  hello there  ");

		ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
		verify(wordCounter, times(1)).countWords(captor.capture());
		assertThat(captor.getValue(), equalTo("hello there"));
	}

	@Before
	public void setup() {
		service = new WordService();

		MockitoAnnotations.initMocks(this);
		when(wordCounter.countWords(any())).thenReturn(2);
	}

}
