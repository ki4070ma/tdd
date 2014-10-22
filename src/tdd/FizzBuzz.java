package tdd;

public class FizzBuzz {

	public String say(int i) {
		if( i%5 == 0 && i%3 == 0 ) return "FizzBuzz";
		if( i%5 == 0 ) return "Buzz";
		return "Fizz";
	}
}
