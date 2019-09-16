class TestBranch
{
	public static void main(String[] args)
	{
		String userName = "";
		String password = "";
		java.util.Scanner scn = new java.util.Scanner(System.in);
		System.out.println("Please entwr the username");
		userName = scn.nextLine();
		System.out.println("please entdr the password");
		password = scn.nextLine();
		//Short circuit Logical operator && // !
		if(userName.equals("admin")&& password.equals("123"))
		{
			System.out.println("login succeed");

		}
		else
		{
			System.out.println("Login failed");
		}
	}
}