package tdd;

import org.junit.Test;

import static org.junit.Assert.*;

import static org.hamcrest.core.Is.*;
import static org.hamcrest.core.IsNot.*;
import static org.hamcrest.core.IsNull.*;

public class FizzBuzzTest {
	@Test
	public void ������3�̔{���̎�Fizz�ƕԂ�() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		assertThat(fizzbuzz.say(3), is("Fizz"));
	}

	@Test
	public void ������5�̔{���̎�Buzz��Ԃ�() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		assertThat(fizzbuzz.say(5), is("Buzz"));
	}
}
