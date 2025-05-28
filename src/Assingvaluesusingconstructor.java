
public class Assingvaluesusingconstructor {

	String dogbreed ;
	
	String dogname;
	
    int age ;
    
    public Assingvaluesusingconstructor(String dogbreed , String dogname , int age )
    {
    	
    	this.dogbreed=dogbreed;
    	this.dogname=dogname;
    	this.age=age;
    }
 
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Assingvaluesusingconstructor petinfo = new Assingvaluesusingconstructor("Pug", "Tommy" ,5);
				
		System.out.println("The pet breed is " + petinfo.dogbreed);
		System.out.println("The pet name is " + petinfo.dogname);
		System.out.println("The pet age is " + petinfo.age);

	}

}
