import java.text.DecimalFormat;
import java.util.Scanner;

public class Example304 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,###.00");
		
		System.out.print("Input mobile bill : ");
		float bill = scan.nextFloat();
		scan.nextLine();
		System.out.print("Input member type : ");
		String mem = scan.nextLine();
		
		System.out.println();
		
		char con_mem = mem.length()> 0? mem.charAt(0):'N';
		float total;

		
		if(con_mem == 'g' || con_mem == 'G') {
			System.out.println("Blue member get discount 5%");
			total = bill - (bill*5.0f/100);
			System.out.println("Amount to be paid "+df.format(total)+" Baht.");
		}
		else if(con_mem == 'b' || con_mem == 'B') {
			System.out.println("Blue member get discount 10%");
			total = bill - (bill*10.0f/100);
			System.out.println("Amount to be paid "+df.format(total)+" Baht.");
		}
		else {
			total = bill;
			System.out.println("Amount to be paid "+df.format(total)+" Baht.");
			
		}
		
		
		
		
		

	}

}
