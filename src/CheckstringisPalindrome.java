
public class CheckstringisPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Palindrome means even if after reverese the string the name would nt be changed)
		
		//String input ="Madam"; //This is Palindrome text because after the reverse the text meaning is same
		
		String input="Level"; //This is Palindrome text because after the reverse the text meaning is same
		
		//String input ="Hello"; //This is not Palindrome text because after the reverse the text meaning is same
		
		String reverse ="";
		
		//// Reverse the string manually
		
		for( int i= input.length()-1; i>=0; i--) {
			
			reverse = reverse + input.charAt(i);
			
		}
		
		System.out.println("Original text " + input);
		
		System.out.println("Reverse text " + reverse );
		
		
		//  Check if original and reversed are equal
		if (input.equalsIgnoreCase(reverse)){
			
			System.out.println("Text is a palindrome " + input);
		}

		else {
			
			System.out.println("Text is not palindrome " + input);
		}
	}

}
