import java.util.Scanner;
class Factorial
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int n = scan.nextInt();
		if(n>=0)
		{
			int f = 1;
			while(n!=0)
			{
				f = f*n;
				n--;
			}
			System.out.println("Factorial is: " +f);
		}
		else
		{
			System.out.println("Invalid Input");
		}
	}
}