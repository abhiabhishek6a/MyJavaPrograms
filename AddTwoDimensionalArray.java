class AddTwoDimensionalArray
{
	public static void main(String[] args)
	{
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows = s.nextInt();
		System.out.println("Enter the number of columns");
		int columns = s.nextInt();
		int a[][] = new int[rows][columns];
		int b[][] = new int [rows][columns];
		System.out.println("Enter the first matrix");
		for (int i = 0; i<rows; i++)
		{
			for (int j = 0; j<columns; j++)
			{
				a[i][j] = s.nextInt();
			}
		}
		System.out.println("Enter the second matrix");
		for (int i = 0; i<rows; i++)
		{
			for (int j = 0; j<columns; j++)
			{
				b[i][j] = s.nextInt();
			}
		}
		int c[][] = new int[rows][columns];
		for (int i = 0; i<rows; i++)
		{
			for(int j = 0; j<columns; j++)
			{
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		System.out.println("The sum of two dimensional array matrix is");
		for (int i = 0; i<rows; i++)
		{
			for (int j = 0; j<columns; j++)
			{
				System.out.println(" " +c[i][j]);
			}
		}
		System.out.println();
	}
}