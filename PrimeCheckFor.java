import java.util.Scanner;
class PrimeCheckFor
{
	public static void main(String[] args)
	{
		int temp;
		boolean flag = false;

		Scanner scan = new Scanner(System.in);

		System.out.println(" Enter any number : ");
		int num = scan.nextInt();

		for ( int i = 2; i<=num/2; i++)
		{
			temp = num%i;
			if(temp==0)
			{
				flag = true;
				break;
			}
		}
		if(!flag)
		{
			System.out.println(num+ " is a Prime Number");
		}
		else
		{
			System.out.println(num+ " is not a Prime Number");
		}
	}
}