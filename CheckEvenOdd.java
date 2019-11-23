class CheckEvenOdd
{
	public static void main(String[] args)
	{
		int a;
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Enter any integer number : ");
		a = input.nextInt();

		if(a % 2 == 0)
		{
			System.out.println("Even");
		}
		
		else
		{
			System.out.println("Odd");
		}
		
	}
}