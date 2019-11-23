class PrimeNumberWhile
{
	public static void main(String[] args)
	{
		int num = 99;
		int i = 2;
		boolean flag = false;
		while ( i<=num/2)
		{
			if(num%i == 0)
			{
				flag = true;
				break;
			}
			i++;
		}
		if(!flag)
		{
			System.out.println(num+ " is a Prime Number ");
		}
		else
		{
			System.out.println(num+ " is not a Prime Number ");
		}
	}
}