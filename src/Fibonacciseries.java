
public class Fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n =10 ;// to print the sum number of values
		
		int first=2, second=5;
		
		System.out.println("Printing the Fibonacciseries upto 10 times");
		
		
		for(int i=1;i<=n;i++) {
			
			System.out.print(first +" ");
			
			int next =first + second;
			
			first=second;
			
			second=next;
			
		}
					
		}

}
