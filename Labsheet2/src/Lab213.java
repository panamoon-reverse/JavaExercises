import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab213 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,###.00");
		
		System.out.print("Input product id : ");
		String id = scan.nextLine();
		System.out.print("Input product name : ");
		String name = scan.nextLine();
		System.out.print("Input product stock : ");
		int stock = scan.nextInt();
		System.out.print("Input product price : ");
		float price = scan.nextFloat();
		System.out.println("----------------------------------");
		System.out.println(id+" "+name);
		System.out.println(stock+" x "+df.format(price) +" = "+ df.format(stock*price)+" Baht.");
		System.out.println("----------------------------------");
		System.out.print("Input Discount (%) : ");
		float discount = scan.nextFloat();
		float total = (float) ((stock*price)-((stock*price)*(discount/100.0)));
		System.out.println("----------------------------------");
		System.out.println("Total Price = "+df.format(total)+" Baht.");
	}

}
