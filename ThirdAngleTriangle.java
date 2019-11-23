import java.util.Scanner;
public class ThirdAngleTriangle
{
	public static void main(String[]args)
	{
		int x, y, z;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the value of x: ");
		x = scan.nextInt();
		
		System.out.println("Enter the value of y: ");
		y = scan.nextInt();
		
		int SumOfAngles = x + y;
		
		int TotalAngle = 180;
		
		z = TotalAngle - SumOfAngles;
		
		System.out.println("The value of third angle is " +z);
		
		
		
	}
}