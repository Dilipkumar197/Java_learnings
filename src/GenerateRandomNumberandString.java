import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
public class GenerateRandomNumberandString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub///
		
		
		//appraoch1
		
		//Built in method in java
		Random rand = new Random();
		
		//Generate Random Integer
		int rand_int=rand.nextInt(1000) ; //Print random  between 0 to 1000
		
		System.out.println(rand_int);
		
		//Generate Random double
		double rand_doub=rand.nextDouble();
		
		System.out.println(rand_doub);  //print the number between 0.0 to 1.0
		
		//appache commom lang api
		
		String randnum=RandomStringUtils.randomNumeric(5);
		
		System.out.println(randnum);
		
		
		String randstr=RandomStringUtils.randomAlphabetic(10);
		
		System.out.println(randstr);
		
	
	}

}
