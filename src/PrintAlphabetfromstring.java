
public class PrintAlphabetfromstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String input="KA134VYA67SRI90";
		
	    System.out.println("Print only the Alphabets");
		
		for (int i=0;i<input.length(); i++) {
			
			
			char ch = input.charAt(i);
			
				if(Character.isLetter(ch)) {
					
					
					System.out.println(ch);
				}
			
		}

	}

}
