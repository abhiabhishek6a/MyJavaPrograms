import java.util.Scanner;
public class ConversionCentimeterToMeterAndKelometer
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter centimeter value: ");
		int centimeter = scan.nextInt();
		
		int meter = centimeter/100;
		int kilometer = centimeter/100000;
		
		System.out.println("The converted value to meter is " +meter);
		
		System.out.println("The converted value to kilometer is " +kilometer);
	}
}