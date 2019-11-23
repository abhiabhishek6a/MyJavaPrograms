import java.util.Scanner;
public class AreaOfCircle
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the radius of the circle: ");
		int r = scan.nextInt();
		
		double Area = 3.14 * r * r;
		
		System.out.println("The area of the circle is " +Area);
	}
}