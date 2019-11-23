import java.util.Scanner;
public class AddNumberWithThirdVariable
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the first number that to perform addition: ");
		int a = scan.nextInt();
		
		System.out.println("Enter the second number that to perform addition: ");
		int b = scan.nextInt();
		
		int c = a + b;
		
		System.out.println("The sum is " +c);
	}
}