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
	public void ������3�̔{���̎�Fizz��Ԃ�() {
		assertThat(fizzbuzz.say(3), is("Fizz"));
		assertThat(fizzbuzz.say(18), is("Fizz"));
	}

	@Test
	public void ������5�̔{���̎�Buzz��Ԃ�() {
		assertThat(fizzbuzz.say(5), is("Buzz"));
		assertThat(fizzbuzz.say(10), is("Buzz"));
	}
	
	@Test
	public void ������3��5�����̔{���ł��鎞FizzBuzz��Ԃ�() {
		assertThat(fizzbuzz.say(15), is("FizzBuzz"));
		assertThat(fizzbuzz.say(30), is("FizzBuzz"));
	}
	
	@Test
	public void ������3�̔{���ł�5�̔{���ł��Ȃ����ɂ͂��̐����̕������Ԃ�() {
		assertThat(fizzbuzz.say(2), is("2"));
	}
}
