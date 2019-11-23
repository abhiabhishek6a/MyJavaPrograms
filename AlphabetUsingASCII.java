public class AlphabetUsingASCII
{
	public static void main(String[]args)
	{
		
		System.out.println("All alphabets of ASCII value ");
		
		System.out.println();
		
		for ( char i = 0; i<=255; i++)
		{
			System.out.println();
			
			System.out.println("Alphabets of ASCII value of " +(int)i+ " = " +i);
		}
	}
}