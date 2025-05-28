
public class CountVowelsconsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String input ="He is Quality Analyst";
		
		//Convert the string to lower case
		input =input.toLowerCase();
		
		int vowel=0;
		
		int consonants=0;
		
		//char=input.charAt(i)
		
		for (int i=0; i<input.length(); i++) {
			
			Character ch=input.charAt(i);
					
			if(Character.isLetter(ch)) {
				
				if((ch=='a' || ch=='e' || ch=='i' || ch=='o'|| ch=='u')) {
					
					vowel++;
				}
				else {
					
					consonants++;
				}
				
			}
			
		}
		
		System.out.println("The text is  "+ input);
		
		System.out.println("Vowels count is "+ vowel);
		
	    System.out.println("Consontants count is " + consonants);

	}

}
