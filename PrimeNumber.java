class PrimeNumber
{
	public static void main(String[] args)
	{
		int a = 29;
		boolean flag = false;

		for ( int i = 2; i < a/2; i++)
		{
			if ( a%2==0)
			{
				flag = true;
				break;
			}
		}
		if(!flag)
		{
			System.out.println(a+ " is a Prime Number ");
		}
		else
		{
			System.out.println(a+ " is not a Prime Number ");
		}
	}
}