import java.util.Scanner;
public class AreaOfEquilateralTriangle
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the value of side of the triangle: ");
		double a = scan.nextInt();
		
		double Area = (Math.sqrt(3)*(a*a))/4;
		
		System.out.println("The area of equilateral triangle is " +Area);
	}
}