class VowelConsonant
{
	public static void main(String[] args)
	{
		String vov = "";
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Please enter the string");
		vov = sc.nextLine();
		char vovels[] = vov.toCharArray();

		for (int i = 0; i < vovels.length; i++)
		{
			switch(Character.toLowerCase(vovels[i]))
			{
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
				{
					System.out.println("Vowel at index [" + i + "]");
					break;
				}
				default :
				{
					System.out.println("Consonant at index [" + i +"]");
					break;r
				}
			}
		}
	}
}