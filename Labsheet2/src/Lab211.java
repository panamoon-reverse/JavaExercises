import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab211 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,###.000");
		
		System.out.print("Input radius : ");
		float r = scan.nextFloat();	
		System.out.println("-------------------------------");
		float sc = (float) ((Math.PI)*Math.pow(r, 2));
		float cf = (float) (2*Math.PI*r);
		float vr = (float) ((4.0/3)*Math.PI*Math.pow(r, 3));
		System.out.println("Circle area = "+df.format(sc));
		System.out.println("Circumferece = "+df.format(cf));
		System.out.println("volume round = "+df.format(vr));

	}

}
