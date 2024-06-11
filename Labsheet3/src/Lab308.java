import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab308 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,###.00");
		
		System.out.print("Input employee mane : ");
		String name = scan.nextLine();
		System.out.print("Input sale per month : ");
		float sale = scan.nextFloat();
		
		System.out.println();
		
		float comm;
		if(sale>=50000 && sale<100000) {
			comm = (sale-50000)*(10.0f/100);
			System.out.println(name+" get commission "+df.format(comm)+" Baht.");
		}
		else if(sale >= 100000) {
			comm = (sale-100000)*(15.0f/100)+5000;
			System.out.println(name+" get commission "+df.format(comm)+" Baht.");
		}
		else {
			comm = 0;
			System.out.println("Sorry, "+name+". You don't get any commission.");
		}
		
		

	}

}
