
public class ReverseStringwithoutbuiltin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*String input= "My name is Aditya";
		
		String reverse ="";
		
		
		//Looping the statement for last character  to the first
		
		for(int i=input.length() -1 ; i>=0; i--) {
			
			reverse =reverse + input.charAt(i);
			
		}
		
		
		System.out.println("Original text is  " + input);
		
		System.out.println("Reverse text is " + reverse);
		
	}*/
	
	
	String input1 = "My company name is Epic";
	String reverse1 ="";
	
	
	for ( int i=input1.length()-1; i>=0; i--) {
	
	  reverse1= reverse1+ input1.charAt(i);
	
	
	}
	
	System.out.println("Original text is  " + input1);
	
	System.out.println("Reverse text is " + reverse1);
	
	

}
	
}
