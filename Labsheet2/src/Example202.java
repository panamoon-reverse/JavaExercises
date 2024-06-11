import java.text.DecimalFormat;

public class Example202 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,###.00");
		
		String product = "NB-001";
		String catagory = "Notebook";
		float price = 25000;
		double vat = 7.0/100;
		float total;
		
		System.out.println("Product\t: "+product+" ("+catagory+" Series)");
		System.out.println("Price\t: "+ df.format(price)+" Baht.");
		System.out.println("Add Vat\t: "+ df.format(vat*price)+" Baht.");
		System.out.println("Total\t: "+ df.format(price+(vat*price))+" Baht.");

	}

}
