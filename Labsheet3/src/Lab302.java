import java.time.Year;
import java.util.Scanner;

public class Lab302 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input your name : ");
		String name = scan.nextLine();
		System.out.print("Input birth year : ");
		int b_year = scan.nextInt();
		
		System.out.println();
		int year = Year.now().getValue();
		int age = year - b_year;
		String res;
		
		if(age >= 18) {
			res = "CAN";
		}
		else {
			res = "CANNOT";
		}
		System.out.println("Welcome, "+name+" ("+age+" year old)");
		System.out.println("Result : "+res+" VOTE");

	}

}
