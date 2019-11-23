import java.util.Scanner;
public class PerimeterOfRectangle
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the length of the rectangle: ");
		int l = scan.nextInt();
		
		System.out.println("Enter the width of the rectangle: ");
		int w = scan.nextInt();
		
		int p = 2 * (l + w);
		
		System.out.println("The perimeter of the rectangle is " +p);
	}
}
