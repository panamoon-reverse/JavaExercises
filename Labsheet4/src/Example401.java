import java.text.DecimalFormat;
import java.util.Scanner;

public class Example401 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,###.00");
		
		System.out.print("Input value of N :");
		int n = scan.nextInt();
		
		while(n<=1) {
			System.out.println("N must be more than 1\n");
			System.out.print("Input value of N again :");
			n = scan.nextInt();
		}
		
		float sum = 0;
		for(int i = 0; i<=n ; i++) {
			sum += i;
		}
		System.out.print("Summary of 1 - "+n+" is "+df.format(sum));
		

	}

}
