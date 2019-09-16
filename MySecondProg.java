class Greetings
{
	String msg = " Hi ! ";
}
class Test
{
	public static void main(String[] args)
	{
		Greetings g = new Greetings();
		System.out.println("Hello World"+g.msg);
	}
}