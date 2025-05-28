
public class ReverseArray {

	public static void main(String[] args) {
		int[] numbers = { 25, 35, 45, 55, 65 };

		System.out.println("Original array");

		for (int i = 0; i < numbers.length; i++) {

			// System.out.println(numbers[i] + " ");

			// TO Print like a row in single line use below

			System.out.print(numbers[i] + " ");
		}
		
		

		System.out.println("\n\nReverse array");

		for (int i = numbers.length - 1; i >= 0; i--) {

			// System.out.println(numbers[i] + " ");

			// TO Print like a row in single line use below

			System.out.print(numbers[i] + " ");
		}

	}

}
