public class ASCIIofAllCharacters
{
	public static void main(String[]args)
	{	
		System.out.println("The ASCII value of all characters");
		
		System.out.println();

		for (int i = 0; i<=255; i++)
		{
			System.out.println();
			System.out.println("The ASCII value of character " +(char)i+ " = " +i);
		}
	}
}