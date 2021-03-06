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
		assertThat(fizzbuzz.say(30), is("FizzBuzz"));
	}
	
	@Test
	public void 数字が3の倍数でも5の倍数でもない時にはその数字の文字列を返す() {
		assertThat(fizzbuzz.say(2), is("2"));
		assertThat(fizzbuzz.say(7), is("7"));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void 数字が0の場合は引数例外をスローする() {
		fizzbuzz.say(0);
	}

	@Test(expected=IllegalArgumentException.class)
	public void 数字が負数の場合は引数例外をスローする() {
		fizzbuzz.say(-3);
	}
}
