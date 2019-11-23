import java.util.Scanner;
public class SimpleInterest
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the principle amount: ");
		double p = scan.nextDouble();
		
		System.out.println("Enter the rate of interest: ");
		double r = scan.nextDouble();
		
		System.out.println("Enter the time: ");
		double t = scan.nextDouble();
		
		double s = (p*r*t)/100;
		
		System.out.println("Simple Interest of the given number is " +s);
	}
}