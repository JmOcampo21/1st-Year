import java.util.*;
public class GROUP1_LAB8B 
{
	public static void main (String [] args)
	{
		Scanner in = new Scanner (System.in);	
		final int SENTINEL = 0;	
		double ave = 0;
		double ctr = 0;
		double s = 0;
		int f = 0;
		int max = 0;	
		
		System.out.print("NOTE: Input 0 to quit\nEnter student's grade: ");	
		int grade = in.nextInt();	
	    System.out.println();
		while (grade > SENTINEL && grade < 10)
		{		
			if (grade > max)     //Highest grade
			 max= grade;
			
			if (grade > SENTINEL && grade < 4)     //grade greater than 0 and less than 4
			{	
				ctr++;
				f++;
				s+= grade;			
			    System.out.print("Enter student's grade: ");
			    grade = in.nextInt();
			}	
			else
			{
                ctr++;
                s+= grade;	
				System.out.print("Enter student's grade: ");
			    grade = in.nextInt();
			}				
		}
		ave = s/ctr;   //class grade average
		
		System.out.println("\nClass average: " + (double) Math.round(ave * 100)/100);
		System.out.println("Highest grade: " + max);
		System.out.println("Number of students that failed the course: " + f);
		
		 if (f > 10)     //more than 10 students failed
		  System.out.println("The teacher sucks!");
		
			/* Created by Enrique Girao, Raymond Natividad, Johan Ocampo and Kirsten Zulaybar*/
	}
}