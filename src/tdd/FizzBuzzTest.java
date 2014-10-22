package tdd;

import org.junit.Test;

import static org.junit.Assert.*;

import static org.hamcrest.core.Is.*;
import static org.hamcrest.core.IsNot.*;
import static org.hamcrest.core.IsNull.*;

public class FizzBuzzTest {
	@Test
	public void 数字が3の倍数の時Fizzと返す() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		assertThat(fizzbuzz.say(3), is("Fizz"));
	}

	@Test
	public void 数字が5の倍数の時Buzzを返す() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		assertThat(fizzbuzz.say(5), is("Buzz"));
	}
}
