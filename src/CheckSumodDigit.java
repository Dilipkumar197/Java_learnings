
public class CheckSumodDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 8678;

		int sum = 0;

		while (num > 0) {

			int rem = num % 10;

			sum = sum + rem;

			num = num / 10;
		}

		System.out.println("The sum of the digit " + sum);
	}

}
