package interview_preparation;

public class PrimeNumber {

	public static void main(String[] args) {
		// Declare and initialize the number to check
		int num = 123;
		// Assume the number is prime initially
		boolean isPrime = true;

		// Check if the number is less than 2
		if (num < 2) {
			// Numbers less than 2 are not prime
			isPrime = false;
		} else {
			// Check divisibility from 2 up to the square root of num
			for (int i = 2; i <= Math.sqrt(num); i++) {
				// If num is divisible by i, it's not a prime number
				if (num % i == 0) {
					isPrime = false;
					break; // No need to check further if we found a divisor
				}
			}
		}
		// Output the result based on whether isPrime is true or false
		if (isPrime) {
			System.out.println(num + " is a prime number");
		} else {
			System.out.println(num + " is not a prime number");
		}
	}

}
