import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab208 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,###.0#");
		
		System.out.print("Number 1 : ");
		int a = scan.nextInt();
		System.out.print("Number 2 : ");
		int b = scan.nextInt();
		System.out.print("Number 3 : ");
		int c = scan.nextInt();
		System.out.println();
		float sum = a+b+c;
		float avg = sum/3;
		System.out.println("Summary of "+a+", "+b+" and "+c+" is " +sum);
		System.out.print("Average is "+df.format(avg));

	}

}
