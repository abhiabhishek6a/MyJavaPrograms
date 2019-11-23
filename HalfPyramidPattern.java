import java.util.Scanner;

class Pattern
{
	public static void main(String[]args)
	{
		int rows;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to pyramid");
		rows = sc.nextInt();
		for (int i = 1; i<= rows; i++)
		{
			for (int j = 1; j<= i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
