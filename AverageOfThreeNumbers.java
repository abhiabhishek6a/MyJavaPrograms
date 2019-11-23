import java.util.Scanner;
public class AverageOfThreeNumbers
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the first value: ");
		int x = scan.nextInt();
		
		System.out.println("Enter the second value: ");
		int y = scan.nextInt();
		
		System.out.println("Enter the third value: ");
		int z = scan.nextInt();
		
		double a = (x + y + z)/3;
		
		System.out.println("The average of total number is " +a);
	}
}