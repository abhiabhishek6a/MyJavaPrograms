class ArraySorting
{
	public static void main(String[] args)
	{
		int[] array1 = {1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456};

		String[] array2 = { "Java", "Python", "C", "C++", "Html", "Spring"};

		System.out.println(" Original numeric arrays : "+	java.util.Arrays.toString(array1));
		java.util.Arrays.sort(array1);

		System.out.println(" Sorted numeric arrays : "+	java.util.Arrays.toString(array1));

		System.out.println(" Original String Arrays : "+java.util.Arrays.toString(array2));
		java.util.Arrays.sort(array2);

		System.out.println(" Sorted String arrays : "	+java.util.Arrays.toString(array2));
	}
}