import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab303 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,###.00");
		
		System.out.print("Input the number of customer : ");
		int cus = scan.nextInt();
		
		final float price = 399;
		float discount = 0.0f;;
		
		if(cus>=7) {
			discount = 10.0f/100;
		}
		
		float total = (cus * price)-((cus * price)* discount);
		System.out.println();
		System.out.print("Amount to be paid is "+df.format(total)+" Baht.");
		

	}

}
