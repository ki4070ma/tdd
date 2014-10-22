package tdd;

public class FizzBuzz {


	public String say(int num) {
		if( num <= 0 ) throw new IllegalArgumentException();

		boolean isNumMod5Equals0 = (num%5 == 0);
		boolean isNumMod3Equals0 = (num%3 == 0);
		if( isNumMod5Equals0 && isNumMod3Equals0) {
			return "FizzBuzz";
		}
		if( isNumMod5Equals0 ) {
			return "Buzz";
		}
		if( isNumMod3Equals0 ) {
			return "Fizz";
		}
		return String.valueOf(num);
	}
}
