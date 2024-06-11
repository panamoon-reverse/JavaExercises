import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab209 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,###.##");

		System.out.print("Input student id : ");
		String id = scan.nextLine();
		
		System.out.print("Input student's name : ");
		String name = scan.nextLine();
		
		System.out.print("Input mid-tern score : ");
		float mid_score = scan.nextFloat();
		
		System.out.print("Input final score : ");
		float final_score = scan.nextFloat();
		
		float total = mid_score + final_score;
		
		System.out.println("-----------------------------");
		System.out.println("STUDENT : "+name+" ("+id+")");
		System.out.println("Get score : "+df.format(total)+" ("+df.format(mid_score)+" + "+df.format(final_score)+")");

	}

}
