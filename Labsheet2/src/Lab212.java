import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab212 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,###.00");
		
		System.out.print("Input employee salary : ");
		float sal = scan.nextFloat();
		System.out.println("---------------------------");
		System.out.println("Employee salary\t "+df.format(sal)+" Baht.");
		float soc = (3.0f/100)*sal;
		System.out.println("Social Security\t "+df.format(soc)+" Baht.");
		float tax = (4.0f/100)*sal;
		System.out.println("Tax\t\t "+df.format(tax)+" Baht.");
		System.out.println("---------------------------");
		float total = sal - soc - tax;
		System.out.println("Get salary \t"+df.format(total)+" Baht.");
	}

}
