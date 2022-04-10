import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {

		   Scanner s= new Scanner (System.in);
		
		   String school1 = "University of Santo Tomas";
		   String school2 = school1.toLowerCase();
		   String message = "        I love ";
		  
		   
		   System.out.println(school1);
		   System.out.println(school2);
		   System.out.println(message);
		   
		   //first character in school1
		   System.out.println(school1.charAt(0));
		   //length of school 1
		   System.out.println(school1.length());
		   
		   
		   System.out.println(school1.equals(school2));
		   
		   System.out.println(school1.equalsIgnoreCase(school2));
		   
		   System.out.println(message.concat(school1));
		   
		   
		   
		   System.out.print("Enter a string equal to school1: ");
		   String sameschool1 = s.nextLine();
		   
		   System.out.println(sameschool1.equals(school1));
		   
		   //school2 in capital letters
		   System.out.println(school2.toUpperCase());
		   
		   System.out.println(school1.toUpperCase());
		   
		   System.out.println(school2.substring(school2.length() -1 ));
		   //first character of message
		   System.out.println(message.charAt(0));
		   //length of school 2
		   System.out.println(school2.length());
		   
		   String replaceschool2 = school2.replace('i', '!');
		   System.out.println(replaceschool2);
		   
		   System.out.println(school1.substring(14));
		   
		   System.out.println(message.trim());
		   System.out.println(message.length());
		   
		   System.out.println(school1.equals(school2));
		   
		   System.out.println(message.substring(10));
		   
	}
	
	
}