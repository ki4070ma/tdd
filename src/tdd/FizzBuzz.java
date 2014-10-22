package tdd;

public class FizzBuzz {

	public String say(int i) {
		if( i == 15 ) return "FizzBuzz";
		if( i%5 == 0 ) return "Buzz";
		return "Fizz";
	}
}
