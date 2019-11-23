import java.util.Scanner;
public class SquareRoot
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter any number that you want to find square root: ");
		int a = scan.nextInt();
		
		double sq = Math.sqrt(a);
		
		System.out.println("The square root of the given number is " +sq);
	}
}