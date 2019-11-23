import java.util.Scanner;
public class SwapTwoNumbersWithThirdVariable
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Before Swapping");
		
		System.out.println("Enter the first number for swap (x): ");
		int x = scan.nextInt();
		
		System.out.println("Enter the second number for swap (y): ");
		int y = scan.nextInt();
		
		x = x + y;
		y = x - y;
		x = x - y;
		
		System.out.println("After Swapping");
		
		System.out.println("The value of first number (x): " +x);
		
		System.out.println("The value of second number (y): " +y);
	}
}
