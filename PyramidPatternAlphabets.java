import java.util.Scanner;

class PyramidPatternAlphabets
{
	public static void main(String[]args)
	{
		char alphabet='z';


		for (char i = 'a'; i<= alphabet; i++)
		{
			for (char j = 'a'; j<= i; j++)
			{
				System.out.print(j+ " ");
			}
			
			System.out.println();
		}
	}
}