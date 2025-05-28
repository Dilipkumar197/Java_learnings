
public class Assignvaribalesoutsidemainmethod {

	
	String dogbreed ="Labourdog";
	
	String dogname="Anny";
	
	int age =7;
	
	
	static String seconddogbreed="Pug";
	
	static String seconddogname="Rubby";
	
	static int age1 =8;
	
	String Thridogbreed;
	
	String Thirddogname;
	
	int age3;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//if variables are defining outside main methid we need to create object like below object
		
		Assignvaribalesoutsidemainmethod pet = new Assignvaribalesoutsidemainmethod ();    
		System.out.println("The breed is " + pet.dogbreed);
		System.out.println("The name is " + pet.dogname);
		System.out.println("The age is "+ pet.age);
		
		System.out.print(" ");
		
		System.out.println("The second dog breed is "+ seconddogbreed);
		System.out.println("The second dog name is "+ seconddogname);
		System.out.println("The second dog age is "+ age1);
		
		Assignvaribalesoutsidemainmethod Thirdpet = new Assignvaribalesoutsidemainmethod (); 
		
		Thirdpet.Thridogbreed="Pug";
		Thirdpet.Thirddogname="Tommy";
		Thirdpet.age3=3;
		
		
		System.out.println("The Third dog breed is "+ Thirdpet.Thridogbreed);
		System.out.println("The Third dog name is " + Thirdpet.Thirddogname);
		System.out.println("The Third dog age is " + Thirdpet.age3);
		
	}

}
