package tdd;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;
import static org.hamcrest.core.IsNot.*;
import static org.hamcrest.core.IsNull.*;

public class FizzBuzzTest {
	FizzBuzz fizzbuzz;

	@Before
	public void setUp() {
		fizzbuzz = new FizzBuzz();
	}

	@Test
	public void ”š‚ª3‚Ì”{”‚ÌFizz‚ğ•Ô‚·() {
		assertThat(fizzbuzz.say(3), is("Fizz"));
		assertThat(fizzbuzz.say(18), is("Fizz"));
	}

	@Test
	public void ”š‚ª5‚Ì”{”‚ÌBuzz‚ğ•Ô‚·() {
		assertThat(fizzbuzz.say(5), is("Buzz"));
		assertThat(fizzbuzz.say(10), is("Buzz"));
	}
	
	@Test
	public void ”š‚ª3‚Æ5—¼•û‚Ì”{”‚Å‚ ‚éFizzBuzz‚ğ•Ô‚·() {
		assertThat(fizzbuzz.say(15), is("FizzBuzz"));
		assertThat(fizzbuzz.say(30), is("FizzBuzz"));
	}
	
	@Test
	public void ”š‚ª3‚Ì”{”‚Å‚à5‚Ì”{”‚Å‚à‚È‚¢‚É‚Í‚»‚Ì”š‚Ì•¶š—ñ‚ğ•Ô‚·() {
		assertThat(fizzbuzz.say(2), is("2"));
	}
}
