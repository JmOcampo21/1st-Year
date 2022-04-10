import java.util.*;
public class GROUP1_LAB10B { 


	public static void main(String[] args) {
	   
	    Scanner scan = new Scanner (System.in);
	   
	    //initialization
	   
	    float [] x = new float [10];	   
	    float ave = 0f, sum = 0f, summation = 0f, S = 0f;
		int ctr = 0;
	    int i;
	    int n = x.length;
	   
	    //accepts 10 floating point numbers from the user 
	    System.out.println("Input 10 floating point numbers: ");
	   
	      for (i = 0; i < n; i++) {
		   
	        x[i] = scan.nextFloat();		
	        sum = sum + x[i];
	        ctr++;
			
	      }
		  
		//determines the average 
		ave = sum / ctr;
		 
		//standard deviation 
		  for (i = 0; i < n; i++) {
		   
	        summation += Math.pow((x[i] - ave),2);
					
	      }
		  
		S = (float) Math.sqrt(summation/(n - 1));
		
		//printing
		System.out.println("\nThe average of the 10 inputted floating point numbers is " + ave +".");
		System.out.println("The standard deviation of the 10 inputted floating point numbers is equal to " + S +".");
		
		/* Created by Enrique Girao, Raymond Natividad, Johan Ocampo and Kirsten Zulaybar */	
	}
}