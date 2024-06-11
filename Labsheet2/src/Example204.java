import java.util.Scanner;

public class Example204 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Input Student name : ");
		String name = scan.nextLine();
		System.out.print("Input birth year : ");
		int b_year = scan.nextInt();
		scan.nextLine(); // Consume the leftover newline character [fix by chatGPT]
		System.out.print("Input Student Grade : ");
		String grade = scan.nextLine();
		
		System.out.println("----------------------------------------");
		System.out.println("Name : "+name);
		System.out.println("Age : "+(2024-(b_year)+" (Born in "+b_year+")"));
		char con_grade = grade.length() > 0 ? grade.charAt(0):'N';
		System.out.println("Grade : "+con_grade);

	}

}
