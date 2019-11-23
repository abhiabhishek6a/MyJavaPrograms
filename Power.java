import java.util.Scanner;
public class Power
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter any number: ");
		int x = scan.nextInt();
		
		int p = x * x;
		
		System.out.println("The power of the number is " +p);
	}
}