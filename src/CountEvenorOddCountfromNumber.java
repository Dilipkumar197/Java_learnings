
public class CountEvenorOddCountfromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 789134;
		
		int evencount=0;
		
		int oddcount=0;
		
		while(num>0) {      // 1234  123 12 1 0
			
			
			int rem=num%10;     //4   3 2 1
			
			
			if(rem%2 ==0) {
				
				evencount++;    //1 + 1
			}
			
			else {
				
				oddcount++;     //1+1
			}
			
			
			num = num/10;          //123 12 1 0
		}
		
		
		System.out.println("The count of even Numbers " + evencount);
		
		System.out.println("The count of even Numbers " + oddcount);
		
		
	}

}
