package tdd;

public class FizzBuzz {

	public String say(int i) {
		boolean isNumMod5Equals0 = (i%5 == 0);
		if( isNumMod5Equals0 && i%3 == 0 ) {
			return "FizzBuzz";
		}
		if( isNumMod5Equals0 ) {
			return "Buzz";
		}
		if( i%3 == 0 ) {
			return "Fizz";
		}
		return String.valueOf(i);
	}
}
