import java.util.*;
public class GROUP1_LAB10A { 


	public static void main(String[] args) {
	   
	   Scanner scan = new Scanner (System.in);
	   
	   //initialization
	   
	   double [] A = new double [10];
	   double[] B = new double[10];
	   double ave = 0, sum = 0, dif = 0;
	   int i,j;
	   int ctr = 0;
	   
	   //average of all inputs in Array A
	   System.out.println("Input 10 numbers: ");
	   
	     for (i = 0; i < 10; i++) {
		   
	        A[i] = scan.nextDouble();
	        sum = sum + A[i];
	        ctr++;
	     }
	   
	   ave = sum / ctr;
	   System.out.println("\nThe average of the 10 inputted numbers is " + ave +".");
	   
	   //Store in array B the difference of each element of array A and the average of all the elements in array A.
	   
	   System.out.println("\nThe difference of each element of array A and " );
	   System.out.println("the average of all the elements in array A are:\n " );
	   
	    //printing    
			for (j = 0, i = 0; j < 10; j++, i++) {
		   
	        dif = A[i] - ave;
			B[j] = dif;
			
			/* Created by Enrique Girao, Raymond Natividad, Johan Ocampo and Kirsten Zulaybar */		
			
	}
}