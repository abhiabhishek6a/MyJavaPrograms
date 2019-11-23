class Fabonacci
{
	public static void main(String[] args)
	{

		int i, n = 10, t1 = 0, t2 = 1;

		System.out.println(" First " +n+ " terms ");
		{
			for ( i = 1; i<=n; i++)
			{
				System.out.print(t1 + " + ");

				int sum = t1 + t2;
					 t1 = t2;
					 t2 = sum;
			}
			System.out.print("...");
		}
	}
}