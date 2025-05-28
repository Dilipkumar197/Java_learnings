
public class CountNoofDigitinNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num =56789698;
		
		int count=0;
		
		while (num>0) {
			
			num=num/10;
			
			count++;
		}

		
		System.out.println("The count of the Number " + count);
	}

}
