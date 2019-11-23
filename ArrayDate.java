class Date
{
	int day, month, year;
	public Date( int day, int month, int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public String toString()
	{
		return this.day+ "-" +this.month+ "-" +this.year;
	}
}
class ArrayDate
{
	public static void main(String[] args)
	{
		Date date[] = new Date[4];
		for (int i = 0; i<date.length; i++)
		{
			java.util.Scanner input = new java.util.Scanner(System.in);
			System.out.println("Please enter the date in DD-MM-YYYY format");
			String dateFormatted = input.nextLine();
			String dates[] = dateFormatted.split("-");
			if(dates.length==3)
			{
				date[i] = new Date(Integer.parseInt(dates[0]), Integer.parseInt(dates[1]), Integer.parseInt(dates[2]));
			}
			else
			{
				System.out.println("Invalid Date Provided");
			}
			for (Date d : date )
			{
				System.out.println(d);
			}
		}
	}
}