import java.util.Scanner;
public class CelciusToFahrenheit
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the fahrenheit degree number that you want to convert: ");
		float celcius = scan.nextInt();
		
		float fahrenheit = celcius * (9f /  5) + 32;
		
		System.out.println("The converted degree number of celcius to fahrenhiet is " +fahrenheit);
		
	}
}