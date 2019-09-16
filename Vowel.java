class Vowel
{
	public static void main(String[] args)
	{
		String vov = "";
		java.util.Scanner scn = new java.util.Scanner(System.in);

		System.out.println("Please enter the string");
		vov = scn.nextLine();
		char vovels[] = vov.toCharArray();
		for (int i = 0; i<vovels.length;i++)
		{
			switch(vovels[i])
			{
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':
				{
					System.out.println("Vowel at index [" + i + "]");
					break;
				}
				default :
				{
					System.out.println("Consonants at index [" + i + "]");
					break;
				}
			}
		}
	}
}