import java.text.DecimalFormat;

public class Lab205 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,###.##");
		String id = "2013110032";
		int subject = 7;
		float price = 4500;
		float fee = 5000;
		float total = subject * price + fee;
		
		System.out.println("STUDENT ID : "+id);
		System.out.println("Enrollment "+subject+" subjects. ("+df.format(price)+" Baht./subject)");
		System.out.println("Total price = "+df.format(total)+" Baht.");
	}

}
