import java.util.Scanner;
public class AreaOfRectangle
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the width of rectangle: ");
		int w = scan.nextInt();
		
		System.out.println("Enter the length of rectangle: ");
		int l = scan.nextInt();
		
		int Area = w * l;
		
		System.out.println("The area of rectangle is " +Area);
	}
}