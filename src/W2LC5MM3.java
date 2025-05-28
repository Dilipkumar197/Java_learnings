
public class W2LC5MM3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input="W2LC5MM3";
		
		for(int i=0;i<input.length()-1;i++) {
			
			char ch=input.charAt(i);
			char next =input.charAt(i+1);
			
			//check if current character is W OR C and next charcater is digit
			
			if((ch=='W'|| ch=='C') && Character.isDigit(next))

          {
				
				int count = next-'0';
				
				for(int j=0;j<count;j++)
				{
					
					System.out.println(ch);
				}
				
				System.out.println();
			}
			
			
		}

	}

}
