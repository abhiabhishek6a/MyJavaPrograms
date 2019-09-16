class Check
{
	public static void main(String[] args)
	{
		System.out.println("Enter the value");
		java.util.Scanner sc= new java.util.Scanner(System.in);
		int i=sc.nextInt();
		if(i%2==0)
		{
			System.out.println("Number is even");
		}
		else
		{
			System.out.println("Number is odd");
		}
	}
}