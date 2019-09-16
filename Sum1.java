import java.util.Scanner;
public class Sum1
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a= in.nextInt();
		System.out.println("Enter the second number");
		int b= in.nextInt();
		System.out.println("The sum is " +(a+b));
	}
}