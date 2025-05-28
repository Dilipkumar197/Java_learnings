
public class CheckprimeNumorNot {

	// Prime means it should be divided by 1 or its own number
	// Not Prime if it is divided by more than 2 nos , it is not a prime number
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 9;

		int count = 0;
		
		if(num>1) {
			
			for(int i=1;i<=num;i++)
				
			{
				if(num%i==0)
					count++;
			}
			
			if(count==2) {
				
				System.out.println("The given Number is prime Number");
			}
			
			else {
				
				System.out.println("The given Number is not a prime Number");
			}
			
		}
		
		else {
			
			System.out.println("Not a prime Number");
		}

	}

}