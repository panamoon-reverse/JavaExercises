import java.text.DecimalFormat;

public class Lab206 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,###.00");
		String id = "BN-158";
		String product = "Notebook N-Series 7";
		int item = 3;
		float price =  17500.25f;
		
		System.out.println("Product ID = "+id);
		System.out.println("Product Name = "+product);
		System.out.println("----------------------");
		System.out.println("Item : "+item+" items");
		System.out.println("Price : "+df.format(price)+" Baht.");
		price = price * item;
		System.out.println("Total : "+df.format(price)+" Baht.");
		price = price + (price*(7.0f/100));
		System.out.println("----------------------");
		System.out.println("Vat 7% : "+df.format(price)+" Baht.");
		
		
		

	}

}
