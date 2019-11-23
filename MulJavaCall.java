class MulJavaCall
{
	public static void main(String[] args)
	{
		double a;
		double b;
		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.println("Enter the first number");
		a = scan.nextDouble();
		System.out.println("Enter the seconnd number");
		b = scan.nextDouble();

		scan.close();

		System.out.println("The product of these numbers : " +(a*b));
	}
}