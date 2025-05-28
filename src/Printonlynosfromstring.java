
public class Printonlynosfromstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "KA134VYA67SRI90";
		
		System.out.println("Print the string the Numbers");
		
		for ( int i=0;i<input.length();i++) {
			
			char ch = input.charAt(i);
		
			if(Character.isDigit(ch)) {
				
				System.out.println(ch);
			}
			
		
			
		}
		
		}

	

}
