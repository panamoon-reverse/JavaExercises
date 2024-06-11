import java.util.Scanner;

public class Lab301 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input exam score : ");
		float score = scan.nextFloat();
		
		System.out.println();
		String res = score>=50 ? "PASS" : "FAIL";
		System.out.println("The result is "+res);
	}

}
