public class SwapTwoVariablesWithoutThirdVariable
{
	public static void main(String[]args)
	{
		System.out.println("Before Swapping");
		
		int x = 10;
		int y = 20;
		
		System.out.println("Value of x: " +x);
		
		System.out.println("Value of y: " +y);
		
		System.out.println("After Swapping");
		
		x = x + y;
		y = x - y;
		x = x - y;
		
		System.out.println("Value of x: " +x);
		
		System.out.println("Value of y: " +y);
	}
}
