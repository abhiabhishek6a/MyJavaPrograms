import java.util.Scanner;

class PyramidPatternNumber
{
	public static void main(String[]args)
	{
		int rows;
		Scanner scan = new Scanner(System.in);

		System.out.println(" Choose number for pyramid pattern: ");
		rows = scan.nextInt();

		for (int i = 1; i<= rows; i++)
		{
			for (int j = 1; j<= i; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}