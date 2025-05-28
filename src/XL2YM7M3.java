
public class XL2YM7M3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "XL2YM7M3";

		for (int i = 0; i < input.length() - 1; i++) {
			char ch = input.charAt(i);

			char next = input.charAt(i + 1);
			
			
			if((ch=='L'|| ch=='M') && Character.isDigit(next)){
				
				int count = next-'0';
				
				for (int j=0;j<count;j++)
				
				{
					System.out.println(ch);
				}
				

               System.out.println();
			}

		}

	}

}
