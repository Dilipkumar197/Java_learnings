
public class LargestofThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=56;
		
		int b=79;
		
		int c=100;
		
		int largest;
		
		if(a>=b  && a>=c) {	
			largest =a;
		}
		else if(b>=a && b>=c) {

			largest=b;
		}
		
		else {
			
			largest =c;
		}
		
		System.out.println("The largest Number is "+ largest);
		
	}

}
