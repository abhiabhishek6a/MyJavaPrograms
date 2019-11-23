import java.util.Scanner;

class Palindrome
{
	public static void main(String[]args)
	{
		int num, reversedinteger = 0, remainder, originalInteger;
		originalInteger = num;

		Scanner scan = new Scanner(System.in);

		System.out.println(" Enter the number that you want to reverse: ");
		num = scan.nextInt();

		while( num != 0)
		{
			remainder = num % 10;
			reversedInteger = reversedInteger * 10 + remainder;
			num /= 10;
		}
		if (originalInteger == reversedInteger)
		{
			System.out.println(originalInteger + " is a palindrome ");
		}
		else
		{
			System.out.println(originalInteger + " is not a palindrome ");
		}
	}
}