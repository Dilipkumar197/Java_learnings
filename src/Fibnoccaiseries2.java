
public class Fibnoccaiseries2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1 = 2, n2 = 4, sum = 0;

		System.out.print(n1 + " " + n2);

		for (int i = 2; i <10; i++) {

			
			sum=n1+n2;
			System.out.print(" " + sum);
			n1 = n2;

			n2 = sum;
		}

	}

}
