import java.util.Scanner;
public class FactorialNew
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter any number: ");
		int n = scan.nextInt();
		
		for (int i = 1; i<= n; i++)
		{
			int factorial = 1;
			factorial = factorial * i;
			
			System.out.println("Factorial of " +n+ " is " +factorial);
		}
	}
}
