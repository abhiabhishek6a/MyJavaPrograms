import java.util.Scanner;
public class AddNumberWithoutThirdVariable
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first number to perform addition: ");
		int a = scan.nextInt();
		
		System.out.println("Enter second number to perform addition: ");
		int b = scan.nextInt();
		
		System.out.println("The sum is " +(a+b));
	}
}