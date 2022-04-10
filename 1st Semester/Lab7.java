import java.util.*;
public class Lab7{

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double C, F;		
		int n, inc, i;
		
		
		System.out.print("Enter the number of conversions to be made: ");
		n = scan.nextInt();
		
		System.out.print("Enter the increment between celsius values: ");
		inc = scan.nextInt();
		
		System.out.print("Enter the starting Celsius Value: ");
		C = scan.nextDouble();
		
		System.out.print("\tCelsius\t\tFahrenheit\n\n");
		
		for(i = 1; i <= n; i++, C= C+inc)
		{   
			
			F = ((9.0/5.0 * C) + 32);
			
			System.out.println("\t" + C +"\t\t" + F);
			
		}	
	}

}
