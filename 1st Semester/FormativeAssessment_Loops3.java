import java.util.*;
public class FormativeAssessment_Loops3 {

	public static void main(String[] args) {
		
	Scanner scan= new Scanner (System.in);	
	
	System.out.println("Note: a^x, where a is a real value and x is a positive integer.");
	
	System.out.print("\nEnter a real value for a: ");
	double a = scan.nextDouble();
	
	System.out.print("Enter a positive integer for x: ");
	int x = scan.nextInt();
	
	int i = 1;
	double total = 1;
	
	   if (x > 0) {
		   
		 for (i = 1; i <= x; i++) {
	
	       total= total*a;
	
	     }  
	   
	   }
		 
	   else {
		   
		System.out.println("\nERROR: You entered an invalid input for x, please try again. ");
		System.out.print("Enter a positive integer for x: ");
	    x = scan.nextInt();
		
		 for (i = 1; i <= x; i++) {
	
	       total= total*a;
	
	     }  
		
	    }	
		
	System.out.println();
	System.out.println(a+ "^" +x + " = " +total);
	   	
   }
	
}