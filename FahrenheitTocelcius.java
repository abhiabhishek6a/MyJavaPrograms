import java.util.Scanner;
public class FahrenheitTocelcius
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter any degree number: ");
		float fahrenheit = scan.nextInt();
		
		float celcius = (fahrenheit - 32) / (9f / 5);
		
		System.out.println("The coverted degree number is " +celcius);
	}
}