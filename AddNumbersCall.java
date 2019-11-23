class AddNumbersCall
{
	public static void main(String[] args)
	{
		int a, b;
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("Enter the first number : ");
		a = s.nextInt();
		System.out.println("Enter the second number : ");
		b = s.nextInt();

		s.close();
		System.out.println("The sum is : " +(a+b));
	}
}