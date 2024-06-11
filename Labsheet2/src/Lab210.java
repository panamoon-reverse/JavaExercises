import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab210 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,###.00");
		
		System.out.println("---------------------------------------");
		System.out.println("\tCalculate your BMI");
		System.out.println("---------------------------------------");
		System.out.print("Input your height (cm.) : ");
		float h = scan.nextFloat();
		System.out.print("Input your weight (kg.) : ");
		float w = scan.nextFloat();
		System.out.println("---------------------------------------");
		h = h/100;
		System.out.println("Find BMI = "+df.format(w)+" / ("+df.format(h)+" x "+df.format(h)+")");
		float bmi = w/(h*h);
		System.out.println("\t = "+df.format(bmi));
	}

}
