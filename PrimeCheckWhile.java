import java.util.Scanner;
class PrimeCheckWhile
{
	public static void main(String[] args)
	{
		int temp;
		boolean flag = false;

		Scanner scan = new Scanner(System.in);

		System.out.println(" Enter any number : ");
		int num = scan.nextInt();

		int i =2;
		while(i<=num/2)
		{
			if (num % i == 0)
			{
				flag = true;
				break;
			}
			i++;
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