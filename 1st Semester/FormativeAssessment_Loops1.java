import java.util.*;
public class FormativeAssessment_Loops1{

 
	
	public static int add(int a, int b) {
		   
			int sum ;
			int i = 1;	
			
				for ( sum = 0 ; a <= b; a= a + 1 ) {
				  
					  if (a % 2 != 0)  
				   {
					 sum +=a;	
				    
				     
				   }
							     
				 }    
				  
				return sum;
	 }
	
	 
	 public static double average(int a, int b) {
		   
			double sum;
			int i = 0;	
			double ave;
			
				for ( sum = 0 ; a <= b; a= a + 1 ) {
				  
					  if (a % 2 != 0)  
				   {
					 sum +=a;	
				     i++;
				     
				   }
							     
				}    
				  ave = sum / i;
				  return ave;
	 }
	 
	 
	 
	 static Scanner console = new Scanner (System.in);
	 
	 public static void main (String[] args){
	
	 int a,b;
	 double ave= 1.0;
	 int sum = 0;
		 
	 System.out.println("Note: a <= b");
     System.out.print("Enter integer value for a: ");
	 a= console.nextInt(); 
	  
	 System.out.print("Enter integer value for b: ");
	 b= console.nextInt();
	 
	 System.out.println();
	 sum = add(a, b);
	 ave = average(a, b);
	 System.out.println("The sum of all odd integers from " + a +" to " + b +" is " + sum);
	 System.out.println("The average of all odd integers from " + a +" to " + b +" is " + ave);
	 
	 }
			  
	
		
			  
	 }
	 
