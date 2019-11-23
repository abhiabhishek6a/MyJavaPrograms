import java.util.Scanner;
public class ConversionToWeekMonthYear
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Days for conversion: ");
		int days = scan.nextInt();
		
		int weeks = days/7;
		int months = days/30;
		int years = days/365;
		
		System.out.println("Weeks = " +weeks);
		
		System.out.println("Months = " +months);
		
		System.out.println("Years = " +years);
	}
}