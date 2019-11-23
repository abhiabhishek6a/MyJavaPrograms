import java.util.Scanner;
public class EvenOddPrint
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number that you desired to print: ");
		int n = scan.nextInt();
		
		for (int i = 1; i<= n; i++)
		{
			if (i%2==0)
			{
				System.out.println(i+ " - Even");
			}
			if (i%2!=0)
			{
				System.out.println(i+ " - Odd");
			}
		}
	}
}
