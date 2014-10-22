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
	public void 数字が3の倍数の時Fizzを返す() {
		assertThat(fizzbuzz.say(3), is("Fizz"));
		assertThat(fizzbuzz.say(18), is("Fizz"));
	}

	@Test
	public void 数字が5の倍数の時Buzzを返す() {
		assertThat(fizzbuzz.say(5), is("Buzz"));
		assertThat(fizzbuzz.say(10), is("Buzz"));
	}
	
	@Test
	public void 数字が3と5両方の倍数である時FizzBuzzを返す() {
		assertThat(fizzbuzz.say(15), is("FizzBuzz"));
	}
}
