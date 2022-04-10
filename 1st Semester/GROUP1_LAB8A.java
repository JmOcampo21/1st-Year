import java.util.*;
public class GROUP1_LAB8A
{
	public static void main(String[] args) 
	{	
		Scanner scan = new Scanner (System.in);
		final int SENTINEL = 4;		
		int integer, value;
		
		System.out.print("Input an Integer: ");
		integer=scan.nextInt();
		
		System.out.println("1. Add 1\n2. Multiply by 2\n3. Subtract 4\n4. Quit");		
		System.out.print("Type a value between 1 to 4: ");		
		value=scan.nextInt();
		
		while (value!=SENTINEL)
		{
			switch (value)
			{
				case 1:
					integer++;
					System.out.println("\nThe integer value is equal to " + integer);
					break;
				case 2:
					integer = integer * 2;
					System.out.println("\nThe integer value is equal to " + integer);
					break;
				case 3:
					integer = integer - 4;
					System.out.println("\nThe integer value is equal to " + integer);
					break;
			}		
			
			System.out.println("1. Add 1\n2. Multiply by 2\n3. Subtract 4\n4. Quit");					
			System.out.print("Type a value between 1 to 4: ");			
			value=scan.nextInt();			
		}
		   
		System.out.println("\nThe Final Integer Value is: " + integer);
		  
		/* Created by Enrique Girao, Raymond Natividad, Johan Ocampo and Kirsten Zulaybar */
	}
} 




