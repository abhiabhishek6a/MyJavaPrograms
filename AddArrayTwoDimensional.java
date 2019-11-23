class AddArrayTwoDimensional
{
	public static void main(String[] args)
	{
		int rows = 3, columns = 3;
		int[][] = firstMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int[][] = secondMatrix = {{10, 11, 12}, {13, 14, 15}, {16, 17, 18}};

		int[][] sum = new int[rows][columns];
		for (int i = 0; i < rows; i++)
		{
			for (int j = 0; j < columns; j++)
			{
				sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
			}
		}
		System.out.println("The sum of two array matrices");
		for (int[] row : sum)
		{
			for (int column : row)
			{
				System.out.println(column + "    ");
			}
			System.out.println( );
		}
	}
}