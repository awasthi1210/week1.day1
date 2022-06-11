package week1.day1.assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNum = 0;
		int secondNum = 1;
		int range =7;
		int sum = 0;
		System.out.println(firstNum);
		System.out.println(secondNum);
		for (int i = 1; i < range; i++) {

			sum = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = sum;
			System.out.println(sum);

		}
	}

}
