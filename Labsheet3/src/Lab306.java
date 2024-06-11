import java.util.Scanner;

public class Lab306 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input exercise score : ");
		float ex = scan.nextFloat();
		System.out.print("Input mid-term score : ");
		float mid = scan.nextFloat();
		System.out.print("Input final score : ");
		float fin = scan.nextFloat();
		
		System.out.println();
		float total = ex+mid+fin;
		String grade;
		
		if(total>100) {
			grade = "Error";
		}
		else if (total>=80) {
			grade = "A";
		}
		else if (total>=75) {
			grade = "B+";
		}
		else if (total>=70) {
			grade = "B";
		}
		else if (total>=65) {
			grade = "C+";
		}
		else if (total>=60) {
			grade = "C";
		}
		else if (total>=55) {
			grade = "D+";
		}
		else if (total>=50) {
			grade = "D";
		}
		else if (total>=0) {
			grade = "F";
		}
		else {
			grade = "Error";
		}
		
		System.out.print("Your total score is "+total+", get grade "+grade);
	}

}
