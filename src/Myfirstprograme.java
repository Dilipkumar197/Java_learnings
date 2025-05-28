
public class Myfirstprograme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("This is my  java program");
		
		

		int a[]= {6,7,8,9,10}; // defining Single dimensional int type array
		
		String b[]= {"King" ,"Raju","Prince" ,"Kush Kush"}; // defining String type array

		
		Object c[]= {1,2,3,5,6, "Java",'b',10.55 ,10>5}; // defining Object type array
		
		
		System.out.println(a.length);
		
		System.out.println(b.length);
		
		System.out.println(c.length);
		
		System.out.println(c[5]);
		
		System.out.println(b[2]);
		
		
		b[2]="Prine";
		
		c[5]="Javascript";
		
	    System.out.println(c[5]);  //Modifying the string values etc.
		
		System.out.println(b[2]);   //Modifying the string values etc.
		
	}

}
