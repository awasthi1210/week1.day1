package week1.day1.assignments;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isPrime = true;
		int number = 12;
		for (int i = 2; i <= number / 2; i++) {

			if (number % i == 0) {

				isPrime = false;
				break;

			}

		}
		if (isPrime) {
			System.out.println(number + " is a prime number");
		} else {
			System.out.println(number + " is not a Prime number");
		}
	}

}

