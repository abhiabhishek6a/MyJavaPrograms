import java.util.Scanner;
class Adding
{
	public static void main(String[] args)
	{
		int num;
		System.out.println("Enter any number");
		Scanner sc = new Scanner(System.in);
		num= sc.nextInt();
		if(num%2==0)
		{
			System.out.println("The number is Even");
		}
		else
		{
			System.out.println("The number is odd");
		}
	}
}