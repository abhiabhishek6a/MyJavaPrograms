import java.util.Scanner;
public class CompoundInterest
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the principle value: ");
		int p = scan.nextInt();
		
		System.out.println("Enter the interest rate value: ");
		int r = scan.nextInt();
		
		System.out.println("Enter the number of time interest: ");
		int n = scan.nextInt();
		
		System.out.println("Enter the total collapse time: ");
		int t = scan.nextInt();
		
		double a = p*(1 + r/n)^n*t;
		
		System.out.println("The compound interest is " +a);
	}
}