import java.util.*;

public class FormativeAssessment_Loops2{

  public static void main(String[] args) {
		
	int squared,cube;
	int x =1;
	
	System.out.println("\n\tValue of x" + "\tSquare of x" +"\tCube of x");
	System.out.println();	
	  
	  
	  while (x <= 25) {
	
	   squared = x*x ;
	   cube = x*x*x;
	   System.out.println("\t    "+ x +"\t\t    "+ squared + "\t\t    " + cube);	
	   x++;  
		  
	 
	  }
	 
	 
	}

}
