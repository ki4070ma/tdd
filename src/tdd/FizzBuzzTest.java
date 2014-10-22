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
	}

	@Test
	public void ”š‚ª5‚Ì”{”‚ÌBuzz‚ğ•Ô‚·() {
		assertThat(fizzbuzz.say(5), is("Buzz"));
	}
}
