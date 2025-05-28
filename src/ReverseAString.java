
public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String input ="My name is Dilip ";
		
		//Build in method to reverse  a string 
		String reverse = new StringBuilder(input).reverse().toString();
		
	System.out.println("Original text"+input);
	
	System.out.println("Reverse Text"+ reverse);
	
	System.out.println();
	
	
	String input1= "My Position is QA";
	
	
	//Built in method in Java
	
	String reverse1 =new StringBuilder(input1).reverse().toString();
	
	System.out.println("Original text " + input1);
	
	System.out.println("Reverse text" + reverse1);
	
	}

}
