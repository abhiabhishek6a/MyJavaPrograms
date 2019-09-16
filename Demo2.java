class Demo2
{
	public static void main(String args[])
	{
		System.out.println("Hello World");  
		for(int i=0;i<args.length;i++)
		{
			boolean isPrime=true;
			int val=Integer.parseInt(args[i]);
			int one=0; 
			for(one =2; one < val; one++)
			{
				if(val % one ==0 )
				{
					isPrime=false;
					break;
				}
			}
			
			System.out.println(" prime : "+isPrime + " "+ val);
		}
	}
}