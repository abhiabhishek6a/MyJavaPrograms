import java.util.Scanner;

public class Marks {

		public static void main(String[] args) {
		int com,math,science,eng,hindi;
		System.out.println("Enter the marks of Computer");
		Scanner sc = new Scanner(System.in);
		com = sc.nextInt();
		System.out.println("Enter the marks of Math");
		math = sc.nextInt();
		System.out.println("Enter the marks of Science");
		science = sc.nextInt();
		System.out.println("Enter the marks of English");
		eng = sc.nextInt();
		System.out.println("Enter the marks of Hindi");
		hindi = sc.nextInt();
		int percentage =(com+math+science+eng+hindi)/5;
		System.out.println("Percentage is : "+percentage);
		if(percentage>100||percentage<0)
		{
			System.out.println("You entered invalid marks");
		}
		switch(percentage/10){
		case 10:
		case 9:
		case 8:{
			
			System.out.println("Grade A");
			break;
		}
		case 7:
		case 6:{
			System.out.println("Grade B");
			break;
		}
		case 5:
		case 4:{
			System.out.println("Grade C");
			break;
		}
		case 3:
		case 2:
		case 1:
		case 0:{
			System.out.println("Grade D");
			break;
			}
		default:
			System.out.println("You entered invalid marks");
		}
	}
}