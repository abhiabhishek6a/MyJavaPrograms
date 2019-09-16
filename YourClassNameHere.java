public class YourClassNameHere
{
	public static void main(String[] args)
   {
	  int a = 10;
	  int b = 20;
	  System.out.println("Before change a = "+a+"b = " + b);
	  int temp = a;
	  a = b;
	  b = temp;
	  System.out.println("Before change a = "+a+"b = " + b);
	}
}