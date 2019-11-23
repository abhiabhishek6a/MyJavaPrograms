class MulDimArray2
{
	public static void main(String[] args)
	{
		int[][] a = { { 1, 2, 3}, {4, 5, 6, 7}, {8} };

		for ( int[] innerArray: a)
		{
			for ( int data: innerArray)
			{
				System.out.println(data);
			}
		}
	}
}