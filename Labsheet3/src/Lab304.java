import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab304 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,###.00");
		
		System.out.print("Input price per unit : ");
		float price = scan.nextFloat();		
		System.out.print("Input number of unit : ");
		int unit = scan.nextInt();
		
		System.out.println("-------------------------");
		float total = price * unit;
		float discount = (total>=1000)? 10 : 5;
		
		System.out.println("Total price\t "+df.format(total)+" Baht.");
		total = total - (total*(discount/100.0f));
		System.out.println("Get discount\t "+discount+" %");
		System.out.println("Total price\t "+df.format(total)+" Baht.");
		
		
		

	}

}
