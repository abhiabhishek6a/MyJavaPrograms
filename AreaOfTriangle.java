import java.util.Scanner;
public class AreaOfTriangle
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the height of the triangle: ");
		double h = scan.nextInt();
		
		System.out.println("Enter the base of the triangle: ");
		double b = scan.nextInt();
		
		double Area = (h*b)/2;
		
		System.out.println("The Area of the triangle is " +Area);
	}
}