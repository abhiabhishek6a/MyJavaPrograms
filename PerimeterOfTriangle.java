import java.util.Scanner;
public class PerimeterOfTriangle
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the first side of the triangle: ");
		int a = scan.nextInt();
		
		System.out.println("Enter the base of the triangle: ");
		int b = scan.nextInt();
		
		System.out.println("Enter the second side of the triangle: ");
		int c = scan.nextInt();
		
		int p = a + b + c;
		
		System.out.println("The perimeter of the triangle is " +p);
	}
}
